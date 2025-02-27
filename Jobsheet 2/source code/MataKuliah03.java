public class MataKuliah03 {
    String kodeMK, nama;
    int sks, jmlJam;

    public MataKuliah03() {

    }

    public MataKuliah03(String kode, String nm, int SKS, int jml) {
        kodeMK = kode;
        nama = nm;
        sks = SKS;
        jmlJam = jml;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah              : " + kodeMK);
        System.out.println("Nama Mata Kuliah              : " + nama);
        System.out.println("Jumlah SKS Mata Kuliah        : " + sks);
        System.out.println("Jumlah jam/minggu Mata Kuliah : " + jmlJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jmlJam += jam;
    }
    
    void kurangiJam(int jam) {
        if (jmlJam >= jam) {
            jmlJam -= jam;
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan!");
        }
    }
}
