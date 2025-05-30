import java.util.Scanner;
public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList01 list = new DoubleLinkedList01();
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
            pilihan = sc.nextInt();
            sc.nextLine();
        switch (pilihan) {
            case 1:
                Mahasiswa01 mhs = inputMahasiswa(sc);
                list.addFirst(mhs);
                break;
        
            default:
                break;
        }
        } while (pilihan != 0);
        sc.close();
    }

    public static Mahasiswa01 inputMahasiswa(){
        System.out.print("Masukkan NIM      : " + mhs.nim);
    }
}