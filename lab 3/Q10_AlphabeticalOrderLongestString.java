import java.util.Arrays;
import java.util.Scanner;

public class Q10_AlphabeticalOrderLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) strings[i] = sc.nextLine();

        Arrays.sort(strings);
        System.out.println("Strings in alphabetical order:");
        for (String s : strings) System.out.println(s);

        String longest = strings[0];
        for (String s : strings) if (s.length() > longest.length()) longest = s;

        System.out.println("Longest string: " + longest);
        sc.close();
    }
}
