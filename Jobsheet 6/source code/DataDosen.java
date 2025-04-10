public class DataDosen {
    Dosen[] listDosen = new Dosen[10];
    int idx = 0;

    void tambah(Dosen d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Dosen d : listDosen) {
            if (d != null) {
                d.tampil();
                System.out.println("-------------------------------");
            }
        }
    }
    void bubbleSort() {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (listDosen[j].usia > listDosen[j - 1].usia) {
                    Dosen temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1]; 
                    listDosen[j - 1] = temp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < idx; i++) {
            int idxMax = i; 
            for (int j = i + 1; j < idx; j++) {
                if (listDosen[j] != null && listDosen[idxMax] != null && listDosen[j].usia > listDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            if (listDosen[i] != null && listDosen[idxMax] != null) {
                Dosen temp = listDosen[idxMax];
                listDosen[idxMax] = listDosen[i];
                listDosen[i] = temp;
            }
        }
    }
    void insertionSort() {
        for (int i = 1; i < listDosen.length; i++) {
            if (listDosen[i] == null) continue; 
    
            Dosen temp = listDosen[i];
            int j = i;
    
            while (j > 0 && listDosen[j - 1] != null && listDosen[j - 1].usia < temp.usia) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}
