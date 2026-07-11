import java.util.Scanner;

public class Q5_EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? 1 : 0);
        sc.close();
    }
}
