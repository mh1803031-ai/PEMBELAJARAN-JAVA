class Mahasiswa {
    private int umur;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh negatif.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();

        m.setUmur(19);
        System.out.println(m.getUmur());

        m.setUmur(-5);
    }
}