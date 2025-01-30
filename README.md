# CURA Katalon Automation

## 📌 Overview
**CURA-Katalon-Automation** adalah proyek otomatisasi pengujian berbasis **Katalon Studio** untuk aplikasi **CURA Healthcare Service**. Proyek ini mencakup pengujian end-to-end (E2E) dan functional testing untuk skenario login, booking appointment, history appointment, dan logout guna memastikan kualitas aplikasi.

## 📂 Project Structure
```
CURA-Katalon-Automation/
│── Profiles/
│   ├── default
│   ├── UAT
│── Test Cases/
│   ├── Blocks/
│   │   ├── Close Browser
│   │   ├── History
│   │   ├── Login
│   │   ├── Logout (Navbar & Profile)
│   │   ├── Make Appointment
│   │   ├── Open Browser
│   │   ├── Open Login Page
│   ├── E2E Testing (Blocks)/
│   │   ├── TC001 - Login
│   │   ├── TC002 - Book Appointment
│   │   ├── TC003 - Check History
│   │   ├── TC004 - Logout
│   ├── Functional Testing/
│   │   ├── SC001 - Login
│   │   │   ├── TC001 - Verify Login object
│   │   │   ├── TC002 - Login success
│   │   │   ├── TC003 - Login with empty field
│   │   │   ├── TC004 - Login with wrong username
│   │   │   ├── TC005 - Login with wrong password
│   │   ├── SC002 - Booking appointment
│   │   ├── SC003 - Cek history appointment
│   │   ├── SC004 - Logout
│   │   ├── SC005 - Profile
│── Object Repository/
│   ├── Appointment Summary
│   ├── History
│   ├── Login
│   ├── Make Appointment
│   ├── Navbar
│   ├── Profile
│── Test Suites/
│   ├── Functional Testing/
│   │   ├── TS Check History Testing
│   │   ├── TS Login Testing
│   │   ├── TS Login Testing - BLOCK - MASIH PROBLEM
│   │   ├── TS Logout
│   │   ├── TS Make Appointment Testing
│   ├── TSC Functional Testing
│── Data Files/
│   ├── login
│   ├── makeAppointment
│── Reports/
│── Keywords/
│── Test Listeners/
│── TestOps/
│── Plugins/
│── Include/
│── .gitignore
│── build.gradle
│── console.properties
│── README.md
```

## 🛠️ Tools & Technologies
- **Katalon Studio** - Untuk pengujian otomatisasi UI & API.
- **Selenium WebDriver** - Digunakan di balik layar oleh Katalon.
- **GitHub** - Untuk manajemen versi kode.
- **TestNG / JUnit** - Untuk eksekusi dan pelaporan hasil tes.

## 🚀 Test Scenarios
### 1️⃣ **Login**
- **TC001 - Verify Login object** → Validasi elemen UI pada halaman login.
- **TC002 - Login success** → Validasi login dengan kredensial yang benar.
- **TC003 - Login with empty field** → Validasi error jika field kosong.
- **TC004 - Login with wrong username** → Cek error jika username salah.
- **TC005 - Login with wrong password** → Cek error jika password salah.

### 2️⃣ **Book Appointment**
- **TC001 - Verify Make Appointment object** → Validasi elemen UI di halaman booking.
- **TC002 - Submit with all fields filled** → Booking appointment dengan data valid.
- **TC003 - Submit without check apply** → Validasi booking tanpa checklist.
- **TC007 - Submit without fill Mandatory Field** → Validasi error jika field wajib kosong.

### 3️⃣ **History Appointment**
- **TC001 - Verify History object** → Validasi tampilan history.
- **TC002 - Check History** → Cek daftar riwayat appointment.
- **TC003 - Check history without making an appointment** → Cek apakah history kosong jika belum ada booking.

### 4️⃣ **Logout**
- **TC001 - Logout with Navbar** → Cek logout dari navbar.
- **TC002 - Logout with Profile Page** → Cek logout dari halaman profil.
- **TC003 - Logout and check button logout in navbar** → Validasi tombol logout setelah logout.

### 5️⃣ **Profile**
- **TC001 - Verify Profile Object** → Validasi elemen di halaman profil.
- **TC002 - Check Profile** → Cek informasi pengguna di halaman profil.
- **TC003 - Check Profile without Login** → Cek apakah user tanpa login bisa mengakses halaman profil.

## 🔧 How to Run Tests
### 1️⃣ Clone Repository
```sh
git clone https://github.com/Teguh-Ardama/CURA-Katalon-Automation.git
cd CURA-Katalon-Automation
```
### 2️⃣ Open in Katalon Studio
1. Buka **Katalon Studio**.
2. Pilih **Open Project** dan arahkan ke folder repository ini.

### 3️⃣ Jalankan Test Suites
- Untuk menjalankan semua test case:
```sh
Run with Test Suite Collection
```
- Untuk menjalankan test case spesifik:
```sh
Run with Test Suite > Pilih Test Suite yang diinginkan
```

## 📜 Test Reports
Setelah eksekusi selesai, laporan akan tersedia di folder:
```
Reports/
```
Anda dapat melihat hasil pengujian dalam format **HTML, JUnit, atau PDF**.

## 📌 Contribution
Jika ingin berkontribusi:
1. Fork repository ini.
2. Buat branch baru: `git checkout -b feature-nama-fitur`.
3. Commit perubahan: `git commit -m 'Menambahkan fitur X'`.
4. Push ke branch: `git push origin feature-nama-fitur`.
5. Buat Pull Request di GitHub.

## 📩 Contact
Jika ada pertanyaan, silakan hubungi:
📧 Email: teguh.ardama@example.com  
GitHub: [Teguh-Ardama](https://github.com/Teguh-Ardama)

---
🚀 **Happy Testing!** 🚀
