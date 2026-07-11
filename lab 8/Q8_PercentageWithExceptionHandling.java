import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8_PercentageWithExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();
            System.out.print("Enter maximum marks per subject: ");
            int maxPerSubject = sc.nextInt();
            int total = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                total += sc.nextInt();
            }
            int maxTotal = n * maxPerSubject;
            double percentage = (total * 100.0) / maxTotal;
            System.out.println("Percentage: " + percentage + "%");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred - check subject count.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid numeric input.");
        } finally {
            sc.close();
        }
    }
}
