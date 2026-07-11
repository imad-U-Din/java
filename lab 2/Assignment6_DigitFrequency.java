import java.util.Scanner;

public class Assignment6_DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int[] freq = new int[10];

        for (char ch : num.toCharArray()) {
            if (Character.isDigit(ch)) freq[ch - '0']++;
        }

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i] + (freq[i] == 1 ? " time" : " times"));
            }
        }
        sc.close();
    }
}
