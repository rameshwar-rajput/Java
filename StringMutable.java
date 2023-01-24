public class StringMutable {
    //StringBuffer default capacity is 16
    //StringBuffer is old version and is synchronized(locked)
    //new capacity when the length exceeds capacity = (old capacity * 2 + 2)
    //further if it exceeds, length becomes the new capacity
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rameshwar");
       /* StringBuilder sb = new SringBuilder();
        synchronized(sb){ //use with StringBuilder
            sb.append("aaaa");
            sb.append("bbbbb");
        }*/
        System.out.println(sb.capacity()); //16 + 9
        System.out.println(sb.length());
        sb.append("Singh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("alpha beta gamma");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("alpha beta gamma 123 - xyz asdfghjklqwertyuiopzxcvbnm");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
    }
}
