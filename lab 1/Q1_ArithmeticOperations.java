import java.util.Scanner;

public class Q1_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Subtraction: " + (a - b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Remainder: " + (a % b));
        } else {
            System.out.println("Division and Remainder undefined (division by zero).");
        }
        sc.close();
    }
}
