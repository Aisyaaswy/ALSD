import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 6 & 10 = x
        // angka ganjil = *
        // n = 2 - digit terakhiir NIM
        // bila n < 10 tambahkan 10(n + 10)

        System.out.print("Masukkan NIM anda : ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }   
    } 
}
