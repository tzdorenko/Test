package NineConstructor;

public class Main {
    public static void main(String[] args) {
        Fruits kiwi = new Fruits();
        kiwi.kind = "ukrainian";
        kiwi.price = 70;
        System.out.println(kiwi.kind + " " + kiwi.price);
        Fruits orange = new Fruits("red");
        orange.price = 85;
        System.out.println(orange.kind + " " + orange.price);
        Fruits berryis = new Fruits("strawberry", 150);
        System.out.println(berryis.kind + berryis.price);
        System.out.println("kiwi and strawberry = " + kiwi.price + " + " + berryis.price);
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
