import java.util.Scanner;

public class Tryandcatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        try {
           
            int number = scanner.nextInt();

            
            int result = 10 / number;

            
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            
            System.out.println("Error: Something went wrong.");
        } finally {
          
            scanner.close();
        }

        System.out.println("Program completed.");
    }
}
