# <p align="center"><img src="https://raw.githubusercontent.com/safevoice009/podcards-ai-engine/main/docs/assets/icon.png" width="160"><br>PodCards: The Ultimate Anki Audio Companion</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen.svg?style=for-the-badge&logo=android" alt="Platform">
  <img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" alt="License">
  <img src="https://img.shields.io/badge/Status-Beta-orange.svg?style=for-the-badge" alt="Status">
  <img src="https://img.shields.io/github/v/release/safevoice009/podcards-ai-engine?style=for-the-badge" alt="Release">
</p>

**PodCards** is a premium open-source study engine that transforms your **Anki** flashcards into interactive, AI-powered audio sessions. Designed for high-performance students, it allows you to master your decks hands-free—whether you're at the gym, commuting, or doing chores.

---

## 🧠 Why PodCards for Anki?

Anki users spend hours every day on "Active Recall." PodCards extends your study time into "dead time" by turning flashcards into a podcast-like experience where *you* are the guest.

- **Convert Decks to Dialogues**: The engine intelligently parses your Front/Back cards into natural speech.
- **Voice-Driven Grading**: Respond to the AI to grade your cards (Again, Hard, Good, Easy) without touching your screen.
- **Enhanced Privacy**: Your Anki database never leaves your device. All AI processing is 100% local.

---

## ✨ Premium Features

- 🎙️ **Natural Voice Interaction**: High-fidelity local STT for card grading.
- 🤖 **On-Device Neural Engine**: Powered by **Whisper.cpp** (STT) and **Piper** (TTS).
- 📴 **100% Offline Capability**: No cloud dependencies or subscription fees.
- ⚡ **Direct Anki Integration**: Works seamlessly with AnkiDroid's database format.
- 🎨 **Modern Glassmorphic UI**: A stunning, gesture-based interface for a premium feel.

---

## 🚀 Quick Start

### 1. Download the App
Grab the latest APK from the [Releases](https://github.com/safevoice009/podcards-ai-engine/releases) page.

### 2. Model Setup
To keep the repository specialized, AI models are managed separately:

1. **Download Whisper Model**: [ggml-tiny.en.bin](https://huggingface.co/ggerganov/whisper.cpp/resolve/main/ggml-tiny.en.bin)
2. **Download Piper Model**: [en_US-lessac-low.onnx](https://huggingface.co/rhasspy/piper-voices/resolve/v1.0.0/en/en_US/lessac/low/en_US-lessac-low.onnx)
3. **Place Files**: Copy both models to:
   `/Android/data/com.antigravity.podcards/files/models/`

---

## 🗺️ Roadmap

- [ ] **Voice Card Creation**: Add new Anki cards just by speaking.
- [ ] **Personalized AI Personalities**: Custom voices for different study subjects.
- [ ] **Gamification**: Audio-based streaks and rewards.

---

## 🛠️ Tech Stack

- **Kotlin & Jetpack Compose**: Reactive Android development.
- **Whisper.cpp**: Lightweight OpenAI Whisper implementation.
- **Piper TTS**: ultra-fast, local speech synthesis.
- **Room/SQLite**: High-speed database syncing.

---

## 🤝 Community

We're building the future of audio-based learning. 

- **Contributing**: Check out [CONTRIBUTING.md](CONTRIBUTING.md).
- **Security**: See [SECURITY.md](SECURITY.md) for vulnerability reporting.
- **Conduct**: We follow the [Contributor Covenant](CODE_OF_CONDUCT.md).

---

<p align="center">Developed with ❤️ for the Global Anki Community</p>
