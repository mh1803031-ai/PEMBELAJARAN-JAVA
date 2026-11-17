public class Main {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(500000);

        System.out.println("Saldo Awal : Rp" + akun1.getSaldo());
        System.out.println("--------------------------------");

        akun1.setorUang(250000);
        System.out.println("Saldo Kini : Rp" + akun1.getSaldo());
        System.out.println("--------------------------------");

        akun1.tarikUang(300000);
        System.out.println("Saldo Kini : Rp" + akun1.getSaldo());
        System.out.println("--------------------------------");

        akun1.tarikUang(1000000);
        System.out.println("Saldo Akhir: Rp" + akun1.getSaldo());
    }
}