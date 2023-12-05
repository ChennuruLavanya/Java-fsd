import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of L (0 <= L <= R <= n-1): ");
        int L = scanner.nextInt();

        System.out.print("Enter the value of R (0 <= L <= R <= n-1): ");
        int R = scanner.nextInt();

        scanner.close();

        int sumInRange = calculateSumInRange(array, L, R);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sumInRange);
    }

    private static int calculateSumInRange(int[] arr, int L, int R) {
        int sum = 0;

        if (L < 0 || R >= arr.length || L > R) {
            System.out.println("Invalid range.");
            return -1;
        }

        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
