import java.util.Scanner;

class ShortPasswordException extends Exception {
    public ShortPasswordException(String message) {
        super(message);
    }
}

public class Q3_PasswordLengthValidation {
    static void validatePassword(String password) throws ShortPasswordException {
        if (password.length() < 8) {
            throw new ShortPasswordException("Password must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            validatePassword(password);
            System.out.println("Password accepted.");
        } catch (ShortPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Password validation complete.");
            sc.close();
        }
    }
}
