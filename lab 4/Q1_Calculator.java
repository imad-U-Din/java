import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    private List<String> history = new ArrayList<>();

    double operate(double a, double b, char op) {
        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return Double.NaN;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
        addHistory(a + " " + op + " " + b + " = " + result);
        return result;
    }

    private void addHistory(String entry) {
        if (history.size() == 5) history.remove(0);
        history.add(entry);
    }

    void printHistory() {
        System.out.println("Last calculations:");
        for (String h : history) System.out.println(h);
    }
}

public class Q1_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String choice;
        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter operator (+,-,*,/): ");
            char op = sc.next().charAt(0);
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.println("Result: " + calc.operate(a, b, op));
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
        calc.printHistory();
        sc.close();
    }
}
