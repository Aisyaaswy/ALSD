public class DataDosen03 {
    static int jmlDosPri = 0;
    static int jmlDosWa = 0;

    void dataSemuaDosen(Dosen03[] arrayOfDosen03) {
        int index_dosen = 1;
        for (Dosen03 dosen03 : arrayOfDosen03) {
            System.out.println("----------------------------------------------");
            System.out.println("Data Dosen ke-" + (index_dosen));
            System.out.println("Kode            : " + dosen03.kode);
            System.out.println("Nama            : " + dosen03.nama);
            if (dosen03.jenisKelamin) {
                System.out.println("Jenis Kelamin   : Pria");
            } else {
                System.out.println("Jenis Kelamin   : Wanita");
            }
            System.out.println("Usia            : " + dosen03.usia);
            index_dosen++;
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        for (Dosen03 dosen03 : arrayOfDosen03) {
            if (dosen03.jenisKelamin) {
                jmlDosPri++;
            } else {
                jmlDosWa++;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Jumlah Dosen Pria   : " + jmlDosPri);
        System.out.println("Jumlah Dosen Wanita : " + jmlDosWa);
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int jmlUsiaDosPri = 0;
        int jmlUsiaDosWa = 0;
        double rerataDosPri = 0;
        double rerataDosWa = 0;
        for (Dosen03 dosen03 : arrayOfDosen03) {
            if (dosen03.jenisKelamin) {
                jmlUsiaDosPri += dosen03.usia;
                rerataDosPri = jmlUsiaDosPri/jmlDosPri;
            } else {
                jmlUsiaDosWa += dosen03.usia;
                rerataDosWa = jmlUsiaDosWa/jmlDosWa;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Rerata Usia Dosen Pria   : " + rerataDosPri);
        System.out.println("Rerata Usia Dosen Wanita : " + rerataDosWa);
    }
    void infoDosenPalingTua(Dosen03[] arrayOfDosen03) {
        int oldest = 0;
        String oldestName = "";
        for (Dosen03 dosen03 : arrayOfDosen03) {
            if (dosen03.usia >= oldest) {
                oldest = dosen03.usia;
                oldestName = dosen03.nama;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println(
            "Dosen yang paling tua merupakan dosen " + oldestName + " berusia " + oldest + " tahun");
    }
    void infoDosenPalingMuda(Dosen03[] arrayOfDosen03) {
        int youngest = 10000;
        String youngestName = "";
        for (Dosen03 dosen03 : arrayOfDosen03) {
            if (dosen03.usia <= youngest) {
                youngest = dosen03.usia;
                youngestName = dosen03.nama;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println(
            "Dosen yang paling muda merupakan dosen " + youngestName + " berusia " + youngest + " tahun");
    }
}