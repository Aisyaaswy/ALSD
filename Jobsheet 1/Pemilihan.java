import java.util.Scanner;
public class Pemilihan {
    
    public static boolean validasi (int angka) {
        return angka >= 0 && angka <= 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===================================");

        System.out.print("Masukkan Nilai Tugas : ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis  : ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS   : ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS   : ");
        int nilaiUAS = sc.nextInt();
        System.out.println("===================================");
        System.out.println("===================================");
        
        if (!(validasi(nilaiTugas) && validasi(nilaiKuis) && validasi(nilaiUTS) && validasi(nilaiUAS))) {
            System.out.println("Nilai yang anda masukkan tidak valid!");
            return;
        }

        double hasil = (nilaiTugas * 0.2 + nilaiKuis * 0.2 + nilaiUTS * 0.3 + nilaiUAS * 0.3);
        
        String nilaiHuruf;
        if (hasil <= 39) {
            nilaiHuruf = "E";
        } else if (hasil <= 50) {
            nilaiHuruf = "D";
        } else if (hasil <= 60) {
            nilaiHuruf = "C";
        } else if (hasil <= 65) {
            nilaiHuruf = "C+";
        } else if (hasil <= 73) {
            nilaiHuruf = "B";
        } else if (hasil <= 80) {
            nilaiHuruf = "B+";
        } else {
            nilaiHuruf = "A";
        }
        
        System.out.println("Nilai Akhir : " + hasil);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
    
        if (nilaiHuruf.equals("D") || (nilaiHuruf.equals("E"))) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("LULUS");
        }
    }
}