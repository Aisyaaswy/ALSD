public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        NilaiMahasiswa[] data = {
            new NilaiMahasiswa("Ahmad", 78, 78),
            new NilaiMahasiswa("Budi", 85, 88),
            new NilaiMahasiswa("Cindy", 90, 87),
            new NilaiMahasiswa("Dian", 76, 79),
            new NilaiMahasiswa("Eko", 92, 95),
            new NilaiMahasiswa("Fajar", 88, 85),
            new NilaiMahasiswa("Gina", 80, 83),
            new NilaiMahasiswa("Hadi", 82, 84)
        };
        int tertinggi = NilaiMahasiswa.nilaiTertinggiDC(data, 0, data.length-1);
        int terendah = NilaiMahasiswa.nilaiTerendahDC(data, 0, data.length-1);
        double rerata = NilaiMahasiswa.rerataUASBF(data);
        
        System.out.println("Nilai UTS Tertinggi menggunakan Divide & Conquer : " + tertinggi);
        System.out.println("Nilai UTS Terendah menggunakan Divide & Conquer  : " + terendah);
        System.out.println("Rata-rata Nilai UAS seluruh mahasiswa menggunakan Brute Force : " + rerata);
    }
}
