public class Mahasiswa03 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }
    
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;  
    }
}
