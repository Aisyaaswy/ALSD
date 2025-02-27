public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 basdat = new MataKuliah03();
        basdat.kodeMK = "BD";
        basdat.nama = "Basis Data";
        basdat.sks = 2;
        basdat.jmlJam = 12;

        basdat.tampilInformasi();
        System.out.println();
        basdat.kurangiJam(8);
        basdat.ubahSKS(3);
        basdat.tampilInformasi();
        System.out.println();

        MataKuliah03 BIG = new MataKuliah03("BIG", "Bahasa Inggris", 2, 4);
        BIG.tampilInformasi();
        System.out.println();
        BIG.tambahJam(4);
        BIG.tampilInformasi();
        System.out.println();
    }
}
