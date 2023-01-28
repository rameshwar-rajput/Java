/*
 * enum is a special type and it represents group of constants
 */
//enum is a keyword , then given enum name
enum FoodItems{
    BURGER, PIZZA, DRINKS, DESSERTS //group of constants(upper case) 
}
public class EnumDemo {
    public static void main(String[] args) {
        FoodItems item = FoodItems.PIZZA;
        System.out.println(item);
        System.out.println(item.ordinal());
        switch(item){
            case BURGER:
            System.out.println("Price is 80");
            case PIZZA:
            System.out.println("Price is 190");
            case DRINKS:
            System.out.println("Price is 70");
            case DESSERTS:
            System.out.println("Price is 110");
        }
    }
}
