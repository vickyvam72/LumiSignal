<div align="center">

# ✦ LumiSignal ✦

### Buy-signal radar for Indonesia Stock Exchange (IDX) stocks, on Android

*Top 5 stocks every trading day at 17:00 WIB · ready-made entry, TP & SL · results audited automatically*

[![Release](https://img.shields.io/github/v/release/vickyvam72/LumiSignal?label=release&color=2F6BFF&style=for-the-badge)](https://github.com/vickyvam72/LumiSignal/releases/latest)
[![Android](https://img.shields.io/badge/Android-8.0%2B-3DDC84?style=for-the-badge&logo=android&logoColor=white)](#-requirements)
[![Kotlin](https://img.shields.io/badge/Kotlin-Jetpack%20Compose-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](#%EF%B8%8F-tech-stack)
[![License](https://img.shields.io/badge/license-GPL--3.0-blue?style=for-the-badge)](LICENSE)
[![IDX](https://img.shields.io/badge/market-IDX%20%2F%20BEI-E53935?style=for-the-badge)](#-why-lumisignal)

**🌐 Bahasa / Language:** &nbsp; [🇮🇩 Bahasa Indonesia](README.md) &nbsp;|&nbsp; **🇬🇧 English**

[⬇️ Download](#%EF%B8%8F-download--install) · [📸 Screenshots](#-screenshots) · [✨ Features](#-features) · [📖 Guide](#-how-to-use) · [❓ FAQ](#-faq--troubleshooting) · [📝 Changelog](CHANGELOG.md)

</div>

---

## 🌟 Why LumiSignal?

> **Lumi Signal IDX** scans the close of every IDX stock each trading day and serves the **Top 5 stocks to buy in the next session**, with a buy limit, take profit, and stop loss. Every signal is then **audited automatically against real prices** until it hits TP or SL, so you see real results.

| | |
|---|---|
| 🕔 **Signals at 17:00 WIB** | Tomorrow's buy signals appear on Home by themselves, with a **notification**. No need to screen again. |
| 🚀 **High Profit & 🎯 High Win-rate** | Two signal types on one page: big upside targets, or small targets that are hit more often. |
| 📐 **Ready-made entry, TP & SL** | Maximum buy price, take profit, and stop loss, rounded to **IDX price ticks**. |
| 🔍 **Automatic audit** | Every signal goes into **Strategy History** and is checked every minute while the app is open during market hours, about every 15 minutes in the background. |
| 💼 **Personal portfolio** | Mark the stocks you actually bought. TP and SL are recalculated from your own buy price. |
| 🧪 **Monthly backtest** | Strategy results since October 2025, **growing every day** with new trades that hit TP or SL. |
| 📊 **Stock check** | Analyse one stock: entry plan, TP & SL, **2 supports & 2 resistances**, and a chart. |
| 🖼️ **Shareable reports** | Share signals, history, or backtests as clean **images**, split into pages when long. |
| 🔒 **Read-only** | The Stockbit account is only used to read prices. The app **never places orders**. |

---

## 📸 Screenshots

<div align="center">

| 🏠 Home | 🖼️ Share as images |
|:-:|:-:|
| <img src="docs/screenshots/beranda.png" width="250" alt="Lumi Signal IDX home"> | <img src="docs/screenshots/bagikan-sinyal.png" width="250" alt="Shared signal image"> |
| **Open the app, the signals are already waiting.** Tomorrow's Top 5 High Profit and High Win-rate stocks, with **buy limit, TP, and SL**. Arrives every day at **17:00 WIB**. | **One tap, ready to send.** Buy date, entry, TP, SL, and **why the stock made the radar**, neatly in one image for your group or friends. |

| 📡 First screening | 📜 History |
|:-:|:-:|
| <img src="docs/screenshots/screening-pertama.png" width="250" alt="First screening"> | <img src="docs/screenshots/riwayat.png" width="250" alt="Strategy History"> |
| **Only once, ever.** The radar spins while checking that Stockbit is connected, the background audit is on, and **data for hundreds of stocks has arrived**. | **Proof, not promises.** Every signal is audited against **real prices** until it hits TP or SL. Win-rate and cumulative P/L, exactly as they are. |

| 📊 Stock check | 🧪 Backtest |
|:-:|:-:|
| <img src="docs/screenshots/cek-saham.png" width="250" alt="Stock check"> | <img src="docs/screenshots/backtest.png" width="250" alt="Monthly backtest"> |
| **Curious about one stock?** Type its ticker for an entry, TP & SL plan, plus **2 supports and 2 resistances** right on the chart. | **Test the strategy before you trust it.** Results for every month since October 2025, **growing by itself every day** with finished trades. |

</div>

*The app's interface is in Bahasa Indonesia.*

---

## ✨ Features

### 🏠 Home
- **"Buy signal for [date]"**: always the buy date, never the closing date, so nobody buys on the wrong day
- **HIGH PROFIT** and **HIGH WIN-RATE** with bold coloured headers, each with its Top 5 stocks
- Each stock: ticker, strategy, **BUY ≤**, **TP**, **SL**, a **share** button, and **Add to Portfolio**
- A **"Refreshed daily at 17:00 WIB"** reminder and a market-condition card
- **Share** all of the day's signals in one image

### 🔔 Automatic every trading day
- At **17:00 WIB** the app fetches the new signals, **adds them to Strategy History**, and sends a **notification**
- Prices are audited with real daily highs & lows: **every minute** while the app is open in market hours, about **every 15 minutes** in the background
- Notifications when a price touches **entry, TP, or SL**
- **The Stockbit token is renewed automatically every day**

### 📜 History
- **Strategy History**: every signal since the app was installed, with totals, holds, TP, SL, win-rate, and **cumulative P/L**
- **Portfolio History**: the stocks you marked yourself
- Each card shows **SIGNAL FOR › BUY › SELL › HOLD**, plus entry, TP, and SL

### 🧪 Backtest
- Pick a month from **October 2025** to the current month
- Trades, TP, SL, cumulative P/L, and the list of stocks
- **Grows every day** with live trades that hit TP or SL

### 📊 Stock check
- Type a ticker to see an **entry, TP & SL** plan
- **2 supports and 2 resistances** drawn on the chart
- Shows whether the stock is in today's Top 5
- **Add to Portfolio** button

### 🖼️ Share as images
| What | Contents |
|---|---|
| One signal | Buy date, ticker, entry, TP, SL, and **why it made the radar** |
| All of today's signals | High Profit & High Win-rate in one image |
| One history entry | Ticker, entry, TP, SL, **P/L**, buy date & sell date |
| Strategy History report | Pick **from date – to date**: total trades, TP, SL, cumulative P/L, and a table of ticker · buy · sell · hold · TP · SL · P/L |
| Portfolio report | Every portfolio position, same format |
| Backtest report | Pick **one month**, same format |

Everything is shared **as images only**, with no extra text. Long reports are split into several pages automatically.

---

## ⬇️ Download & Install

1. Open the **[Releases](https://github.com/vickyvam72/LumiSignal/releases/latest)** page.
2. Under **Assets**, download `LumiSignalIDX-v2.0.apk`.
3. Open the downloaded file. If Android asks, allow **"Install unknown apps"** for your browser or file manager.
4. Tap **Install**. Done! 🎉

> 💡 **Updating:** install the new APK over the old one. Your login, history, and portfolio stay.

### 📋 Requirements
- Android **8.0 (API 26)** or newer
- A **Stockbit** account (read-only use)
- Internet connection

---

## 📖 How to Use

### 0️⃣ First launch
1. **Log in to Stockbit** on Stockbit's own login page. The token is kept **only on your phone**.
2. **One more step** (fits on one screen): allow **notifications**, exclude Lumi from the **battery saver**, and open **Autostart** (Xiaomi, Oppo, Vivo, Realme, Infinix).
3. **Start Screening** (only once): a radar animation while the app checks Stockbit, the background audit, and the stock data. Tap **See Buy Signals**.

From then on, Home always shows the latest buy signals.

### 1️⃣ Reading a signal
- **BUY ≤ 84** means buy at the open if it is ≤ 84; if it opens higher, queue a buy at 84. The order is valid for **one session**; if it does not fill, the signal is **cancelled**.
- **TP** and **SL** are recalculated from the real buy price.
- Stocks still being held are not recommended again.

### 2️⃣ Add to Portfolio
Tap **+ Add to Portfolio** on a stock card. Enter your buy price if you already bought, and TP and SL are calculated from it.

### 3️⃣ Sharing reports
- **One stock:** tap the share icon on its card.
- **Strategy History:** tap **Share**, then choose **from date** and **to date**.
- **Portfolio:** tap **Share all**.
- **Backtest:** tap **Share** next to the title, then pick a month.

---

## ❓ FAQ & Troubleshooting

<details>
<summary><b>The 17:00 notification is late or missing</b></summary>

Make sure notifications are allowed, Lumi is excluded from the battery saver, and **Autostart** is on (Account → **Open Autostart**). On Android 14 and newer, also turn on **Settings → Apps → Lumi Signal IDX → "Alarms & reminders"** for an on-time notification; without it, it can be up to about 15 minutes late.
</details>

<details>
<summary><b>Why does it say "Waiting for entry" or "Cancelled"?</b></summary>

**Waiting for entry** means the buy session has not started yet. **Cancelled** means the price never came down to the buy limit during that session, so the order did not fill. Cancelled signals count as neither a win nor a loss.
</details>

<details>
<summary><b>No new signals today</b></summary>

There is no new close on exchange holidays. In weak markets the strategies may also find no stock that qualifies. That is normal.
</details>

<details>
<summary><b>Can the app buy stocks for me?</b></summary>

No. Lumi Signal IDX **only reads data** and **never places orders**. Every trading decision is yours.
</details>

---

## 🔒 Privacy

- ✅ **No** ads, analytics, or third-party trackers
- ✅ The Stockbit token stays **on your phone** and is never sent to another server
- ✅ **Read-only** access: no orders, no fund transfers
- ℹ️ Signal and backtest data are downloaded from a public GitHub repository

---

## 🛠️ Tech Stack

| Part | Technology |
|---|---|
| Language | **Kotlin** |
| UI | **Jetpack Compose**, Material 3 |
| Background | **WorkManager** (audit every ~15 min) and **AlarmManager** (17:00 WIB signals) |
| Networking | OkHttp, kotlinx.serialization |
| Radar engine | **Python** (pandas, NumPy) on GitHub Actions every trading day |
| Report images | Android Canvas, shared through FileProvider |
| Testing | Robolectric + Roborazzi (screenshot of every screen) |
| CI/CD | GitHub Actions: every push builds and releases the APK |

### 🏗️ Build from source
```bash
git clone https://github.com/vickyvam72/LumiSignal.git
cd LumiSignal
gradle :app:assembleRelease   # Gradle 8.11.1, JDK 17
```
The APK is in `app/build/outputs/apk/release/`.

> 🔐 Release builds are signed with a private key stored in **GitHub Actions Secrets** (`LUMI_KEYSTORE_BASE64`, `LUMI_KEYSTORE_PASSWORD`). The key is never stored in the repo. For local builds, put your own keystore at `keystore/lumisignal.jks` and set `LUMI_KEYSTORE_PASSWORD`.

---

## 🙏 Thank You

LumiSignal stands on the shoulders of these services, open-source projects, and people. **Thank you so much!** 💖

### 📈 Data & market
| For | Thanks to |
|---|---|
| Daily price data for the radar engine | [**TradingView**](https://www.tradingview.com) |
| Live prices for auditing signals and portfolio | [**Stockbit**](https://stockbit.com) |
| Price tick and trading session rules | [**Indonesia Stock Exchange**](https://www.idx.co.id) |

### 📚 Libraries & tools
[Jetpack Compose](https://developer.android.com/jetpack/compose) · [AndroidX WorkManager](https://developer.android.com/topic/libraries/architecture/workmanager) · [Navigation Compose](https://developer.android.com/jetpack/compose/navigation) · [OkHttp](https://github.com/square/okhttp) · [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) · [Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines) · [pandas](https://github.com/pandas-dev/pandas) · [NumPy](https://github.com/numpy/numpy) · [websocket-client](https://github.com/websocket-client/websocket-client) · [Robolectric](https://github.com/robolectric/robolectric) · [Roborazzi](https://github.com/takahirom/roborazzi) · [GitHub Actions](https://github.com/features/actions)

### 🔤 Fonts
[Plus Jakarta Sans](https://github.com/tokotype/PlusJakartaSans) by Tokotype · [Space Grotesk](https://github.com/floriankarsten/space-grotesk) by Florian Karsten (SIL Open Font License)

### 💬 And you
Thank you to everyone who tried, tested, gave feedback on, and shared LumiSignal. Every bug report and idea makes the app better. 🙌

> These services and projects are not affiliated with LumiSignal. All trademarks and credit for their work belong to their respective owners.

---

## ⚖️ Disclaimer

LumiSignal is an independent project for **personal and educational use**.
LumiSignal is **not investment advice** and is **not affiliated with, endorsed by, or sponsored by Stockbit, TradingView, or the Indonesia Stock Exchange**.
Backtests and history do not guarantee future results. Stock prices go up and down; always use a stop loss, size your positions, and make your own decisions. Use at your own risk and in line with each data provider's terms of service.

## 📄 License

Copyright © 2026 **vickyvam72**.

LumiSignal is free and open-source software, released under the **[GNU General Public License v3.0](LICENSE)**.
You may use, study, change, and redistribute LumiSignal, provided derivative versions are released under the same license (GPL-3.0) with their source code kept open.
LumiSignal comes **with no warranty of any kind**. See [LICENSE](LICENSE) for the full text.

<div align="center">

---

Made with ❤️ in Indonesia · If you like LumiSignal, leave a ⭐

</div>
