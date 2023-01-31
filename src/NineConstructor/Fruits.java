package NineConstructor;

public class Fruits {
    String kind;
    int price;

    public Fruits() {
    }

    public Fruits(String kind) {
        this.kind = kind;
    }

    public Fruits(String kind, int price) {
        this.kind = kind;
        this.price = price;
    }

    public static void main(String[] args) {
        Fruits apple = new Fruits();
        apple.kind = "Green";
        apple.price = 15;
        System.out.println(apple.kind + " " + apple.price);
        Fruits pear = new Fruits("Pear bear");
        pear.price = 45;
        System.out.println(pear.kind + " " + pear.price);
        Fruits bananas = new Fruits("Babies", 120);
        System.out.println(bananas.kind + " " + bananas.price);
    }
}
