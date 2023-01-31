package HomeWorkTen;

public class Toyota extends Cars {
    @Override
    public void carsMark() {
        System.out.println("Toyota prius");
    }

    @Override
    public void price() {
        super.price();
        System.out.println(10000);
    }
}
