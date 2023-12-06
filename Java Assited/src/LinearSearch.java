public class LinearSearch {

    
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 2, 8, 7, 5};
        int targetElement = 8;

        int result = linearSearch(array, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
