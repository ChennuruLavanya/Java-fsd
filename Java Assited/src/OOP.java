
class Shape {
    
    private String color;

    
    public Shape(String color) {
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    
    public double calculateArea() {
        return 0.0;
    }

    
    public void displayInfo() {
        System.out.println("This is a shape with color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("This is a circle with color: " + getColor() + " and radius: " + radius);
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    
    @Override
    public double calculateArea() {
        return length * width;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("This is a rectangle with color: " + getColor() + ", length: " + length + ", and width: " + width);
    }
}

public class OOP {

    public static void main(String[] args) {
     
        Shape shape = new Shape("Blue");
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Green", 4.0, 6.0);

        
        shape.displayInfo();
        circle.displayInfo();
        rectangle.displayInfo();

        
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
