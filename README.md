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


### 3. Package & Class mainFestival

<img width="245" height="53" alt="image" src="https://github.com/user-attachments/assets/4c38e4c5-8204-4462-8891-562034d1a7e6" />

**a. Deklarasi package & import**

<img width="489" height="197" alt="image" src="https://github.com/user-attachments/assets/3b310a8e-3415-47f2-8462-a052cfeb320a" />

- Class mainFestival ditempatkan di package Main yang dimana berfungsi sebagai tampilan menu interaktif bagi pengguna. Di sini, user dapat memilih menu melalui input angka yang divalidasi menggunakan try-catch agar input tidak salah. Program ini menyediakan menu untuk menambah, melihat, mengubah, dan menghapus data festival, serta menampilkan pesan ketika pilihan tidak valid.
- Untuk import sendiri class ini menggunakan modelFestival dari package Model dan serviceFestival dari package Service. Selain itu, diimpor juga Scanner untuk membaca input dari keyboard, serta InputMismatchException untuk menangani kesalahan input ketika pengguna memasukkan data yang tidak sesuai tipe.

**b. Deklarasi Class**

<img width="686" height="157" alt="image" src="https://github.com/user-attachments/assets/1ead267a-8f77-4b55-a438-a7a05375882d" />

- Class mainFestival berisi method main sebagai titik awal program. Di dalamnya dibuat objek Scanner untuk membaca input dari user dan objek serviceFestival untuk mengelola data festival. Variabel pilihan disiapkan untuk menampung pilihan menu yang dimasukkan oleh pengguna.

**c. Menu Utama dengan perulangan do-while**

<img width="928" height="294" alt="image" src="https://github.com/user-attachments/assets/3ec595d7-87b6-4be8-9252-e946d75720ee" />

- Program ini akan menampilkan menu utama dengan pilihan 1 sampai 5. Perulangan do-while dipakai agar menu terus ditampilkan sampai pengguna memilih keluar pada opsi nomor 5.
- Input pilihan dibaca dengan Scanner, lalu input.nextLine() dipanggil untuk menghapus karakter enter setelah input angka. Bagian ini dibungkus try-catch sebagai validasi input supaya jika pengguna salah memasukkan data, program tidak langsung error.

**d. CASE 1 (Tambah Festival)**

<img width="908" height="270" alt="image" src="https://github.com/user-attachments/assets/b7b7c146-c857-462e-86c6-7cf9f7ec0a8d" />

- Pada program ini setiap menu diproses menggunakan switch-case. Jika pengguna memasukkan angka yang tidak sesuai menu, maka akan pesan "Pilihan tidak valid!"
-  ika memilih menu 1, program akan meminta input nama, asal, dan tanggal festival. Data ini dipakai untuk membuat objek baru dalam modelFestival, lalu objek tersebut ditambahkan ke dalam daftar menggunakan service.tambahFestival().

**e. CASE 2 (Lihat Festival)**

<img width="489" height="92" alt="image" src="https://github.com/user-attachments/assets/cb4d7ef8-92ae-4c45-81c9-d885fb1b72b5" />

- Jika memilih menu 2, program langsung memanggil metode tampilkanFestival() dari serviceFestival untuk menampilkan daftar festival dalam bentuk tabel.

**f. CASE 3 (Ubah Festival)**

<img width="1338" height="403" alt="image" src="https://github.com/user-attachments/assets/2556902b-dce7-4972-8126-79402a7bf4c3" />

- Jika memilih menu 3, program akan menampilkan daftar festival lalu meminta nomor festival yang akan diubah. Karena indeks di ArrayList mulai dari nol, maka nomor input dikurangi 1. Selanjutnya, pengguna diminta memasukkan data baru, lalu program memanggil ubahFestival() untuk mengganti data lama dengan data baru.

**g. CASE 4 (Hapus Festival)**

<img width="876" height="242" alt="image" src="https://github.com/user-attachments/assets/609ae326-4777-41c9-bf68-ca52054d58fd" />

- Jika memilih menu 4, program akan menampilkan daftar festival dan meminta nomor festival yang ingin dihapus. Sama seperti update, nomor dikurangi 1 agar sesuai dengan indeks list. Data dihapus dengan memanggil hapusFestival().

**h. CASE 5 (Keluar Program)**

<img width="891" height="165" alt="image" src="https://github.com/user-attachments/assets/02504f28-54b1-4574-8486-8359310cd5c7" />

- Jika memilih menu 5, program akan menampilkan ucapan terima kasih lalu perulangan berhenti.
- Jika memilih menu selain dari angka 1-5, maka program akan menampilkan pesan bahwa "Pilihan tidak valid!" dan akan langsung melakukan perulangan ke menu.

**i. Exception Handling**

<img width="631" height="108" alt="image" src="https://github.com/user-attachments/assets/2031d2b4-5c1e-4b5d-a1dd-a6653b7517e0" />

- Bagian ini menangani kesalahan input. Jika pengguna salah memasukkan tipe data (misalnya huruf saat diminta angka), maka program akan menampilkan pesan “Input harus berupa angka!” dan membersihkan input agar program bisa lanjut tanpa error.

**j. Perulangan do-while**

<img width="349" height="112" alt="image" src="https://github.com/user-attachments/assets/2bfcc161-37de-4de9-b933-01c4d5c35302" />

- Perulangan akan terus berjalan selama pilihan bukan 5. Begitu pengguna memilih keluar, program berhenti dan Scanner akan ditutup.
















