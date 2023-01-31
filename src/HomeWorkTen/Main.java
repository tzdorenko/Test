package HomeWorkTen;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars();
        Mers mers = new Mers();
        Toyota toyota = new Toyota();
        BMV bmv = new BMV();
        cars.carsMark();
        mers.carsMark();
        toyota.carsMark();
        bmv.carsMark();
        toyota.price();
        mers.price();
    }
}
