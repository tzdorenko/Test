package HomeWork;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
//     TaskOne
//        int a = 100;
//        int b = 200;
//        System.out.println("max = " + Math.max(a, b));
//        System.out.println("min = " + Math.min(a, b));
//     TaskTwo
//        int a = 100;
//        int b = 200;
//        int c = 500;
//        int m = Math.max(a, b);
//        int n = Math.min(a, b);
////        System.out.println("max from a, b= " + m);
////        System.out.println("min from a, b = " + n);
//        int m2 = Math.max(m, c);
//        int n2 = Math.min(n, c);
//        System.out.println("max from a, b ,c = " + m2);
//        System.out.println("min from a, b, c = " + n2);
//        System.out.println("середнє значення = " + ((a + b +c) - (m2 + n2)));
//     Task Three
        int day = 12;
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Good Morning");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Good Day");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Good Evening");
                break;
            default:
                System.out.println("Wrong data");
        }
    }
}
