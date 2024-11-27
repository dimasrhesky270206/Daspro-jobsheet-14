import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        int hasil = hitungPangkat(bilangan, pangkat); 
        System.out.println("Hasil " + bilangan + "^" + pangkat + " = " + hasil);

        sc.close(); 
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) { 
            return 1;
        } else { 
            int result = x * hitungPangkat(x, y - 1);
            System.out.println(x + "^" + y + " = " + result);
            return result;
        }
    }
}