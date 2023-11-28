public class innerclass {

    private int outerVariable = 10;

    public class InnerClass {
        private int innerVariable = 20;

        public void display() {
            System.out.println("Inner Variable: " + innerVariable);
            System.out.println("Outer Variable (from InnerClass): " + outerVariable);
        }
    }

    public static void main(String[] args) {
        innerclass outerObj = new innerclass();
        innerclass.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.display();
    }
}
