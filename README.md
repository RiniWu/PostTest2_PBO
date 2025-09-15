# PostTest2_PBO

Nama : Rini Wulandari

NIM : 2409116048

Kelas : Sistem Informasi B 2024

## Penjelasan Singkat terkait Program
Program ini berguna dalam menampung informasi data dari Festival Budaya mulai dari nama festival, asal festival dan tanggal pelaksanaan festival. Dalam program ini menyediakan opsi untuk menambahkan festival baru, menampilkan daftar festival dalam format tabel, mengubah data festival berdasarkan nomor urut, serta menghapus festival sekaligus memperbarui daftar agar tetap berurutan. Proses menu dijalankan menggunakan perulangan do-while dan struktur switch-case, dilengkapi validasi agar input nomor yang dipilih sesuai dengan data yang ada.

## Struktur Program
Program ini dibagi menjadi 3 package utama:

Penerapan Model View Controller (MVC)

<img width="255" height="169" alt="image" src="https://github.com/user-attachments/assets/7cebb691-debe-4892-8d41-d7ef26daab06" />

1. **package Main**

   Package ini berisi class mainFestival yang menampilkan menu interaktif kepada pengguna. Melalui menu ini, pengguna bisa mengakses berbagai fitur CRUD dengan lebih mudah, lengkap dengan validasi agar input tetap aman.

2. **package Model**

   Di package ini terdapat class modelFestival yang menyimpan data dasar sebuah festival, seperti nama, asal daerah, dan tanggal pelaksanaannya. Package ini berfungsi sebagai tempat mendefinisikan struktur data yang akan dipakai program.
   
3. **package Service**

   Package ini berisi class serviceFestival yang mengatur semua logika CRUD. Di sinilah data festival dikelola, mulai dari menambah, menampilkan, mengubah, hingga menghapus, sehingga menjadi penghubung antara data dan menu utama.


## Penjelasan Source Code Program
### 1. Package & Class modelFestival

<img width="247" height="54" alt="image" src="https://github.com/user-attachments/assets/abac2305-7473-4f4c-8266-0e96581ec68c" />

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

<img width="246" height="52" alt="image" src="https://github.com/user-attachments/assets/231d17ad-8eeb-4184-b02f-02b2cc12e25f" />

**a. Deklarasi package dan import**

<img width="335" height="115" alt="image" src="https://github.com/user-attachments/assets/20a0e607-4239-47b0-8f69-ba03f5e8cf6c" />

- Gambar di atas menunjukkan bahwa class serviceFestival berada dalam package Service.
- Import Model.modelFestival dipakai supaya kelas ini bisa menggunakan objek dari package Model, sedangkan java.util.ArrayList digunakan untuk menyimpan daftar festival dalam bentuk list dinamis yang bisa bertambah atau berkurang sesuai kebutuhan.

**b. Deklarasi Class**

<img width="843" height="54" alt="image" src="https://github.com/user-attachments/assets/f6cbecfa-6b93-433c-8c22-9095e17b7345" />

- Dalam class seviceFestival terdapat atribut festivalList yang dimana variabel ini adalah sebuah ArrayList yang menyimpan kumpulan objek festival. Access modifier private dipakai agar list ini hanya bisa diakses dari dalam kelas, sementara untuk mengelola isinya tersedia berbagai metode CRUD.

**c. Construktor**

<img width="1323" height="167" alt="image" src="https://github.com/user-attachments/assets/e74ce21b-8937-486e-8b7f-c0571b94d6cd" />

- Dalam construktor ini otomatis akan dijalankan ketika objek serviceFestival dibuat. Di dalamnya, daftar festival langsung diisi dengan beberapa data awal. Dengan begitu, saat program dijalankan pengguna bisa langsung melihat daftar beberapa festival yang ada tanpa harus menambahkannya terlebih dahulu.

**d. CREATE**

<img width="748" height="97" alt="image" src="https://github.com/user-attachments/assets/d787b463-237a-4794-98c4-a341cd1d945a" />

- Pada metode create ini dipakai untuk menambahkan festival baru ke dalam list. Setelah festival masuk ke daftar, program akan mencetak pesan “Festival berhasil ditambahkan!” agar pengguna tahu bahwa prosesnya sukses.

**e. READ**

<img width="1436" height="318" alt="image" src="https://github.com/user-attachments/assets/e66caa69-5eef-437f-9e73-13c8614c9f34" />

- Pada metode read ini menampilkan semua data festival dalam bentuk tabel. Jika list kosong, akan muncul pesan bahwa belum ada data. Kalau ada data, program mencetak header tabel lalu menampilkan setiap festival dengan nomor urut menggunakan perulangan. Format printf dipakai agar hasil keluaran lebih rapi.

**f. UPDATE**

<img width="831" height="211" alt="image" src="https://github.com/user-attachments/assets/dca49def-00f7-49e9-928e-f4a7502a7075" />

- Pada metode update ini dipakai untuk mengganti data festival berdasarkan posisi indeks dalam list. Jika nomor indeks valid, data diganti dengan data baru yang diberikan. Jika tidak, program akan memberikan pesan peringatan “Nomor tidak valid!”.

**g. DELETE**

<img width="1169" height="208" alt="image" src="https://github.com/user-attachments/assets/62613fa4-f631-4cef-ae0e-386ed02de21b" />

- Pada metode delete ini berfungsi untuk menghapus festival dari list berdasarkan nomor indeks. Kalau penghapusan berhasil maka nama festival yang dihapus akan ditampilkan di console. Jika nomor yang dimasukkan salah, program akan menampilkan pesan error.

**h. Pengembalian Jumlah Data**

<img width="443" height="75" alt="image" src="https://github.com/user-attachments/assets/b6c7a4ac-f0ab-4c9b-af70-4e127d7a7bbb" />

- Kode diatas berfungsi untuk mengembalikan jumlah data festival yang ada di dalam list.





