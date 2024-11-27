import java.util.Scanner;

public class tugas2 {
    public static int hitungPenjumlahan(int f) {
        if (f <= 1) { 
            return f;
        }
        return f + hitungPenjumlahan(f - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan f (harus >= 1): ");
        try {
            int f = scanner.nextInt();

            if (f < 1) {
                System.out.println("Bilangan harus lebih besar atau sama dengan 1.");
            } else {
                
                int hasil = hitungPenjumlahan(f);

                System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat!");
        } finally {
            scanner.close();
        }
    }
}
