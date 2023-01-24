public class RefDemo {
public static void main(String[] args) {
    /*
     * name is variable of string type
     * string is predefined java class
     * string is a collection of characters
     * name is reference variable
     */
    String name ="Rameshwar";
    String name2= name;
    System.out.println(name==name2);//true
    String name3 = new String("Rameshwar");
    //allocate new memory
    System.out.println(name==name3);//false
    /*
     * id is a variable of int type
     * int is a data type(keyword)
     */
    int id = 1001;
}    
}
