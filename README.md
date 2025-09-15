# PostTest2_PBO

Nama : Rini Wulandari

NIM : 2409116048

Kelas : Sistem Informasi B 2024

## Penjelasan Singkat terkait Program
Pada program ini berguna dalam menampung informasi data dari Festival Budaya mulai dari nama festival, asal festival dan tanggal pelaksanaan festival. Dalam program ini menyediakan opsi untuk menambahkan festival baru, menampilkan daftar festival dalam format tabel rapi, mengubah data festival berdasarkan nomor urut, serta menghapus festival sekaligus memperbarui daftar agar tetap berurutan. Proses menu dijalankan menggunakan perulangan do-while dan struktur switch-case, dilengkapi validasi agar input nomor yang dipilih sesuai dengan data yang ada.

## Struktur Program
Program ini dibagi menjadi 3 package utama:
1. **package Model**

   Di package ini terdapat class modelFestival yang menyimpan data dasar sebuah festival, seperti nama, asal daerah, dan tanggal pelaksanaannya. Package ini berfungsi sebagai tempat mendefinisikan struktur data yang akan dipakai program.
   
2. **package Service**

   Package ini berisi class serviceFestival yang mengatur semua logika CRUD. Di sinilah data festival dikelola, mulai dari menambah, menampilkan, mengubah, hingga menghapus, sehingga menjadi penghubung antara data dan menu utama.

3. **package Main**

   Package ini berisi class mainFestival yang menampilkan menu interaktif kepada pengguna. Melalui menu ini, pengguna bisa mengakses berbagai fitur CRUD dengan lebih mudah, lengkap dengan validasi agar input tetap aman.

## Penjelasan Program
### 1. Package & Class modelFestival
<img width="241" height="57" alt="image" src="https://github.com/user-attachments/assets/bfce2697-0a80-46dc-850d-f6e34dec9c30" />

**a. Deklarasi package**

<img width="178" height="34" alt="image" src="https://github.com/user-attachments/assets/133a80bd-bb32-4ff0-af7a-4da25939bec2" />

- Package berfungsi untuk mengelompokkan kelas agar lebih terstruktur, rapi, dan mudah dikelola. Gambar diatas menunjukkan bahwa class modelFestival berada dalam package bernama Model.

**b. Deklarasi Class**

<img width="356" height="30" alt="image" src="https://github.com/user-attachments/assets/bfa378d8-82d7-4459-9a4f-a349bb6ad303" />

- Class dengan 





