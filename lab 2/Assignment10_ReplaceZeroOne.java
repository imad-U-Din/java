import java.util.Scanner;

public class Assignment10_ReplaceZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        StringBuilder result = new StringBuilder();

        for (char ch : num.toCharArray()) {
            if (ch == '0') result.append('1');
            else if (ch == '1') result.append('0');
            else result.append(ch);
        }

        System.out.println("Output: " + result);
        sc.close();
    }
}
