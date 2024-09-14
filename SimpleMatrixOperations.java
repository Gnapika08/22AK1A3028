public class SimpleMatrixOperations {

    public static void main(String[] args) {
        // Example 2x2 matrices
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        // Addition
        int[][] sum = addMatrices(matrixA, matrixB);
        printMatrix("Sum", sum);

        // Subtraction
        int[][] difference = subtractMatrices(matrixA, matrixB);
        printMatrix("Difference", difference);

        // Multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        printMatrix("Product", product);

        // Trace
        int traceA = traceOfMatrix(matrixA);
        System.out.println("Trace of Matrix A: " + traceA);

        int traceB = traceOfMatrix(matrixB);
        System.out.println("Trace of Matrix B: " + traceB);
    }

    // Method to add two 2x2 matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to subtract two 2x2 matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two 2x2 matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Method to calculate the trace of a 2x2 matrix
    public static int traceOfMatrix(int[][] matrix) {
        return matrix[0][0] + matrix[1][1];
    }

    // Method to print a matrix
    public static void printMatrix(String title, int[][] matrix) {
        System.out.println(title + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
