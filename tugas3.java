import java.util.Scanner;
public class tugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println(n + " bukan bilangan prima.");
        } else {
            if (cekPrimaRekursif(n, n - 1)) {
                System.out.println(n + " adalah bilangan prima.");
            } else {
                System.out.println(n + " bukan bilangan prima.");
            }
        }
        
        scanner.close();
    }
    public static boolean cekPrimaRekursif(int n, int divisor) {
        if (divisor < 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return cekPrimaRekursif(n, divisor - 1);
    }
}