package HomeWork;

public class Six {
    static void TestMethod (){
        int[] a = new int[]{5, 1};
        int[] b = new int[]{15, 3};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            for (int j = 0; j < b.length; j++) {
                c[i] = b[i];
                int result = a[i] * b[j];
                System.out.println(result);
            }
        }
    }
    public static void main(String[] args) {
        TestMethod();

    }
}

