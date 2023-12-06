public class Exponentialsearch {

    
    public static int binarySearch(int[] array, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid; 
            } else if (array[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }

    
    public static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < array.length && array[i] <= target) {
            i *= 2; 
        }

        
        return binarySearch(array, target, i / 2, Math.min(i, array.length - 1));
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 8, 10};
        int targetElement = 8;

        int result = exponentialSearch(array, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
