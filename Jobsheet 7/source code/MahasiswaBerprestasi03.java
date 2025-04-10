public class MahasiswaBerprestasi03 {
    Mahasiswa03[] listMhs = new Mahasiswa03[10000];
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
    int sequentialSearching(double cari) {
        int posisi =  -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }         
        }
        return posisi;   
    }
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ");
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data Mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int l, int r) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, l, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, r);
            }
        }
        return -1;
    }    
}
