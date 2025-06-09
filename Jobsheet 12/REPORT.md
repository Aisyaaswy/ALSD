|  | Algorithm and Data Structure |
|--|--|
| NIM |  244109020109|
| Nama |  Aisya Aswy Nur Aidha|
| Kelas | TI - 1H |
| Repository | [https://github.com/Aisyaaswy/ALSD/tree/main/Jobsheet%2012] |

# JOSBHEET XI LINKED LIST
# Praktikum
## 12.1 Percobaan 1 

**12.1.1 Langkah - langkah Percobaan 1 :** 
1. Membuat class baru bernama ```Mahasiswa03```, ```Node03``` dan ```DoubleLinkedLists```
2. Membuat class ```Mahasiswa03``` dan mendeklarasikan atribut sesuai dengan diagram class yang telah ditentukan
3. Membuat class baru dengan nama ```Node03``` dan mendeklarasikan atribut sesuai dengan diagram class yang telah ditentukan
4. Membuat class baru dengan nama ```DoubleLinkedLists``` dan mendeklarasikan atribut sesuai dengan diagram class yang telah ditentukan
5. Membuat konstruktor pada class ```DoubleLinkedLists``` sesuai yang telah ditentukan
6. Membuat method ```isEmpty()``` untuk memastikan kondisi linked list kosong
7. Membuat method ```addFirst()``` untuk menjalankan penambahan data di bagian depan linked list
8. Membuat method ```addLast()``` untuk menambahkan data di bagian belakang linked list
9. Menambahkan kode agar dapat melakukan penambahan data posisi setelah node yang menyimpan data key
10. Membuat method ```print()``` untuk mencetak isi linked lists berapapun isinya 
12. Membuat class  ```DoubleLinkedListsMain``` untuk mengeksekusi semua method yang ada pada class ```DoubleLinkedLists```
13. Membuat menu pilihan pada class main
14. Menambahkan switch case untuk menjalankan menu pilihan tersebut
14. Menambahkan while di bawah switch case dan close untuk menutup object scanner
15. Menambahkan penyesuaian yang terdapat pada kode program

**12.1.2 Verifikasi Hasil Percobaan**

Hasil run kode program 

![Screenshot](image/12.1.2.png)

**12.1.3 Pertanyaan :**
1. Perbedaan Single vs Double Linked List :
- Single Linked List : Setiap node hanya memiliki pointer ke node selanjutnya
- Double Linked List : Setiap node memiliki pointer ke node selanjutnya (next) dan sebelumnya (prev)
2. Atribut next dan prev : 
- Next : Pointer yang menunjuk ke node selanjutnya dalam list
- Prev : Pointer yang menunjuk ke node sebelumnya dalam list
3. Kegunaan konstruktor adalah untuk menginisialisasi head dan tail menjadi null saat membuat object baru
4. Kode tersebut menunjukkan jika linked list masih kosong, maka node pertama (head) dan node terakhir (tail) akan menunjuk ke newNode. Karena hanya ada satu elemen, maka head dan tail adalah node yang sama
5. Statement tersebut digunakan saat list tidak kosong, yang berarti node baru akan disimpan di depan head yang lama maka node yang sebelumnya menjadi head, sekarang harus punya prev (sebelumnya) yang mengarah ke node baru (newNode) 
6. Modifikasi kode program pada fungsi ```print()``` agar dapat menampilkan pesan jika linked list kosong
```java
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih dalam kondisi kosong!");
        } 

        Node03 current = head;
        while (current != null ) {
            System.out.print("NIM : " + current.data.nim + ", Nama : " + current.data.nama + ", Kelas : " + current.data.kelas + ", IPK : " + current.data.ipk);
            current = current.next;
            if (current != null) {
                System.out.println();
            }
        }
    }
```
7. Pada kode tersebut digunakan untuk menghubungkan newNode ke node setelah current 
8. Modifikasi menu pilihan dan switch case agar fungsi ```insertAfter( ``` masuk ke menu
```java

```

## 12.2 Percobaan 2 : Memodifikasi Elemen pada Single Linked List

**12.2.1 Langkah - langkah Percobaan 2 :** 
1. Mengimplementasikan method untuk mengakses data dan indeks pada linked list
2. Menambahkan methid untuk mendapatkan data pada indeks tertentu pada Class Single Linked List
3. Mengimplementasikan method ```indexOf```
4. Menambahkan method ```removeFirst``` pada class Single Linked List
5. Menambahkan method untuk menghapus data pada bagian belakang class Single Linked List
6. Mengimplementasikan method ```remove```
7. Mengimplementasikan method untuk menghapus node dengan menggunakan index
8. Mencoba melakukan pengaksesan dan penghapusan data di method main pada class ```SLLMain``` dengan menambahkan kode yang telah ditentukan pada jobsheet
9. Menjalankan class ```SLLMain```

**12.2.2 Verifikasi Hasil Percobaan**

Hasil run kode program 

![Screenshot](image/12.2.2.png)

**12.2.3 Pertanyaan :**
1. Keyword break pada fungsi remove digunakan untuk menghentikan loop while saat data nama yang dicari (key) sudah ditemukan dan proses penghapusan selesai dilakukan. 
2. Kode tersebut bertujuan untuk menghapus node selain node yang berada di posisi pertama dan menjaga integritas pointer tail jika node terakhir dihapus.

## Tugas
Membuat kode program dengan ketentuan yang telah ditentukan dalam jobsheet
