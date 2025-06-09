import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists list = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Tambah Setelah NIM Tertentu");
            System.out.println("4. Tambah pada Indeks Tertentu");
            System.out.println("5. Hapus di Awal");
            System.out.println("6. Hapus di Akhir");
            System.out.println("7. Hapus Setelah NIM Tertentu");
            System.out.println("8. Hapus pada Indeks Tertentu");
            System.out.println("9. Tampilkan Data");
            System.out.println("10. Cari Mahasiswa berdasarkan NIM");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data pada Indeks Tertentu");
            System.out.println("14. Tampilkan Jumlah Data");
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
            case 3 -> {
                System.out.print("Masukkan NIM setelah mana data yang akan disisipkan : ");
                String nimKey = sc.nextLine();
                Mahasiswa03 mhs3 = inputMahasiswa(sc);
                list.insertAfter(nimKey, mhs3);
            }
            case 4 -> {
                System.out.print("Masukkan indeks untuk menambah data : ");
                int indeksAdd = sc.nextInt();
                sc.nextLine();
                Mahasiswa03 mhs4 = inputMahasiswa(sc);
                list.add(indeksAdd, mhs4);
            }
            case 5 -> list.removeFirst();
            case 6 -> list.removeLast();
            case 7 -> {
                System.out.print("Masukkan NIM setelah mana data yang akan dihapus : ");
                String nimRemove = sc.nextLine();
                list.removeAfter(nimRemove);
            }
            case 8 -> {
                System.out.print("Masukkan indeks untuk menghapus data : ");
                int indexRemove = sc.nextInt();
                sc.nextLine();
                list.remove(indexRemove);
            }
            case 9 -> list.print();
            case 10 -> {
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
            case 11 -> {
                Mahasiswa03 first = list.getFirst();
                if (first != null) {
                    System.out.println("Data pertama : ");
                    first.tampil();
                }
            }
            case 12 -> {
                Mahasiswa03 last = list.getLast();
                if (last != null) {
                    System.out.println("Data terakhir : ");
                    last.tampil();
                }
            }
            case 13 -> {
                System.out.print("Masukkan indeks yabng ingin ditampilkan : ");
                int indexGet = sc.nextInt();
                sc.nextLine();
                Mahasiswa03 dataAtIndex = list.getIndex(indexGet);
                if (dataAtIndex != null) {
                    System.out.println("Data pada indeks " + indexGet + " : ");
                    dataAtIndex.tampil();
                }
            }
            case 14 -> {
                System.out.println("Jumlah data dalam list : " + list.size());
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