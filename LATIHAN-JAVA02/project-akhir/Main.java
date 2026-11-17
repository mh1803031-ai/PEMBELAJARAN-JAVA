import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Mahasiswa> data = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== SISTEM DATA MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    EditData();
                    break;
                case 4:
                    HapusData();
                    break;
                case 5:
                    System.out.println("Program Selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak Tersedia!");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan: ");
        String jurusan = input.nextLine();

        data.add(new Mahasiswa(nama, nim, jurusan));
        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilData() {
        if (data.isEmpty()) {
            System.out.println("Belum Ada Data!");
            return;
        }else {
            System.out.println("\n===== DATA MAHASISWA =====");
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". Nama: " + data.get(i).getNama());
                System.out.println("   NIM: " + data.get(i).getNim());
                System.out.println("   Jurusan: " + data.get(i).getJurusan());
                System.out.println("---------------------------");
            }
        }
    }
    static void EditData() {
        tampilData();
        System.out.print("Masukkan NIM Mahasiswa yang ingin diubah: ");
        String nimCari = input.nextLine();

        for (Mahasiswa m : data) {
            if (m.getNim().equalsIgnoreCase(nimCari)) {
                System.out.print("Nama Baru: ");
                m.setNama(input.nextLine());
                System.out.print("Jurusan Baru: ");
                m.setJurusan(input.nextLine());
                System.out.println("Data berhasil diubah!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }

    static void HapusData() {
        tampilData();
        System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
        String nimCari = input.nextLine();

        for (Mahasiswa m : data) {
            if (m.getNim().equalsIgnoreCase(nimCari)) {
                data.remove(m);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan!");
    }
}