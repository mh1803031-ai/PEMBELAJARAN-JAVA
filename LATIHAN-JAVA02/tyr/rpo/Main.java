public class Main {
    public static void main(String[] args) {
        Karyawan k1 = new Manager("Andi", 10000000);
        Karyawan k2 = new Staff("Budi", 5000000);

        System.out.println("=== DATA TUNJANGAN KARYAWAN ===");
        System.out.printf("Manager (%s) : Rp%.0f\n", k1.getNama(), k1.tunjangan());
        System.out.printf("Staff   (%s) : Rp%.0f\n", k2.getNama(), k2.tunjangan());
    }
}