import java.util.Scanner;

public class Tugas1 {
    public static void tampilkanRekursif(int n) {
        if (n < 0) { 
            return;
        }
        System.out.print(n + " "); 
        tampilkanRekursif(n - 1); 
    }

    public static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) { 
            System.out.print(i + " "); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        try {
            int n = scanner.nextInt();
            System.out.println("\nMenggunakan fungsi rekursif:");
            tampilkanRekursif(n);

            System.out.println("\n\nMenggunakan fungsi iteratif:");
            tampilkanIteratif(n);
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat!");
        } finally {
            scanner.close();
        }
    }
}
