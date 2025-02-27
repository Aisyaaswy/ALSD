public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "Dosen 1";
        dosen1.nama = "Nina";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1990;
        dosen1.bidangKeahlian = "Matematika";
        dosen1.tampilInformasi();
        System.out.println();

        Dosen03 dosen2 = new Dosen03("Dosen 2", "Toni", false, 2000, "Bhs Inggris");
        dosen2.tampilInformasi();

        System.out.println("\nPercobaan Method");
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Informatika");
        dosen1.tampilInformasi();
        System.out.println("Dosen " + dosen1.nama + " telah mengajar selama " + dosen1.hitungMasaKerja(2025) + " tahun");
        System.out.println();

    }
}
