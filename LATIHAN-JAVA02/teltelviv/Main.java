class Siswa {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class Main {
    public static void main (String[] args) {
        Siswa s = new Siswa();
        s.setNama("Andi");
        System.out.println(s.getNama());
    }
}