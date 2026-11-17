public class AkunBank {
    private double saldo;

    public AkunBank(double saldoAwal) {
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor Rp" + jumlah);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0!");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0!");
        } else if (jumlah > saldo) {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Berhasil tarik Rp" + jumlah);
        }
    }
}