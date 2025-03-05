import java.util.Scanner;
public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Data Mata Kuliah yang akan dimasukkan : ");
        int jmlData = sc.nextInt();

        MataKuliah03[] arrayOfMataKuliah03 = new MataKuliah03[jmlData];
        String kode, nama, dummy;
        int sks, jmlJam;


        for (int i = 0; i < jmlData; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah03[i] = new MataKuliah03();
            arrayOfMataKuliah03[i].tambahData();
            System.out.println("------------------------------------");
        }
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah03[i].cetakInfo();
            System.out.println("------------------------------------");
        }
    }    
}
