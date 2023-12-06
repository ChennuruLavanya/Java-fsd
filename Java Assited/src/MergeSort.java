import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int n = array.length;

        if (n > 1) {
            int mid = n / 2;

            
            int[] leftArray = new int[mid];
            int[] rightArray = new int[n - mid];

            System.arraycopy(array, 0, leftArray, 0, mid);
            System.arraycopy(array, mid, rightArray, 0, n - mid);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(array, leftArray, rightArray);
        }
    }

  
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

       
        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        
        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
