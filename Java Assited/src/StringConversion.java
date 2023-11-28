public class StringConversion {

    public static void main(String[] args) {
        
        String originalString = "Hello, World!";

        StringBuffer stringBuffer = new StringBuffer(originalString);

        StringBuilder stringBuilder = new StringBuilder(originalString);

        System.out.println("Original String: " + originalString);

        System.out.println("Converted to StringBuffer: " + stringBuffer);

        System.out.println("Converted to StringBuilder: " + stringBuilder);
    }
}
