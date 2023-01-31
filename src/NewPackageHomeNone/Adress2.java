package NewPackageHomeNone;

public class Adress2 {
    public static void main(String[] args) {
        Address Address = new Address(4079, "Ukraine", "Kyiv", "Tyraspolska", 60, 230);
        System.out.println(Address.getIndex() + ", " + Address.getCountry() + ", " + Address.getCity() + ", " + Address.getStreet() + ", " + Address.getHouse() + ", " + Address.getApartment());
    }
}
