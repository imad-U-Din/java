import java.util.Scanner;

public class Assignment9_SeriesGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        long term = 2;
        boolean multiplyNext = true;
        System.out.print("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            if (multiplyNext) term = term * 3;
            else term = term + 1;
            multiplyNext = !multiplyNext;
        }
        System.out.println();
        sc.close();
    }
}
