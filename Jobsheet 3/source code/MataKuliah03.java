import java.util.Scanner;
public class MataKuliah03 {
    public String kode, nama, dummy;
    public int sks, jmlJam;

    public MataKuliah03() {
    }
    public MataKuliah03(String kode, String nama, int sks, int jmlJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }
    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("SKS         : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah jam  : ");
        this.jmlJam = sc.nextInt();
    }
    public void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("SKS         : " + this.sks);
        System.out.println("Jumlah jam  : " + this.jmlJam);
    }
}