public class Constructortypes {
    
    // Default (no-argument) constructor
    public Constructortypes() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    public Constructortypes(int value) {
        System.out.println("Parameterized Constructor with value: " + value);
    }

    // Copy constructor
    public Constructortypes(Constructortypes other) {
        System.out.println("Copy Constructor");
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Constructortypes defaultConstructorObj = new Constructortypes();
        Constructortypes parameterizedConstructorObj = new Constructortypes(25);

        // Creating an object and using the copy constructor
        Constructortypes originalObj = new Constructortypes();
        Constructortypes copyConstructorObj = new Constructortypes(originalObj);
    }
}