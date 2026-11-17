interface Kendaraan {
    void berjalan();
}

class Mobil implements Kendaraan {
    public void berjalan() {
        System.out.println("Mobil berjalan di jalan raya.");
    }
}