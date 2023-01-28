import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //final int Burger = 1;
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        //int choice = sc.nextInt();
        String choice = sc.nextLine();
        switch(choice){
            case "Burger":
            System.out.println("Price is 80");
            break;
            case "Pizza":
            System.out.println("Price is 190");
            break;
            case "Drinks":
            System.out.println("Price is 70");
            break;
            case "Desserts":
            System.out.println("Price is 110");
            break;
            case "Exit":
            System.out.println("Thanks for using");
            break;
        }
    }
}
