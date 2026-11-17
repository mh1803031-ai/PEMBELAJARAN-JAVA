public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("Luas Persegi (sisi 5)        : " + persegi.hitungLuas());
        System.out.printf("Luas Lingkaran (jari-jari 7) : %.2f\n", lingkaran.hitungLuas());
    }
}
