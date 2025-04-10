public class MahasiswaBerprestasi03 {
    Mahasiswa03[] listMhs = new Mahasiswa03[5];
    int idx = 0;

    void tambah(Mahasiswa03 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (Mahasiswa03 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------------------");
            }
        }
    }
    void bubbleSort() {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa03 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1]; 
                    listMhs[j - 1] = temp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < idx; i++) {
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            if (listMhs[i] != null && listMhs[idxMin] != null) {
                Mahasiswa03 temp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = temp;
            }
        }
    }
    void insertionSortASC() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa03 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1] != null && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp; 
        }
    }    
    void insertionSortDSC() {
        for (int i = 1; i < listMhs.length; i++) {
            if (listMhs[i] == null) continue; 
    
            Mahasiswa03 temp = listMhs[i];
            int j = i;
    
            while (j > 0 && listMhs[j - 1] != null && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    
}
