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
│   │   ├── Logout
│   │   ├── Make Appointment
│   │   ├── Open Browser
│   │   ├── Open Login Page
│   ├── E2E Testing/
│   │   ├── TC001 - Login
│   │   ├── TC002 - Book Appointment
│   │   ├── TC003 - Check History
│   │   ├── TC004 - Logout
│   ├── Functional Testing/
│   │   ├── SC001 - Login
│   │   ├── SC002 - Booking Appointment
│   │   ├── SC003 - Cek History Appointment
│   │   ├── SC004 - Logout
│   │   ├── SC005 - Profile
│── Object Repository/
│── Test Suites/
│── Data Files/
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

## 🚀 Sample Test Script: Check History Appointment
```groovy
WebUI.callTestCase(findTestCase('Functional Testing/SC001 - Login/TC002 - Login success'), [('username') : 'John Doe', ('password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/i_Navbar'))
WebUI.click(findTestObject('Navbar/a_History'))
WebUI.verifyElementPresent(findTestObject('History/h2_History'), 0)
WebUI.verifyElementText(findTestObject('History/div_Header-visitDate'), visitDate)
WebUI.verifyElementText(findTestObject('History/p_Result-Facility'), facility)
WebUI.verifyElementText(findTestObject('History/p_Result-Healthcare Program'), healthcareProgram)
WebUI.verifyElementText(findTestObject('History/p_Result-Comment'), comment)
```

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

## 📩 Contact
Jika ada pertanyaan, silakan hubungi:
📧 Email: teguhardama75@gmail.com  
GitHub: [Teguh-Ardama](https://github.com/Teguh-Ardama)

---
🚀 **Happy Testing!** 🚀
