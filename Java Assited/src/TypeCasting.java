public class TypeCasting {

    public static void main(String[] args) {
        // Implicit type casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Implicit Casting: int to double - Result: " + doubleValue);

        // Explicit type casting (Narrowing)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit casting from double to int
        System.out.println("Explicit Casting: double to int - Result: " + anotherIntValue);
    }
}