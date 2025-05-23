import java.util.Scanner;
public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntriKRS antrian = new AntriKRS();
        int pilih;
        
        do {
            
            System.out.println("\n==== Menu Antrian Layanan KRS ====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Lihat Mahasiswa yang belum melakukan KRS");
            System.out.println("8. Lihat Mahasiswa yang sudah melakukan KRS");
            System.out.println("9. Clear Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM        : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama       : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi      : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas      : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa : ");
                        dilayani[0].tampilkanData();
                        dilayani[1].tampilkanData();
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.getJumlahAntrian();
                    break;
                case 7:
                    antrian.getMhsBelumDiproses();
                    break;
                case 8: 
                    antrian.getMhsSudahDiproses();
                    break;
                case 9: 
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}