package HomeWork;

public class SevenTwo {
    static void converter (int n){
        int temp;
        temp = n % 8;
        if (n >= 8)
            converter(n / 8);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int n = 251;
        converter(n);
    }
}
