import java.util.Scanner;
public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa03[] arrayOfMahasiswa03 = new Mahasiswa03[3];
        String dummy;

        // Mahasiswa03[] myArrayOfMahasiswa03 = new Mahasiswa03[3];
        // myArrayOfMahasiswa03[0].nim = "244107060033";
        // myArrayOfMahasiswa03[0].nama = "AGNES TITANIA KINANTI";
        // myArrayOfMahasiswa03[0].kelas = "SIB-1E";
        // myArrayOfMahasiswa03[0].ipk = (float) 3.75;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa03[i] = new Mahasiswa03();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa03[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa03[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa03[i].kelas = sc.nextLine();;
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa03[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i +  1));
            System.out.println("NIM     : " + arrayOfMahasiswa03[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa03[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa03[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa03[i].ipk);
            System.out.println("------------------------------------");
        }
    }
}