package ClassWorkNine;

public class Test {
    public static void main(String[] args) {
        int [] a = {1, 2, 4};
        int [] b = {2, 3, 6, 7};
        int [] sum = {0};
        try {
            sum [0] = a[3] + b[3];
            System.out.println(sum[0]);
        } catch (Exception e){
            System.out.println("Не можна такого робити");
            System.out.println("ghgj");
        }
    }
}
