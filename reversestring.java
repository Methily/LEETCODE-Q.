public class reversestring {
    public static void main (String[] args) {
        String str = "you are my glory";
        String reverse = new
        StringBuilder(str).reverse().toString();
        System.out.println("reversed string: " + reverse);
    }
}
