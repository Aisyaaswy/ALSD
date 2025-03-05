import java.util.Scanner;
public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        boolean jenisKelamin =  true;
        int usia;

        System.out.print("Jumlah Data Dosen yang akan dimasukkan : ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();

        Dosen03[] arrayOfDosen03 = new Dosen03[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                       : ");
            kode = sc.nextLine();
            System.out.print("Nama                       : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin(Wanita/Pria) : ");
            dummy =  sc.nextLine();
            if (dummy.equalsIgnoreCase("pria")) { 
                jenisKelamin = true; 
            } else if(dummy.equalsIgnoreCase("wanita")) { 
                jenisKelamin = false;
            }
            System.out.print("Usia                       : ");
            dummy = sc.nextLine();
            usia  = Integer.parseInt(dummy);
            System.out.println("----------------------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }
        int index_dosen = 1;
        for (Dosen03 dosen03 : arrayOfDosen03) {
            System.out.println("----------------------------------------------");
            System.out.println("Data Dosen ke-" + (index_dosen));
            System.out.println("Kode            : " + dosen03.kode);
            System.out.println("Nama            : " + dosen03.nama);
            if (dosen03.jenisKelamin) {
                System.out.println("Jenis Kelamin   : Pria");
            } else {
                System.out.println("Jenis Kelamin   : Wanita");
            }
            System.out.println("Usia            : " + dosen03.usia);
            index_dosen++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("Memanggil seluruh method dalam class DataDosen");
        DataDosen03 dataDosen03 = new DataDosen03();
        dataDosen03.dataSemuaDosen(arrayOfDosen03);
        dataDosen03.jumlahDosenPerJenisKelamin(arrayOfDosen03);
        dataDosen03.rerataUsiaDosenPerJenisKelamin(arrayOfDosen03);
        dataDosen03.infoDosenPalingTua(arrayOfDosen03);
        dataDosen03.infoDosenPalingMuda(arrayOfDosen03);
    }
}