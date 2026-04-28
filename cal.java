
import java.util.Scanner;


class cal{
    public static void main(String[]arg){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Input: ");
        int num = scanner.nextInt();

        if (num < 10000 || num > 99999){
            System.out.println("Enter a 5 digit number");
            scanner.close();
            return;
        }
        
        int oddPositionSum = 0;
        int evenPositionSum = 0;

        int position = 1;
        while (num > 0) {
            int digit = num % 10;

            if (position % 2 == 1) {
                oddPositionSum += digit;
            } else {
                evenPositionSum += digit;
            }

            num /= 10;
            position++;
        }

        int difference = oddPositionSum - evenPositionSum;

        System.out.println("Odd position sum = " + oddPositionSum);
        System.out.println("Even position sum = " + evenPositionSum);
        System.out.println("Difference = " + difference);

        scanner.close();
    }
}

