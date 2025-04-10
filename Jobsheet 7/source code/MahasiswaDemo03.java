import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.println("Masukkan jumlah data yang ingin dimasukkan ");
        int jmlData = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jmlData; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama Mahasiswa    : ");
            String nama = sc.nextLine();
            System.out.print("NIM Mahasiswa     : ");
            String nim = sc.nextLine();
            System.out.print("Kelas Mahasiswa   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK Mahasiswa     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        System.out.println("\n------------------------------------");
        System.out.println("---------- Pencarian Data ----------");
        System.out.println("------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari!");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        
        System.out.println("\n------------------------------------");
        System.out.println("------Menggunakan Binary Search-----");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jmlData-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        // System.out.println("\nData mahasiswa sebelum sorting : ");
        // list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        // list.selectionSort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        // list.insertionSortASC();
        // list.insertionSortDSC();
        // list.tampil();
    }
}
