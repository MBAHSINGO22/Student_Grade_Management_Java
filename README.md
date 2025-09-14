# 📝 Student Grade Management Java

Sistem Pengelolaan Nilai Mahasiswa di Java  
Proyek Java yang mengimplementasikan aplikasi untuk mengelola data mahasiswa, menghitung nilai akhir, dan menampilkan daftar nilai serta nilai tertinggi.

---

## 📖 Deskripsi Proyek
**Student_Grade_Management_Java** adalah proyek pembelajaran Java yang mengimplementasikan sistem pengelolaan data mahasiswa informatika untuk mata kuliah Pemrograman Berorientasi Objek (PBO).  

Proyek ini berfokus pada:
- 📊 **Mahasiswa.java**: Kelas utama untuk merepresentasikan mahasiswa dengan atribut NIM, nama, tanggal lahir, nilai UTS1, UTS2, UAS, serta metode untuk menghitung nilai akhir dan konversi ke huruf.  
- 🛠️ **MahasiswaMain.java**: Kelas utama untuk menguji sistem dengan menerima input data mahasiswa, menampilkan daftar nilai, rata-rata nilai akhir, dan data mahasiswa dengan nilai tertinggi.  

Proyek ini terdiri dari dua file Java (`Mahasiswa.java`, `MahasiswaMain.java`) dalam paket **Modul_4**. 🟢  

---

## 🧠 Teknologi
- Java

---

## 📂 Struktur File
Student_Grade_Management_Java/
├── src/Modul_4/
├── MahasiswaMain.java # 🛠️ Kelas utama untuk pengujian
├── Mahasiswa.java # 📊 Kelas untuk data dan perhitungan mahasiswa


🟢 Catatan

Program menerima input jumlah mahasiswa, diikuti oleh data:
-NIM, nama, tanggal lahir, nilai UTS1, UTS2, UAS.
-Nilai akhir dihitung dengan bobot: UTS1 (30%) + UTS2 (30%) + UAS (40%).
-Nilai huruf ditentukan berdasarkan rentang:

A (≥80)

B (≥70)

C (≥60)

D (≥50)

E (<50)

---

📈 Contoh Output

Masukkan jumlah mahasiswa: 2
Masukkan data mahasiswa ke-1
NIM: 235314098
Nama: ADI
Tanggal Lahir: 24
UTS1: 60
UTS2: 70
UAS: 80
Masukkan data mahasiswa ke-2
NIM: 235314099
Nama: EUGENIUS        
Tanggal Lahir: 22
UTS1: 90
UTS2: 90
UAS: 100

Daftar Mahasiswa Informatika Peserta PBO
No. NIM          Nama    Tgl Lahir       Uts1    Uts2    Uas     Final   Nilai
---------------------------------------------------------------------------------------------------
1.235314098      ADI        24      	  60.00   70.00   80.00   71.00    B
2.235314099      EUGENIUS   22          90.00   90.00   100.00  94.00    A

Rata-rata Final: 82.50

Nilai tertinggi:
Nim: 235314099
Nama: EUGENIUS
Tanggal Lahir: 22
Final: 94.0
Nilai: A

---

👨‍💻 Pengembang
MBAHSINGO22 
🔗 GitHub https://github.com/MBAHSINGO22
