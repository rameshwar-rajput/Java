import java.util.*;
class Intrest
{
public static void main(String args[])
 { 
    double SI=0.0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Principle");
    double Principle= sc.nextDouble();
    System.out.println("Enter The Time Period");
    int Time= sc.nextInt();
    System.out.println("Enter The Rate of Intrest");
    float ROI= sc.nextFloat();
    SI=(Principle*Time*ROI)/100;
    System.out.println("Simple Intrest for giver data is:"+ SI);
    System.out.println("By Rameshwar Singh");
}
}