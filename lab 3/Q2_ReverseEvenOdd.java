import java.util.Scanner;

public class Q2_ReverseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.print("Elements in reverse order: ");
        for (int i = n - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        sc.close();
    }
}
