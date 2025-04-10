public class NilaiMahasiswa {
    String nama;
    int UTS, UAS;

    NilaiMahasiswa(String nama, int UTS, int UAS) {
        this.nama = nama;
        this.UTS = UTS;
        this.UAS = UAS;
    }
    static int nilaiTertinggiDC(NilaiMahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].UTS;
        }
        int mid = (l + r) / 2;
        int lmax = nilaiTertinggiDC(mhs, l, mid);
        int rmax = nilaiTertinggiDC(mhs, mid + 1, r);

        return Math.max(lmax, rmax);
    }
    static int nilaiTerendahDC(NilaiMahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].UTS;
        }
        int mid = (l + r) / 2;
        int lmin = nilaiTertinggiDC(mhs, l, mid);
        int rmin = nilaiTertinggiDC(mhs, mid + 1, r);

        return Math.min(lmin, rmin);
    }
    static double rerataUASBF(NilaiMahasiswa[] mhs) {
        int total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].UAS;
        }
        return (double) total/mhs.length;
    }
}
