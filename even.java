import java.util.Scanner;

class even {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		
		if (number > 0) {
			System.out.println("Classification (Sign): Positive");
		} else if (number < 0) {
			System.out.println("Classification (Sign): Negative");
		} else {
			System.out.println("Classification (Sign): Zero");
		}

		if (number % 2 == 0) {
			System.out.println("Classification (Parity): Even");
		} else {
			System.out.println("Classification (Parity): Odd");
		}

		
		if (number % 5 == 0) {
			System.out.println("Classification (Multiple of 5): Yes");
		} else {
			System.out.println("Classification (Multiple of 5): No");
		}

		
		long absolute = Math.abs((long) number);
		if (absolute >= 100 && absolute <= 999) {
			System.out.println("Classification (Three-digit): Yes");
		} else {
			System.out.println("Classification (Three-digit): No");
		}

		scanner.close();
	}
}
