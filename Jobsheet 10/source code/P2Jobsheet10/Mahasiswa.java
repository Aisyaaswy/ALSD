public class Mahasiswa {
    String nim, nama, prodi, kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " nama " + " - " + prodi + " - " + kelas);
    }
}