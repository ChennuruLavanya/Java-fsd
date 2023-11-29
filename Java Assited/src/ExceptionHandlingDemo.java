import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(scanner.nextLine());

          
            int result = 10 / num;

            
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            
            System.out.println("Error: Please enter a valid integer.");

        } catch (ArithmeticException e) {
            
            System.out.println("Error: Cannot divide by zero.");

        } catch (Exception e) {
            
            System.out.println("Error: Something went wrong.");

        } finally {
            
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Finally block executed.");
        }

        System.out.println("Program completed.");
    }
}
