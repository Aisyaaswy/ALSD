public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan arrOfKendaraan = new Kendaraan();
        String[] nomorPlat = {"1234", "2345", "3456"};
        double[] jarakTempuh = {500, 4000, 700};
        double[] konsumsiBahanBakar = {30, 85, 40};

        for (int i = 0; i < 3; i++) {
            Kendaraan arrOfKendaraan[i] = 
            System.out.println("Nomor plat ke" + (i + 1) + " : " + nomorPlat[i]);
            System.out.println("Jarak Tempuh kendaraan         : " + nomorPlat[i]);
            System.out.println("Konsumsi bahan bakar kendaraan : " + konsumsiBahanBakar[i]);
        }

        Kendaraan.efisiensiBBM(arrOfKendaraan); 
        Kendaraan.printData(arrOfKendaraan);
    }
}
