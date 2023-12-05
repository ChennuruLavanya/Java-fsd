import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] unsortedList = {12, 5, 3, 9, 20, 8, 7, 15, 10, 6};

        int fourthSmallest = findFourthSmallestElement(unsortedList);

        System.out.println("Unsorted List: " + Arrays.toString(unsortedList));
        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }

    private static int findFourthSmallestElement(int[] arr) {
        if (arr.length < 4) {
            System.out.println("List has less than four elements.");
            return -1;
        }

        // Sort the array
        Arrays.sort(arr);

        // Return the fourth smallest element
        return arr[3];
    }
}
