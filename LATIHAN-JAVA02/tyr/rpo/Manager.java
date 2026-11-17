public class Manager extends Karyawan {
    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double tunjangan() {
        return (0.30 * gajiPokok) + 1500000;
    }
}