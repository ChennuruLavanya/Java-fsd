import java.util.Arrays;

public class RightRotateAray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 5;

        System.out.println("Original Array: " + Arrays.toString(array));

        rightRotateArray(array, steps);

        System.out.println("Array after right rotation by " + steps + " steps: " + Arrays.toString(array));
    }

    private static void rightRotateArray(int[] arr, int steps) {
        int length = arr.length;

        // Normalize steps to avoid unnecessary rotations
        steps = steps % length;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[steps];

        // Copy the last 'steps' elements to the temporary array
        System.arraycopy(arr, length - steps, temp, 0, steps);

        // Shift the remaining elements to the right
        System.arraycopy(arr, 0, arr, steps, length - steps);

        // Copy back the rotated elements from the temporary array to the beginning
        System.arraycopy(temp, 0, arr, 0, steps);
    }
}
