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

## Penjelasan Source Code Program
### 1. Package & Class modelFestival
<img width="241" height="57" alt="image" src="https://github.com/user-attachments/assets/bfce2697-0a80-46dc-850d-f6e34dec9c30" />

**a. Deklarasi package**

<img width="178" height="34" alt="image" src="https://github.com/user-attachments/assets/133a80bd-bb32-4ff0-af7a-4da25939bec2" />

- Package berfungsi untuk mengelompokkan kelas agar lebih terstruktur, rapi, dan mudah dikelola. Gambar diatas menunjukkan bahwa class modelFestival berada dalam package bernama Model.

**b. Deklarasi Class**

<img width="356" height="30" alt="image" src="https://github.com/user-attachments/assets/bfa378d8-82d7-4459-9a4f-a349bb6ad303" />

- Deklarasi public class modelFestival {} menunjukkan bahwa kita sedang membuat sebuah class bernama modelFestival. Class ini bisa dipakai di mana saja karena access modifier bersifat public.

**c. Atribut**

<img width="454" height="83" alt="image" src="https://github.com/user-attachments/assets/42f2d873-40a6-4011-832f-501ada23b589" />

- Di dalam class modelFestival terdapat tiga variabel yaitu namaFestival, asal dan tanggalPelaksanaan. Ketiganya bertipe String karena isinya berupa teks, access dari variabel bersifat public.

**d. Construktor**

<img width="1055" height="158" alt="image" src="https://github.com/user-attachments/assets/ed7c488c-c10b-4712-95b2-6e8ccc1afeea" />

- Pada construktor ini otomatis akan dijalankan saat kita membuat objek baru dari kelas modelFestival. Parameter yang dimasukkan adalah namaFestival, asal, tanggalPelaksanaan yang dimana langsung disimpan ke dalam variabel kelas menggunakan kata kunci "this.". Jadi, kalau kita tulis new modelFestival("Festival Danau Toba", "Sumatera Utara", "25 November 2025"), objek festival akan langsung punya data lengkap tanpa perlu diisi lagi satu per satu.

**e. Method toString()**

<img width="1131" height="106" alt="image" src="https://github.com/user-attachments/assets/e00fd39a-4d26-4a55-ae14-e2cccc715777" />

- Di bagian akhir ada metode toString(). Ini adalah cara untuk mengatur bagaimana sebuah objek ditampilkan kalau dipanggil dengan System.out.println(). Dalam kode ini digunakan String.format() untuk membuat tampilan yang rapi seperti tabel nama festival ditaruh di kolom rata kiri dengan lebar 30 karakter, asal di kolom 20 karakter, dan tanggal pelaksanaan di kolom 20 karakter juga. Hasilnya, daftar festival akan tercetak sejajar sehingga lebih mudah dibaca.

***Contoh output***

   <img width="767" height="54" alt="image" src="https://github.com/user-attachments/assets/e707e89b-940f-43d6-beb3-a2de9c8f1a27" />


### 2. Package dan Class serviceFestival





