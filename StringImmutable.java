public class StringImmutable {
    //whenever you make changes in string, it gets a new value
    public static void main(String[] args) {
        String name = "Ram";
        String name2 = "Ram";
        String name3 = "Ram";
        System.out.println(name==name3);
        name3 = "Rameshwar";
        System.out.println(name==name3);
    }
}
