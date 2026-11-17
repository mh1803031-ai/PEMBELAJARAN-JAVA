class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Gukguk");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing();
        Hewan hewan2 = new Kucing();

        hewan1.suara(); 
        hewan2.suara(); 
    }
}