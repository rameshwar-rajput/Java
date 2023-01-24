import java.util.*;
public class Salary {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary of Employ");
        double Salary=sc.nextDouble();
        double HRA= 0.5*Salary;
        double TA= 0.3*Salary;
        double MA= 0.25*Salary;
        double PF= 0.1*Salary;
        double Gross=(Salary+HRA+TA+MA);
        double Tax=0.1*Gross;

    



        System.out.println("          Bank pvt ltd.");
        System.out.println("       Salary Slip for Jan 2023");
        System.out.println("Name- Rameshwar Singh   Bank Name- J&K");
        System.out.println("Emp. nO - 10001        A/C no.  - 1234567896");
        System.out.println("Designation-CEO");
        System.out.println();
        System.out.println("     Earnings                   Deductions");
        System.out.println("BASIC Salary-"+Salary+"            Tax-"+Tax);
        System.out.println("HRA-"+HRA);
        System.out.println("TA-"+TA);
        System.out.println("MA-"+MA);
        System.out.println("Gross salary"+Gross);




    }
    
}
