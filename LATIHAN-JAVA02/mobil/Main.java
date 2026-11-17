public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Avanza", "Hitam", 2022);
        Mobil mobil2 = new Mobil("Civic", "Putih", 2024);

        System.out.println("=== DATA MOBIL 1 ===");
        mobil1.tampilkanData();

        System.out.println("=== DATA MOBIL 2 ===");
        mobil2.tampilkanData();
    }
}