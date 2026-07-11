import java.util.Scanner;

public class Q2_ArrayIndexExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Valid range is 0 to " + (arr.length - 1) + ".");
        } finally {
            sc.close();
        }
    }
}
