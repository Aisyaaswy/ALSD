public class Pangkat {
    int nilai, pangkat;

    Pangkat(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // int PangkatBF(int a, int n) {
    //     int hasil = 1;
    //     for (int i = 0; i < n; i++) {
    //         hasil = hasil * a;
    //     }
    //     return hasil;
    // }
    int PangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }
    int PangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2) * a);
            } else {
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2));
            }
        }
    }
}
