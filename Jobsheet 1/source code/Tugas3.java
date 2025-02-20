import java.util.Scanner;
public class Tugas3 {
    static Scanner sc = new Scanner(System.in);

    public static void inputData(int jmlMatkul, String[] matkul, int[] sks, int[] sem, String[] hari) {
        System.out.println("\n========= Input Data =========");

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah  : ");
            matkul[i] = sc.nextLine();
            System.out.print("Jumlah SKS        : ");
            sks[i] = sc.nextInt();
            System.out.print("Semester Matkul   : ");
            sem[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah       : ");
            hari[i] = sc.nextLine();
        }
    }
    public static void tampilanSeluruh(int jmlMatkul, String[] matkul, int[] sks, int[] sem, String[] hari) {
        System.out.println("\n========= Seluruh Jadwal Kuliah =========");
    
        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("%-30s %-15s %-15s %-15s\n", matkul[i], sks[i], sem[i], hari[i]);
        }
    }
    public static void jadwalHari(int jmlMatkul, String[] matkul, int[] sks, int[] sem, String[] hari) {
        String hariDicari;

        System.out.println("\n========= Jadwal Kuliah Berdasarkan Hari =========");
        System.out.print("\nMasukkan Hari yang ingin dicari : ");
        hariDicari = sc.next();

        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        boolean ada = false;
        for (int i = 0; i < jmlMatkul; i++) {
            if (hari[i].equalsIgnoreCase(hariDicari)) {
                System.out.printf("%-30s %-15s %-15s %-15s\n", matkul[i], sks[i], sem[i], hari[i] );
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Data yang anda cari tidak ditemukan!\n");
        }
    }
    public static void jadwalSem(int jmlMatkul, String[] matkul, int[] sks, int[] sem, String[] hari) {
        int semDicari;

        System.out.println("\n========= Jadwal Kuliah Berdasarkan Semester =========");
        System.out.print("\nMasukkan Semester yang ingin dicari : ");
        semDicari = sc.nextInt();
        sc.nextLine();

        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        boolean ada = false;
        for (int i = 0; i < jmlMatkul; i++) {
            if (sem[i] == semDicari) {
                System.out.printf("%-30s %-15s %-15s %-15s\n", matkul[i], sks[i], sem[i], hari[i] );
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Data yang anda cari tidak ditemukan!\n");
        }
    }
    public static void infoMatkul(int jmlMatkul, String[] matkul, int[] sks, int[] sem, String[] hari) {
        String matkulDicari;

        System.out.println("\n========= Jadwal Kuliah Berdasarkan Mata Kuliah =========");
        System.out.print("\nMasukkan Nama Mata Kuliah yang ingin dicari : ");
        matkulDicari = sc.nextLine();

        System.out.printf("%-30s %-15s %-15s %-15s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        boolean ada = false;
        for (int i = 0; i < jmlMatkul; i++) {
            if (matkul[i].equalsIgnoreCase(matkulDicari)) {
                System.out.printf("%-30s %-15s %-15s %-15s\n", matkul[i], sks[i], sem[i], hari[i] );
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Data yang anda cari tidak ditemukan!\n");
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        
        String[] matkul = new String[jmlMatkul];
        int[] sks = new int[jmlMatkul];
        int[] sem = new int[jmlMatkul];
        String[] hari = new String[jmlMatkul];

    while (true) { 
        System.out.println("========= JADWAL KULIAH =========");
        System.out.println("1. Input Data");
        System.out.println("2. Menampilkan Seluruh Jadwal Kuliah");
        System.out.println("3. Menampilkan Jadwal Kuliah Berdasarkan Hari");
        System.out.println("4. Menampilkan Jadwal Kuliah Berdasarkan Semester");
        System.out.println("5. Mencari Informasi Mata Kuliah");
        System.out.println("6. Keluar");
        System.out.print("Pilih Menu yang diinginkan : ");
        int menu = sc.nextInt();
        sc.nextLine();
        
        switch (menu) {
            case 1:
                inputData(jmlMatkul, matkul, sks, sem, hari);
                break;
            case 2:
                tampilanSeluruh(jmlMatkul, matkul, sks, sem, hari);
                break;
            case 3:
                jadwalHari(jmlMatkul, matkul, sks, sem, hari);
                break;
            case 4:
                jadwalSem(jmlMatkul, matkul, sks, sem, hari);
                break;
            case 5:
                infoMatkul(jmlMatkul, matkul, sks, sem, hari);
                break;
            case 6:
                System.out.println("Program Selesai! \n~Terima Kasih telah menggunakan program kami~");
                return;
            default:
                System.out.println("Pilihan yang anda masukkan tidak valid! Silakan masukkan lagi");
                break;
            }
        }
    }
}
