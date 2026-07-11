import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9_EMICalculatorWithExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter annual interest rate (%): ");
            double annualRate = sc.nextDouble();
            System.out.print("Enter loan tenure (months): ");
            int months = sc.nextInt();

            if (principal <= 0 || annualRate <= 0 || months <= 0) {
                throw new IllegalArgumentException("Principal, rate, and tenure must be positive values.");
            }

            double monthlyRate = annualRate / (12 * 100);
            double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                    / (Math.pow(1 + monthlyRate, months) - 1);

            System.out.println("Monthly EMI: " + emi);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Invalid calculation (check input values).");
        } finally {
            sc.close();
        }
    }
}
