import java.util.ArrayList;
import java.util.Scanner;

public class tugas4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> barang = new ArrayList<>();
        int pilih;

        do{
            System.out.println("\n=== MENU DATA BARANG ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    barang.add(input.nextLine());
                    break;
                case 2:
                    System.out.println("\nDaftar Barang:");
                    for(int i = 0; i < barang.size(); i++){
                        System.out.println((i + 1) + ". " + barang.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Hapus Barang Nomor: ");
                    int index = input.nextInt();
                    barang.remove(index - 1);
                    break;
                case 4:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilih != 4);
    }
}