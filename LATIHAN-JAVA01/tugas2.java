import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[5];

        for(int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();
        }

        System.out.println("\nDaftar Nama:");
        for(String n : nama) {
            System.out.println(n);
        }
    }
}