import java.util.Scanner;
public class SLLMain03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList03 sll = new SingleLinkedList03();
    // Mahasiswa03 mhs1 = new Mahasiswa03("Alvaro", "24212200", "1A", 4.0);
    // Mahasiswa03 mhs2 = new Mahasiswa03("Bimon", "23212201", "2B", 3.8);
    // Mahasiswa03 mhs3 = new Mahasiswa03("Cintia", "22212202", "3C", 3.5);
    // Mahasiswa03 mhs4 = new Mahasiswa03("Dirga", "21212203", "4D", 3.6);
    
    // sll.print();
    // sll.addFirst(mhs4);
    // sll.print();
    // sll.addLaST(mhs1);
    // sll.print();
    // sll.insertAfter("Dirga", mhs3);
    // sll.insertAt(2, mhs2);
    // sll.print();

    int pilihan;

    do {
        System.out.println("\n===== MENU LINKED LISET =====");
        System.out.println("1. Tambah Data Mahasiswa di awal");
        System.out.println("2. Tambah Data Mahasiswa di akhir");
        System.out.println("3. Tampilkan semua data");
        System.out.println("4. Cari data berdasarkan nama");
        System.out.println("5. Hapus data pertama");
        System.out.println("6. Hapus data terakhir");
        System.out.println("7. Hapus data berdasarkan nama");
        System.out.println("8. Tampilkan Jumlah Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("\n=== Tambah Data di Awal ===");
                Mahasiswa03 mhsFirst = inputMahasiswa(sc);
                sll.addFirst(mhsFirst);
                System.out.println("Data berhasil ditambahkan di awal");
                break;
            case 2:
                System.out.println("\n=== Tambah Data di Akhir ===");
                Mahasiswa03 mhsLast = inputMahasiswa(sc);
                sll.addFirst(mhsLast);
                System.out.println("Data berhasil ditambahkan di akhir");
                break;
            case 3:
                System.out.println("\n=== Tampilkan Semua Data ===");
                sll.print();
                break;
            case 4:
                System.out.print("Masukkan nama yang dicari : ");
                String namaSearch = sc.nextLine();
                int index = sll.indexof(namaSearch);
                if (index != -1) {
                    System.out.println("Data mahasiswa atas nama " + namaSearch + " berada pada index : " + index);
                    System.out.println("Data pada index " + index + " : ");
                    sll.getData(index);
                } else {
                    System.out.println("Data tidak ditemukan!");
                }
                break;
            case 5:
                System.out.println("\n=== Hapus Data Pertama ===");
                sll.removeFirst();
                System.out.println("Data Pertama berhasil dihapus!");
                break;
            case 6:
                System.out.println("\n=== Hapus Data Terakhir ===");
                sll.removeLast();
                System.out.println("Data Terakhir berhasil dihapus!");
                break;
            case 7:
                System.out.print("Masukkan nama yang akan dihapus : ");
                String namaDel = sc.nextLine();
                sll.remove(namaDel);
                System.out.println("Data berhasil dihapus!");
                break;
            case 0:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 0);
    sc.close();
}

    public static Mahasiswa03 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan Nama      : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Kelas     : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan IPK       : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa03(nama, nim, kelas, ipk);
    }
}

    // System.out.print("Masukkan jumlah Mahasiswa: ");
    // int jumlah = sc.nextInt();
    // sc.nextLine();
    // for (int i = 0; i < jumlah; i++) {
    //     System.out.println("Input data mahasiswa ke-" + (i + 1));

    //     System.out.print("Nama      : ");
    //     String nama = sc.nextLine();

    //     System.out.print("NIM       : ");
    //     String nim = sc.nextLine();

    //     System.out.print("Kelas     : ");
    //     String kelas = sc.nextLine();

    //     System.out.print("IPK       : ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine();
    //     Mahasiswa03 mhs = new Mahasiswa03(nama, nim, kelas, ipk);
    //     sll.addFirst(mhs);
    // }

    // System.out.println("Data index 1 : ");
    // sll.getData(1);

    // System.out.println("Data Mahasiswa an Bimon berada pada index : " + sll.indexof("bimon"));
    // System.out.println();

    // sll.removeFirst();
    // sll.removeLast();
    // sll.print();
    // sll.removeAt(0);
    // sll.print();