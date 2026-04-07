package com.ichi2.anki.api

import android.content.ContentValues
import android.content.Context
import android.net.Uri

class AddContentApi(val context: Context) {
    private val resolver = context.contentResolver

    fun addNewBasicModel(name: String): Long? {
        return addNewCustomModel(name, BasicModel.FIELDS, BasicModel.CARD_NAMES, BasicModel.QFMT, BasicModel.AFMT, null, null, null)
    }

    fun addNewBasic2Model(name: String): Long? {
        return addNewCustomModel(name, Basic2Model.FIELDS, Basic2Model.CARD_NAMES, Basic2Model.QFMT, Basic2Model.AFMT, null, null, null)
    }

    fun addNewCustomModel(
        name: String,
        fields: Array<String>,
        cards: Array<String>,
        qfmt: Array<String>,
        afmt: Array<String>,
        css: String?,
        did: Long?,
        sortf: Int?
    ): Long? {
        val values = ContentValues()
        values.put("name", name)
        values.put("field_names", fields.joinToString("\u001f"))
        values.put("num_cards", cards.size)
        if (css != null) values.put("css", css)
        if (did != null) values.put("deck_id", did)
        if (sortf != null) values.put("sort_field_index", sortf)
        
        val uri = Uri.parse("content://com.ichi2.anki.flashcards/models")
        val modelUri = resolver.insert(uri, values) ?: return null
        return modelUri.lastPathSegment?.toLongOrNull()
    }

    fun addNote(mid: Long, did: Long, fields: Array<String>, tags: Set<String>?): Long? {
        val values = ContentValues()
        values.put("model_id", mid)
        values.put("deck_id", did)
        values.put("field_values", fields.joinToString("\u001f"))
        if (tags != null) values.put("tags", tags.joinToString(" "))
        
        val uri = Uri.parse("content://com.ichi2.anki.flashcards/notes")
        val noteUri = resolver.insert(uri, values) ?: return null
        return noteUri.lastPathSegment?.toLongOrNull()
    }

    fun addMediaFromUri(fileUri: Uri, preferredName: String, mimeType: String): String? {
        val values = ContentValues()
        values.put("file_uri", fileUri.toString())
        values.put("preferred_name", preferredName.replace(" ", "_"))
        
        val uri = Uri.parse("content://com.ichi2.anki.flashcards/media")
        val mediaUri = resolver.insert(uri, values) ?: return null
        return mediaUri.lastPathSegment
    }

    fun getDeckList(): Map<Long, String>? {
        val uri = Uri.parse("content://com.ichi2.anki.flashcards/decks")
        val cursor = resolver.query(uri, null, null, null, null)
        val decks = mutableMapOf<Long, String>()
        cursor?.use {
            val idIndex = it.getColumnIndex("deck_id")
            val nameIndex = it.getColumnIndex("deck_name")
            while (it.moveToNext()) {
                val id = it.getLong(idIndex)
                val name = it.getString(nameIndex) ?: "Unknown"
                decks[id] = name
            }
        }
        return if (decks.isEmpty()) null else decks
    }
}
