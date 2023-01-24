package HomeWork;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
//   Task 1
//        String [] days = {"Monday", "Tuesday", "Wednesday"};
//        System.out.println(days[2]);
//
//        int[] MyNum = new int[]{12, 65, 876};
//        System.out.println(MyNum[1]);
//
//        double [] Prices = {12.5, 44.6, 87.45};
//        Prices [1] = 33.22;
//        System.out.println(Prices[1]);
//
//        byte [] array = new byte[10];
//        System.out.println(array.length);
//
//        float[] Number = new float[] {3.1f, 7.15f};
//        System.out.println(Number[0]);

//   Task 2
          int [] MyNumOne = { 1, 2, 3, 4};
          int [] MyNumTwo = {12, 10, 5, 3, 1};
          int [] sum = new int[MyNumTwo.length + MyNumOne.length];
           for (int i = 0; i <= MyNumTwo.length; i++) {
            sum [i] = MyNumOne [i] + MyNumTwo [i];
            System.out.println(sum [i] + " ");
//           Або такий варіант ще
//        System.out.println(MyNumOne [0] + " " + MyNumTwo [0]);
//        System.out.println(MyNumOne [1] + " " + MyNumTwo [1]);
//        System.out.println(MyNumOne [2] + " " + MyNumTwo [2]);
//        System.out.println(MyNumOne [3] + " " + MyNumTwo [3]);
//        System.out.println(MyNumOne [4] + " " + MyNumTwo [4]);
// Цикл з передумовою
//     int number = 3; // число
//     int i = 1; // степень
//     while (i <=5) {//предусловие
//         System.out.println(Math.pow(number, i));
//        i++;
//        }
//        System.out.println();
// Цикл з пост умовою
//        int a = 3;
//        int b = 8;
//        do {
//            int c = a + b;
//            System.out.println(c);
//            a++;
//        } while (a < 8);
//  Арифметична прогресія
//      int n = 1;
//      int a1 = -6;
//      int a2 = -8;
//      int d = a2 - a1;
//        System.out.println("d =" + d);
//        for (int i = n; i < 10; i++) {
//            n++;
//            int sum = a1 + (d * (n-1));
//            System.out.println("evar arifmetic = " + sum);
//        }
//  Геометрична прогресія
//        int b1 = -3;
//        int b2 = 6;
//        int n1 = 1;
//        int p = b2 / b1;
//        System.out.println("p = " + p);
//        for (int i = n1; i < 5; i++) {
//            int b = (int)(b1 *Math.pow(p, n1++));
//            System.out.println("evar geometric = " +b);
        }
    }
}