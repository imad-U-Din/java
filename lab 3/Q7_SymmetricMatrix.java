import java.util.Scanner;

public class Q7_SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boolean symmetric = true;
        for (int i = 0; i < n && symmetric; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        System.out.println(symmetric ? "The matrix is symmetric." : "The matrix is NOT symmetric.");
        sc.close();
    }
}
