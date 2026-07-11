import java.util.Scanner;

public class Assignment1_DigitPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int oddSum = 0, evenSum = 0, position = 1;
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 1) oddSum += digit;
            else evenSum += digit;
            num /= 10;
            position++;
        }

        System.out.println("Sum at odd positions: " + oddSum);
        System.out.println("Sum at even positions: " + evenSum);
        System.out.println("Difference: " + Math.abs(oddSum - evenSum));
        sc.close();
    }
}
