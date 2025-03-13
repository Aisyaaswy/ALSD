public class Kendaraan {
    String nomorPlat;
    double jarakTempuh,  konsumsiBahanBakar;

    public  Kendaraan() {
    }
    
    public Kendaraan(String noPlat, double jarakTempuh, double konsumsiBahanBakar) {
        nomorPlat = noPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
    }
    double efisiensiBBM(double jarakTempuh, double konsumsiBahanBakar) {
        double efisiensi = 0;
        efisiensi = jarakTempuh / konsumsiBahanBakar;
        return efisiensi;
    }
    void printData(String noPlat, double jarakTempuh, double konsumsiBahanBakar) {
        System.out.println("Nomor plat                     : " + noPlat);
        System.out.println("Jarak Tempuh kendaraan         : " + this.jarakTempuh);
        System.out.println("Konsumsi bahan bakar kendaraan : " + this.konsumsiBahanBakar);
    };

}
