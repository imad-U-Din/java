
import java.util.Scanner;

class addSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0, max = arr[0], min = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double) n));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
