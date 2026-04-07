package com.ichi2.anki.api

object Basic2Model {
    val FIELDS: Array<String> = arrayOf("Front", "Back")
    val CARD_NAMES: Array<String> = arrayOf("Card 1 (Front -> Back)", "Card 2 (Back -> Front)")
    val QFMT: Array<String> = arrayOf("{{Front}}", "{{Back}}")
    val AFMT: Array<String> = arrayOf("{{Front}}<hr id=answer>{{Back}}", "{{Back}}<hr id=answer>{{Front}}")
}
