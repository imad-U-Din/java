import java.util.Scanner;

public class Q6_SameRightmostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three non-negative integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int da = a % 10, db = b % 10, dc = c % 10;
        boolean result = (da == db) || (db == dc) || (da == dc);

        System.out.println(result);
        sc.close();
    }
}
