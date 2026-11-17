public class tugas1 {

    public static int tambah  (int a, int b) {
        return a + b;
    }

    public static void main (String [] args) {

        int x = 10;
        int y = 5;


        if (x > y) {
            System.out.println("x lebih besar dari y");
        }else {
            System .out.println("x lebih kecil atau sama dengan y");
        }

        System.out.println("Hasil penjumlahan :" + tambah(x, y));

        for (int i=1; i<=5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    }
}