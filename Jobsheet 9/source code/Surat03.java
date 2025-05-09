public class Surat03 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat03() {
    }

    public Surat03(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void cetakSurat() {
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        if (jenisIzin == 'S') {
            System.out.println("Jenis Izin      : Sakit");
        } else if (jenisIzin == 'I') {
            System.out.println("Jenis izin      : izin");
        }
        System.out.println("Durasi          : " + durasi + " hari");
    }
}
