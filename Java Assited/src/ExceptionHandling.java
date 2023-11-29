class CustomException extends Exception {
 
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            
            methodWithException(0);

         
            methodWithCustomException(42);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program completed.");
    }

    
    public static void methodWithException(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int result = 10 / divisor;
        System.out.println("Result: " + result);
    }

 
    public static void methodWithCustomException(int value) throws CustomException {
        if (value == 42) {
            throw new CustomException("Custom exception thrown with value 42.");
        }
        System.out.println("No exception thrown for value: " + value);
    }
}
