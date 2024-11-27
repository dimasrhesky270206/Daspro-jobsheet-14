
public class tugas4 {

    public static void main(String[] args) {
        int bulan = 12; 
        int jumlahPasanganMarmut = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + jumlahPasanganMarmut);
    }
    public static int hitungPasanganMarmut(int bulan) {
        // Kasus dasar
        if (bulan == 1) {
            return 1;
        } else if (bulan == 2) {
            return 1; 
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}