public class Staff extends Karyawan {
    public Staff(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double tunjangan() {
        return (0.10 * gajiPokok) + 500000;
    }
}