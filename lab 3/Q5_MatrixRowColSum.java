import java.util.Scanner;

public class Q5_MatrixRowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) rowSum += matrix[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) colSum += matrix[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
        sc.close();
    }
}
