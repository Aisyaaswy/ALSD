import java.util.Scanner;
public class Tugas2 {

    static Scanner sc = new Scanner(System.in);
    static int sisi;
    
    public static int volumeKubus() {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
        return volume;
    }
    public static int luasPermukaan() {
        int luas = 6 * (sisi * sisi);
        System.out.println("Luas Kubus : " + luas);
        return luas;
    }
    public static int keliling() {
        int keliling = 12 * sisi;
        System.out.println("Keliling Kubus : " + keliling);
        return keliling;
    }
    public static void main(String[] args) {
        
        while (true) { 
            int menu = 0;

            System.out.println("====== PILIHAN MENU ======");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Silakan pilih menu yang diinginkan : ");
            menu = sc.nextInt();

            switch (menu) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus : ");
                sisi = sc.nextInt();
                volumeKubus();
                break;
            case 2:
                System.out.print("Masukkan panjang sisi kubus : ");
                sisi = sc.nextInt();
                luasPermukaan();
                break;
            case 3:
                System.out.print("Masukkan panjang sisi kubus : ");
                sisi = sc.nextInt();
                keliling();
                break;
            case 4:
                System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM KAMI!");
                return;
            default:
                System.out.println("Menu yang anda masukkan tidak valid!");
                break;
            }
        }
    }
}