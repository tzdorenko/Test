package HomeWork;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        char operator = 0;
        double num1, num2, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = input.nextDouble();
        System.out.println("Enter the operator: +, -, *, /, ^, %");
        operator = input.next().charAt(0);
        System.out.println("Enter second number");
        num2 = input.nextDouble();
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + " = " + result);
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.println(" degree = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("division with a remainder = " + result);
                break;
            default:
                System.out.println("Wrong format");
        }
    }
}
