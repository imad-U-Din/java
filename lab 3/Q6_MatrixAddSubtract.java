import java.util.Scanner;

public class Q6_MatrixAddSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                b[i][j] = sc.nextInt();

        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Sum Matrix:");
        printMatrix(sum);
        System.out.println("Difference Matrix:");
        printMatrix(diff);
        sc.close();
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
