package HomeWork;
public class Four {
    public static void main(String[] args) {
//        int [] a = new int [6];
//        for (int i = 1; i < a.length; i++) {
//            a [i] = i * 2;
//            System.out.println(a [i]);
        int [] array = new int [14];
        for (int i = 12; i < array.length; i-=2) {
            array [i] = i - 2;
              System.out.println(array[i]);
        }
    }
}
