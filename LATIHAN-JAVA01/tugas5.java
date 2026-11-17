import java.util.Scanner;

public class tugas5 {

    public static double hitung(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka 1 : ");
        double x = input.nextDouble();

        System.out.print("Angka 2 : ");
        double y = input.nextDouble();

        System.out.print("Operator (+, -, *, /) : ");
        char op = input.next().charAt(0);

        double hasil = hitung (x, y, op);
        System.out.println("Hasil : " + hasil);
    }
}