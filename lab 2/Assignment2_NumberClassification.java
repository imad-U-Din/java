import java.util.Scanner;

public class Assignment2_NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");

        System.out.println(n % 2 == 0 ? "Even" : "Odd");
        System.out.println(n % 5 == 0 ? "Multiple of 5" : "Not a multiple of 5");
        System.out.println((Math.abs(n) >= 100 && Math.abs(n) <= 999) ? "Three-digit number" : "Not a three-digit number");
        sc.close();
    }
}
