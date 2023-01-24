package ClassWorkNine;

import static ClassWorkNine.Third.meth2;

public class Second {
    public static void main(String[] args) {
        First first = new First("Tanya","Zdorenko", 40);
        System.out.println(first.name);
        System.out.println(first.surname);
        System.out.println(first.age);
        First fir2 = new First("Red", "Yel3");
        System.out.println(fir2.name);
        System.out.println(fir2.surname);;
        System.out.println(fir2.age);
        First rt = new First();
//        rt.name = "Name";
//        rt. surname = "Surname";
//        rt.age = 10;
        System.out.println(rt.name);
        System.out.println(rt.surname);
        System.out.println(rt.age);

    }

}
