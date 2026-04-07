# <p align="center"><img src="https://raw.githubusercontent.com/safevoice009/podcards-ai-engine/main/docs/assets/icon.png" width="128"><br>PodCards AI Engine</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen.svg" alt="Platform">
  <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License">
  <img src="https://img.shields.io/badge/Status-Beta-orange.svg" alt="Status">
  <img src="https://img.shields.io/github/v/release/safevoice009/podcards-ai-engine" alt="Release">
</p>

**PodCards** is a revolutionary open-source study engine that transforms your Anki flashcards into interactive, AI-powered audio sessions. Study hands-free while walking, commuting, or relaxing.

---

## ✨ Features

- 🎙️ **Voice Interaction**: Grade your cards using your voice.
- 🤖 **On-Device AI**: Powered by **Whisper.cpp** (STT) and **Piper** (TTS) for maximum privacy and speed.
- 📴 **Fully Offline**: No internet required once models are downloaded.
- ⚡ **Seamless Anki Sync**: Integrates directly with your existing Anki database.
- 🎧 **Interactive Audio**: Feels like a real conversation with your study materials.

## 🚀 Quick Start

### 1. Download the App
Grab the latest APK from the [Releases](https://github.com/safevoice009/podcards-ai-engine/releases) page.

### 2. Model Setup
To keep the repository lightweight, AI models are managed separately. Follow these steps:

1. **Download Whisper Model**: [ggml-tiny.en.bin](https://huggingface.co/ggerganov/whisper.cpp/resolve/main/ggml-tiny.en.bin)
2. **Download Piper Model**: [en_US-lessac-low.onnx](https://huggingface.co/rhasspy/piper-voices/resolve/v1.0.0/en/en_US/lessac/low/en_US-lessac-low.onnx)
3. **Place Files**: Copy both files into your device's internal storage at:
   `Android/data/com.antigravity.podcards/files/models/`
   *(Alternatively, for developers, place them in `app/src/main/assets/models/` before building).*

---

## 🛠️ Tech Stack

- **Kotlin & Jetpack Compose**: Modern Android UI.
- **Whisper.cpp**: High-performance C++ implementation of OpenAI's Whisper.
- **Piper TTS**: Fast, local text-to-speech.
- **SQLite**: Direct Anki database interaction.

---

## 🤝 Contributing

We welcome contributions! Please see our [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines on how to get involved.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<p align="center">Made with ❤️ for the Anki Community</p>
