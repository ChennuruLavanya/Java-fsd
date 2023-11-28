

public class Regularexpression {

    public static void main(String[] args) {
        
        String input1 = "Hello, Java!";
        String pattern1 = "Hello, Java!";

        if (input1.matches(pattern1)) {
            System.out.println("Example 1: Pattern matched successfully.");
        } else {
            System.out.println("Example 1: Pattern did not match.");
        }
    }
}
       