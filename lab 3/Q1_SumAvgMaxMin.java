import java.util.Scanner;

public class Q1_SumAvgMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double) n));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
    }
}
