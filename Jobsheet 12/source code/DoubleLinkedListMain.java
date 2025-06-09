import java.util.Scanner;
public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1 -> {
                Mahasiswa03 mhs1 = inputMahasiswa(sc);
                list.addFirst(mhs1);
            }

            case 2 -> {
                Mahasiswa03 mhs2 = inputMahasiswa(sc);
                list.addLast(mhs2);
            }
                
            case 3 -> list.removeFirst();
            case 4 -> list.removeLast();
            case 5 -> list.print();
            case 6 -> {
                System.out.print("Masukkan NIM yang dicari  : ");
                String nim = sc.nextLine();
                Node03 found = list.search(nim);
                if (found != null) {
                    System.out.println("Data Ditemukan!");
                    found.data.tampil();
                } else {
                    System.out.println("Data tidak ditemukan.");
                }
            }
            case 0 -> System.out.println("Keluar dari program!");
            default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }

    public static Mahasiswa03 inputMahasiswa(Scanner sc){
        System.out.print("Masukkan NIM      : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama     : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas    : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK      : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa03(nim, nama, kelas, ipk);
    }
}