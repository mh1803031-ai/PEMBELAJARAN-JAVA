public class tugas3 {
    public static void main (String[] args) {
        int total = hitungGaji(50000, 15);
        System.out.println("Total Gaji =" + total);
    }

    public static int hitungGaji(int gajiHarian, int jumlahHari) {
        return gajiHarian * jumlahHari;
    }
}