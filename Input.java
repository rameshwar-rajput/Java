import java.util.Scanner;
public class Input {
   public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    //string name = scanner.next();
    String name = sc.nextLine();
    System.out.println("Your name is "+name);
    System.out.println("Enter your id");
    int id = sc.nextInt();
    System.out.println("Id is "+id);
    sc.close();
    /*byte arr[]= System.in.readAllBytes();
    int singleByte= System.in.read();
    System.out.println("Name "+singleByte);*/
   } 
}
