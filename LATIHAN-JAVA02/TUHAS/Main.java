class Mahasiswa {
    String nama;
    String nim;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
};

public class main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.nim = "12345";
        mhs1.tampilkanData();
    };
};