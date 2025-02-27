public class Dosen03 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen03() {

    }

    public Dosen03(String ID, String nama,boolean status, int tahun, String bidangKeahlian) {
        idDosen = ID;
        this.nama = nama;
        statusAktif = true;
        this.bidangKeahlian = bidangKeahlian;
        tahunBergabung = tahun;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen              : " + idDosen);
        System.out.println("Nama Lengkap Dosen    : " + nama);
        System.out.println("Status Dosen          : " + statusAktif);
        System.out.println("Bidang Keahlian       : " + bidangKeahlian);
        System.out.println("Tahun Dosen Bergabung : " + tahunBergabung);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        thnSkrg -= tahunBergabung;
        return thnSkrg;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
