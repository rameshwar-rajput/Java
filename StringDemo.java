public class StringDemo{
    public static void main(String[] args) {
        /*
         * String objects can be created in 2 styles
         * a) String Literal- first check in pool if string exists or not, otherwise point to old one
         * b) New object- create one object in a pool if not exist and another one 
         */
        String name = "Rameshwar";//String Literal
        String name2 = "Rameshwar";//STring Literal
        //internally string name Rameshwar.intern()
        System.out.println(name==name2);
        String name3= new String("Rameshwar");
        String name4= new String("Ramesh");
        String name5= new String("Rameshwar").intern();
        System.out.println(name==name3);
        System.out.println(name==name5);
    }
    
}
