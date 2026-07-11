import java.util.Scanner;

interface CalculatorOps {
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
    static double modulus(double a, double b) { return a % b; }
}

public class Q6_CalculatorInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu Driven Calculator ---");
            System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide  5. Modulus  6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 6) break;

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1: System.out.println("Result: " + CalculatorOps.add(a, b)); break;
                case 2: System.out.println("Result: " + CalculatorOps.subtract(a, b)); break;
                case 3: System.out.println("Result: " + CalculatorOps.multiply(a, b)); break;
                case 4:
                    if (b == 0) System.out.println("Cannot divide by zero!");
                    else System.out.println("Result: " + CalculatorOps.divide(a, b));
                    break;
                case 5: System.out.println("Result: " + CalculatorOps.modulus(a, b)); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        System.out.println("Exiting calculator.");
        sc.close();
    }
}
