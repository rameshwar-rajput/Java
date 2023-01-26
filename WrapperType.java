//wrapper type creates objects/heap and creates reference/address in memory
public class WrapperType {
    public static void main(String[] args) {
        //Integer a= 10; //AutoBoxing
        Integer a = new Integer(10); //manual way of Boxing
        Integer b= 20;
        Integer c= a.intValue() +b; //a for manual UnBoxing
        System.out.println(c);
    }
}
 //why wrapper class?
 //Wrapper have pre defined methods
 //primitive data types store values, wrapper have the raference
 /*predefined data structure

 LinkedList<cart> carts = new LinkedList<>();
 LinkedList<String> cartItems = new LinkedList<>();
 cartItems.add("Mobile");
 cartItems.add("Phone");
 LinkedList<Double> list = new LinkedList<>();*/