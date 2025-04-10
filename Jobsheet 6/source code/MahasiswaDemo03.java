import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.print("Masukkan jumlah data yang ingin dimasukkan : ");
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
        
        // Mahasiswa03 m1 = new Mahasiswa03("123", "Zidan", "2A", 3.2);
        // Mahasiswa03 m2 = new Mahasiswa03("124", "Ayu", "2A", 3.5);
        // Mahasiswa03 m3 = new Mahasiswa03("125", "Sofi", "2A", 3.1);
        // Mahasiswa03 m4 = new Mahasiswa03("126", "Sita", "2A", 3.9);
        // Mahasiswa03 m5 = new Mahasiswa03("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("\nData mahasiswa sebelum sorting : ");
        list.tampil();
        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        // list.selectionSort();
        // list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSortASC();
        list.insertionSortDSC();
        list.tampil();
    }
}
