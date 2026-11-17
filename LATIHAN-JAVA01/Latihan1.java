import java.util.Scanner;

public class Latihan1 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
    
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Status: " + (nilai >= 75 ? "Lulus" : "Tidak Lulus"));
    }
}