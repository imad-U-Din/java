import java.util.Scanner;

class calculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input: ");
		int number = scanner.nextInt();

		if (number < 10000 || number > 99999) {
			System.out.println("Please enter a valid 5-digit number.");
			scanner.close();
			return;
		}

		int oddPositionSum = 0;
		int evenPositionSum = 0;

		int position = 1;
		while (number > 0) {
			int digit = number % 10;

			
			if (position % 2 == 1) {
				oddPositionSum += digit;
			} else {
				evenPositionSum += digit;
			}

			number /= 10;
			position++;
		}

		int difference = oddPositionSum - evenPositionSum;

		System.out.println("Odd position sum = " + oddPositionSum);
		System.out.println("Even position sum = " + evenPositionSum);
		System.out.println("Difference = " + difference);

		scanner.close();
	}
}