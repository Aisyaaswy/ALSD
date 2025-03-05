public class MahasiswaMain03 {
    public static void main(String[] args) {
        Mahasiswa03 mhs1 =  new Mahasiswa03();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        System.out.println();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        System.out.println();

        Mahasiswa03 mhs2 = new Mahasiswa03("Annisa Nabila", "2141720160", 3.25, "TI 2L\n");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa03 mhsRani = new Mahasiswa03("Rani", "244107020109", 3.9, "TI 2H");
        mhsRani.tampilkanInformasi();
    }
}