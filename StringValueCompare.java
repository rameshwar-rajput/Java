public class StringValueCompare {
    public static void main(String[] args) {
        String name = "Rameshwar";
        String name2 = new String("Rameshwar");
        System.out.println("Ref Compare "+ (name == name2));
        System.out.println("Value Compare "+(name.equals(name2)));
        System.out.println("rameshwar".equalsIgnoreCase("Amit"));
        System.out.println("Rameshwar".compareTo("Ram")); //positive value means second value is smaller
        System.out.println("Ram".compareTo("Rameshwar"));//negative value means first value is smaller
    }
    
}
