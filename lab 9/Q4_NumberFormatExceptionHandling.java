import java.util.Scanner;

public class Q4_NumberFormatExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a numeric string: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter digits only.");
        } finally {
            sc.close();
        }
    }
}
