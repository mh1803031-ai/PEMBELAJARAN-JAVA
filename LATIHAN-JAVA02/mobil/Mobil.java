public class Mobil {
    private String merk;
    private String warna;
    private int tahun;

    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
}


    public void tampilkanData() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println("------------------------");
    }
}