public class Mahasiswa03 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(this.nama + "\t\t" + this.nim + "\t\t" + this.kelas + "\t\t" + this.ipk);
    }
}
