import java.util.Scanner;
public class SuratDemo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StackSurat03 stack = new StackSurat03(5);

    int pilih;

    do {
        System.out.println("\n====== Menu ======");
        System.out.println("1. Terima Surat");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.print("Pilih : ");
        pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.println("=== Data Surat Izin ===");
                System.out.print("ID Surat        : ");
                String id = sc.nextLine();
                System.out.print("Nama Mahasiswa  : ");
                String nama = sc.nextLine();
                System.out.print("Kelas Mahasiswa : ");
                String kelas = sc.nextLine();
                System.out.print("Jenis izin (S/I): ");
                char izin = sc.next().charAt(0);
                if (izin != 'S' && izin != 'I') {
                    System.out.println("Izin invalid!");
                    break;
                }
                System.out.print("Durasi izin (hari): ");
                int durasi = sc.nextInt();
                Surat03 surat03 = new Surat03(id, nama, kelas, izin, durasi);
                stack.push(surat03);
                break;
            case 2:
                Surat03 proses = stack.pop();
                if (proses != null) {
                    System.out.println("Memproses Surat Izin yang dimasukkan untuk Mahasiswa " + proses.namaMahasiswa);
                    proses.cetakSurat();
                }
                break;
            case 3:
                Surat03 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("Surat izin terakhir dikumpulkan oleh : " + lihat.namaMahasiswa);
                }
                break;
            case 4:
                System.out.println("Mencari Surat izin");
                System.out.print("Masukkan Nama Mahasiswa : ");
                String cari = sc.nextLine();
                stack.cariSurat(cari);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}