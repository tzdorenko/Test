import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int cost = 0;
        System.out.println("Size: 1 -small, 2 - medium, 3 - large");
        Scanner input = new Scanner(System.in);
        String coffeeMachine = input.next();
        switch (coffeeMachine){
            case "3":
                cost +=50;
            case "2":
                cost +=25;
            case "1":
                cost +=25;
                break;
            default:
                System.out.println("wrong number");
                break;
        }
        if (cost!=0){
            System.out.println("give the cost");
            System.out.println("Thanks");
        }else {
            System.out.println("repeat");
        }
    }
}
