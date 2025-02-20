public class Fungsi {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] harga = {75000, 50000, 60000, 10000};
     
    static void pendapatan() {
        System.out.println("Hasil pendapatan setiap cabang saat semua bunga habis terjual");
        for (int i = 0; i < stock.length; i++) {
            int pendapatan  = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan Cabang ke-" + (i + 1) + " : " + pendapatan);
        }
    }
    static void stockUpdate() {
        System.out.println("\nStock Awal di RoyalGarden 4 : ");
        System.out.println("Aglonema : " + stock[3][0]);
        System.out.println("Keladi   : " + stock[3][1]);
        System.out.println("Alocasia : " + stock[3][2]);
        System.out.println("Mawar    : " + stock[3][3]);

        stock[3][0] -= 1;
        stock[3][1] -= 2;
        stock[3][3] -= 5;

        System.out.println("\nStock Update di RoyalGarden 4 : ");
        System.out.println("Aglonema : " + stock[3][0]);
        System.out.println("Keladi   : " + stock[3][1]);
        System.out.println("Alocasia : " + stock[3][2]);
        System.out.println("Mawar    : " + stock[3][3]);
    }
    public static void main(String[] args) {
        pendapatan();
        stockUpdate();
    }
}
