import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements for matrix A:");
        inputMatrixElements(scanner, matrixA);

        
        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements for matrix B:");
        inputMatrixElements(scanner, matrixB);

        // Check if matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. The number of columns in matrix A must be equal to the number of rows in matrix B.");
        } else {
            // Multiply matrices
            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

            // Display the result
            System.out.println("Resultant Matrix:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }

    private static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
