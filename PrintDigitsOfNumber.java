public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        int num= 1657;
        while(num!=0){
            System.out.println(num % 10);
            num = num/10;
        }
    }
}
