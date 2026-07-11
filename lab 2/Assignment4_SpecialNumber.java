import java.util.Scanner;

public class Assignment4_SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 10;
        int d2 = num % 10;
        int sum = d1 + d2;
        int product = d1 * d2;

        if (sum + product == num) System.out.println(num + " is a special number.");
        else System.out.println(num + " is NOT a special number.");
        sc.close();
    }
}
