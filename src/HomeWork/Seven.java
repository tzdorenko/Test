package HomeWork;

public class Seven {

static int NumberMethod (int x, int y){
    int result =0;
    for (int i = 0; i < y; i++) {
        result = (x + i) * 2;
        System.out.println(result);
    }
    return result;
}
static void NumberMethod(double x, double y){
    double result2 = 0;
    for (int i = 0; i < y; i++) {
        result2 = (x + i) * 2;
        System.out.println(result2);
    }
}
      public static void main(String[] args) {
NumberMethod(2,6);
          System.out.println();
NumberMethod(3.5, 6.3);
        }
}

