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

    System.out.println("\nData Doseb sebelum sorting : ");
    list.tampil();
    System.out.println("Data Dosen setelah sorting berdasarkan usia yang termuda (ASC) : ");
    list.bubbleSort();
    list.tampil();
    System.out.println("Data Dosen yang sudah terurut menggunakan SELECTION SORT (DSC) : ");
    list.selectionSort();
    list.tampil();
    System.out.println("Data Dosen yang sudah terurut menggunakan INSERTION SORT (DSC) : ");
    list.insertionSort();
    list.tampil();
    }
}