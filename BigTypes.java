
//BigInteger or BigDecimal used for big calculations
//arithematic operation cant be used directly
import java.math.BigInteger;
import java.sql.Date;
import java.util.Calendar;
import java.util.date;
public class BigTypes {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1123456789012369874");
        BigInteger a = new BigInteger("745896524789855896");
        BigInteger c= a.add(b);
        System.out.println(c);

        //System Date and time
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d);
        Calendar ca = new Calendar.getInstance();
        Calendar ca2 = new Calendar.getInstance();
        ca.setTime();
    }
}
