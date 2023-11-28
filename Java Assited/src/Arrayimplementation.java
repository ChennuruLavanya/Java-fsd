public class Arrayimplementation {

    public static void main(String[] args) {
      
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }

        System.out.println("Array Elements:");
        for (int value : intArray) {
            System.out.println(value);
        }

        String[] stringArray = {"Apple", "Banana", "Orange"};

        System.out.println("\nString Array Elements:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }

        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nMulti-dimensional Array Elements:");
        for (int[] row : multiArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
