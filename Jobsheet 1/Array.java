import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // menghitung ip semester dari matkul  semester lalu
        // input nama matkul,bobot sks, nilai huruf matkul
        // nilai angka matkul, hasil

        System.out.println("===================================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("===================================");
        
        String[] namaMatkul = new String[8];
        String[] nilaiHuruf = new String[8];
        int[] bobotSks = new int[8];
        double[] nilaiSetara = new double[8];
        int totalSKS = 0;
        double total = 0;
        double ip = 0;
        
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah : ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Masukkan Nilai Huruf Mata Kuliah (A/B+/B/C+/C/D/E) " + namaMatkul[i] + " : ");
            nilaiHuruf[i] = sc.nextLine();
            System.out.print("Masukkan Bobot SKS Mata Kuliah " + namaMatkul[i] + " : ");
            bobotSks[i] = sc.nextInt();
            sc.nextLine();
            totalSKS += bobotSks[i];
            
            if (nilaiHuruf[i].equals("A")) {
                nilaiSetara[i] = 4;
            } else if (nilaiHuruf[i].equals("B+")) {
                nilaiSetara[i] = 3.5;
            } else if (nilaiHuruf[i].equals("B")) {
                nilaiSetara[i] = 3;
            } else if (nilaiHuruf[i].equals("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (nilaiHuruf[i].equals("C")) {
                nilaiSetara[i] = 2;
            } else if (nilaiHuruf[i].equals("D")) {
                nilaiSetara[i] = 1;
            } else if (nilaiHuruf[i].equals("E")) {
                nilaiSetara[i] = 0;
            }

            total += bobotSks[i] * nilaiSetara[i];
            ip = total/totalSKS;
        } 
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.printf(
        "%-20s %-20s %-20s %-20s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot SKS");

        for (int i = 0; i < namaMatkul.length; i++) {
        System.out.printf(
          "%-20s %-20s %-20s %-20s\n",
            namaMatkul[i], nilaiSetara[i], nilaiHuruf[i], bobotSks[i]);
        }
        System.out.println("IP Semester : " + ip);
    } 
}