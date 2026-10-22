<div align="center">

# 📝 Catatan Perubahan · Changelog

**🌐 Bahasa / Language:** ketuk bagian di bawah untuk membuka / tap a section below to expand it

[⬅️ README (ID)](README.md) · [⬅️ README (EN)](README.en.md)

</div>

---

## ✦ v2.2 — 21 Oktober 2026 / 21 October 2026

> 🌐 **Pilih bahasa / Choose your language** — ketuk salah satu untuk membuka / tap a section to expand it.

<details open>
<summary><h2>🇮🇩 Bahasa Indonesia</h2></summary>

### ⚡ Peningkatan

- **Beranda jadi daftar saham pantauan**: entry, TP, dan SL tidak lagi ditampilkan di Beranda. Angka itu baru muncul di **Riwayat Strategi begitu saham benar-benar terbeli**, jadi harga di Beranda dan Riwayat tidak pernah berbeda lagi
- **Notifikasi saat terbeli**: "✅ SMGA terbeli di 82", lengkap dengan **entry, TP, dan SL**. Notifikasi TP dan SL juga menyertakan entry
- **Notifikasi saham pantauan tepat pukul 17.00 WIB**: mesin radar di server kini berjalan tepat setelah bursa tutup, tidak lagi tertunda sampai malam
- **Audit harga tiap 1 menit selama jam bursa, juga saat aplikasi ditutup**, tanpa bunyi dan tanpa ikon di status bar. Audit mulai otomatis pukul 08.50 WIB dan berhenti sendiri setelah bursa tutup
- Notifikasi hanya untuk hal penting: saham pantauan baru (17.00), saham terbeli (entry, TP & SL), kena TP, dan kena SL
- **Rekap harian setelah pasar tutup**: berapa saham hold, kena TP, kena SL, dan akumulasi P/L untuk Riwayat Strategi dan Porto
- Tombol **Porto** kini ada di bagian atas: di kartu saham Beranda, di kartu Riwayat Strategi (baris tombol sendiri, kode saham tidak lagi terpotong), di halaman detail saham dari Beranda maupun Riwayat, dan di Cek Saham (bersama tombol Bagikan)
- **Bagikan hasil Cek Saham** sebagai gambar: harga, area beli, TP, SL, 2 support & 2 resistance, dan chart 60 sesi
- Laporan **Riwayat** dan **Backtest** yang dibagikan kini punya kolom **ENTRY** dan kotak **HOLD** (berapa saham masih dipegang)
- Gambar saham pantauan yang dibagikan kini fokus pada tanggal beli, kode saham, dan alasan masuk radar
- Halaman izin menambahkan **Alarm tepat waktu** (Android 12 ke atas) supaya notifikasi 17.00 dan audit 08.50 tepat waktu

### 🐞 Perbaikan
- Harga entry, TP, dan SL di Beranda tidak lagi berbeda dengan yang tercatat di Riwayat
- Notifikasi saham pantauan tidak lagi baru muncul sekitar pukul 22.00: server kini punya "jam" sendiri dan tidak bergantung pada jadwal GitHub yang sering terlambat
- Sinyal untuk sesi berikutnya tidak lagi tertinggal di tanggal hari ini pada malam hari
- Urutan saham di Riwayat kini sama dengan urutan Top 5 di Beranda
- Kartu Riwayat Portofolio tidak lagi punya ruang kosong di tengah
- Saham tidak lagi dianggap terbeli sebelum pasar buka: audit hanya memakai harga yang benar-benar tertransaksi (ada volume) sejak pukul 09.00

</details>

<details>
<summary><h2>🇬🇧 English</h2></summary>

### ⚡ Improvements

- **Home is now a watchlist**: entry, TP, and SL are no longer shown on Home. They appear in **Strategy History once the stock is actually bought**, so Home and History never show different prices again
- **Notification when bought**: "✅ SMGA bought at 82", with **entry, TP, and SL**. TP and SL notifications include the entry too
- **Watchlist notification right at 17:00 WIB**: the server radar now runs right after the close instead of being delayed until the evening
- **Price audit every minute during market hours, even with the app closed**, silent and without a status-bar icon. It starts at 08:50 WIB and stops by itself after the close
- Notifications only for what matters: new watchlist (17:00), bought (entry, TP & SL), TP hit, and SL hit
- **Daily recap after the close**: holds, TP, SL, and cumulative P/L for Strategy History and Portfolio
- The **Portfolio** button is now at the top: on Home stock cards, Strategy History cards (own button row, tickers no longer cut), the stock detail page from Home and History, and Stock check (next to Share)
- **Share a stock check** as an image: price, buy area, TP, SL, 2 supports & 2 resistances, and a 60-session chart
- Shared **History** and **Backtest** reports now have an **ENTRY** column and a **HOLD** tile (stocks still held)
- Shared watchlist images now focus on the buy date, ticker, and why the stock made the radar
- The permission screen adds **On-time alarms** (Android 12+) so the 17:00 notification and the 08:50 audit start on time

### 🐞 Fixes
- Entry, TP, and SL on Home no longer differ from what History records
- The watchlist notification no longer arrives around 22:00: the server now keeps its own clock instead of relying on GitHub’s often-late schedule
- Signals for the next session no longer stay on today’s date in the evening
- Stocks in History are now in the same order as the Top 5 on Home
- Portfolio History cards no longer have an empty gap in the middle
- A stock is no longer marked bought before the market opens: the audit only uses prices that actually traded (with volume) from 09:00

</details>

---

## ✦ v2.0 — 15 Oktober 2026 / 15 October 2026

> 🌐 **Pilih bahasa / Choose your language** — ketuk salah satu untuk membuka / tap a section to expand it.

<details>
<summary><h2>🇮🇩 Bahasa Indonesia</h2></summary>

### ⚡ Peningkatan

- **Beranda baru**: sinyal beli untuk sesi berikutnya langsung tampil, Profit Tinggi dan Winrate Tinggi dalam satu halaman dengan judul berwarna mencolok
- **Sinyal otomatis setiap hari bursa pukul 17.00 WIB**: notifikasi, Beranda, dan Riwayat Strategi diperbarui bersamaan
- **Screening pertama cukup sekali**: animasi radar sambil memeriksa Stockbit, audit latar belakang, dan kelengkapan data saham
- Semua tanggal ditampilkan sebagai **tanggal beli**, bukan tanggal closing, supaya tidak salah paham
- Entry, TP, dan SL mengikuti **fraksi harga BEI** dan dihitung ulang dari harga beli sebenarnya
- **Tambahkan ke Porto** langsung dari kartu saham di Beranda
- **Cek Saham**: rencana entry, TP & SL, 2 support & 2 resistance di chart
- **Backtest per bulan** sejak Oktober 2025, bertambah otomatis setiap hari dengan transaksi yang sudah kena TP atau SL
- **Bagikan sebagai gambar**: satu sinyal (dengan alasan masuk radar), semua sinyal hari itu, satu riwayat, laporan Riwayat Strategi per rentang tanggal, laporan Portofolio, dan laporan Backtest per bulan. Laporan panjang otomatis dipecah menjadi beberapa halaman
- Riwayat Strategi dan Portofolio menampilkan total, hold, TP, SL, winrate, dan akumulasi P/L
- Audit harga **tiap menit** saat aplikasi terbuka di jam bursa, sekitar 15 menit sekali di latar belakang
- **Token Stockbit diperbarui otomatis setiap hari**
- Halaman izin **"Satu langkah lagi"** pas satu layar, dengan tombol **Autostart / Mulai otomatis** yang langsung membuka daftar autostart HP (Xiaomi, Oppo, Vivo, Realme, Infinix, dan lainnya)
- Tombol reset Riwayat Strategi dan Riwayat Portofolio di menu Akun

### 🐞 Perbaikan
- Harga terakhir dan P/L posisi Porto kini langsung memakai harga live, juga untuk posisi yang ditambahkan setelah bursa tutup
- Kolom JUAL kini menampilkan "–" selama saham belum dijual
- Angka di daftar sinyal tidak lagi mencampur kenaikan hari closing dengan P/L posisi
- Grafik candle tidak lagi tertutup label harga
- Saham yang masih dipegang tidak direkomendasikan ulang
- Sinyal yang sudah terbit tidak berubah lagi walau server menjalankan ulang screening

</details>

<details>
<summary><h2>🇬🇧 English</h2></summary>

### ⚡ Improvements

- **New Home**: buy signals for the next session shown right away, High Profit and High Win-rate on one page with bold coloured headers
- **Automatic signals every trading day at 17:00 WIB**: notification, Home, and Strategy History update together
- **First screening only once**: a radar animation while the app checks Stockbit, the background audit, and the stock data
- Every date is shown as the **buy date**, not the closing date, to avoid confusion
- Entry, TP, and SL follow **IDX price ticks** and are recalculated from the real buy price
- **Add to Portfolio** straight from the stock card on Home
- **Stock check**: entry, TP & SL plan, 2 supports & 2 resistances on the chart
- **Monthly backtest** since October 2025, growing every day with trades that hit TP or SL
- **Share as images**: one signal (with why it made the radar), all of today's signals, one history entry, Strategy History by date range, Portfolio, and Backtest by month. Long reports are split into pages automatically
- Strategy and Portfolio History show totals, holds, TP, SL, win-rate, and cumulative P/L
- Price audit **every minute** while the app is open in market hours, about every 15 minutes in the background
- **Stockbit token renewed automatically every day**
- **"One more step"** permission screen fits on one screen, with an **Autostart** button that opens the phone's autostart list (Xiaomi, Oppo, Vivo, Realme, Infinix, and more)
- Reset buttons for Strategy History and Portfolio History in Account

### 🐞 Fixes
- Portfolio last price and P/L now use the live price right away, also for positions added after the market closes
- The SELL column now shows "–" while a stock is not sold yet
- The signal list no longer mixes the closing-day change with the position's P/L
- Candles are no longer covered by price labels
- Stocks still being held are not recommended again
- Published signals no longer change when the server re-runs the screening

</details>

---

## ✦ v1.0 — Oktober 2026 / October 2026

<details>
<summary><h2>🇮🇩 Bahasa Indonesia</h2></summary>

- Rilis pertama: Radar Besok dengan strategi Profit Tinggi dan Winrate Tinggi per tingkat likuiditas
- Login Stockbit (hanya membaca data), Riwayat Strategi, Riwayat Portofolio, dan notifikasi entry, TP & SL

</details>

<details>
<summary><h2>🇬🇧 English</h2></summary>

- First release: Radar Besok with High Profit and High Win-rate strategies per liquidity tier
- Stockbit login (read-only), Strategy History, Portfolio History, and entry, TP & SL notifications

</details>
