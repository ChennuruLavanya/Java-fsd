public class Method {

    // Method with no parameters and no return value
    public void printHello() {
        System.out.println("Hello, world!");
    }

    // Method with parameters and return value
    public int add(int a, int b) {
        return a + b;
    }

    // Method with default (package-private) access modifier
    void displayMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Method demo = new Method();

        // Calling a method with no parameters and no return value
        demo.printHello();

        // Calling a method with parameters and return value
        int sum = demo.add(5, 7);
        System.out.println("Sum: " + sum);

        // Calling a method with default (package-private) access modifier
        demo.displayMessage("Welcome to Java!");

        // Accessing a private method within the same class
        demo.privateMethod();
    }
}