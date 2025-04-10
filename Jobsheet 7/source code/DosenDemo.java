import java.util.Scanner;

public class DosenDemo {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DataDosen list = new DataDosen();

    System.out.print("Masukkan jumlah data yang ingin dimasukkan : ");
    int jmlData = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < jmlData; i++) {
        System.out.println("Masukkan Data Dosen ke-" + (i + 1));
        System.out.print("Kode                       : ");
        String kode = sc.nextLine();
        System.out.print("Nama                       : ");
        String nama = sc.nextLine();
        System.out.print("Jenis Kelamin(Wanita/Pria) : ");
        String dummy =  sc.nextLine();
        if (dummy.equalsIgnoreCase("pria")) { 
            boolean jenisKelamin = true; 
        } else if(dummy.equalsIgnoreCase("wanita")) { 
            boolean jenisKelamin = false;
        }
        System.out.print("Usia                       : ");
        dummy = sc.nextLine();
        int usia  = Integer.parseInt(dummy);

        Dosen d = new Dosen(kode, nama, false, usia);
        list.tambah(d);
    }

    list.tampil();
    System.out.println("\n------------------------------------");
    System.out.println("---------- Pencarian Data ----------");
    System.out.println("------------------------------------");
    System.out.println("Masukkan nama dosen yang ingin dicari!");
    System.out.print("Nama : ");
    String cari = sc.nextLine();

    // System.out.println("\nData Doseb sebelum sorting : ");
    // list.tampil();
    // System.out.println("Data Dosen setelah sorting berdasarkan usia yang termuda (ASC) : ");
    // list.bubbleSort();
    // list.tampil();
    // System.out.println("Data Dosen yang sudah terurut menggunakan SELECTION SORT (DSC) : ");
    // list.selectionSort();
    // list.tampil();
    // System.out.println("Data Dosen yang sudah terurut menggunakan INSERTION SORT (DSC) : ");
    // list.insertionSort();
    // list.tampil();

    System.out.println("Menggunakan Sequential Searching");
    double posisi = list.PencarianDataSequential03(cari);
    int pss = (int)posisi;
    list.tampilPosisi(cari, pss);
    list.tampilDataSearch(cari, pss);

    System.out.println("\n------------------------------------");
    System.out.println("------Menggunakan Binary Search-----");
    System.out.println("------------------------------------");
    double posisi2 = list.PencarianDataBinary03(cari, 0, jmlData-1);
    int pss2 = (int)posisi2;
    list.tampilPosisi(cari, pss2);
    list.tampilDataSearch(cari, pss2);
    }
}