import java.util.InputMismatchException;
import java.util.Scanner;

interface BankingApp {
    void deposit(double amount) throws IllegalArgumentException;
    void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException;
    double checkBalance();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) { super(message); }
}

class BankAccountImpl implements BankingApp {
    private double balance;
    BankAccountImpl(double initial) { this.balance = initial; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
        if (amount > balance) throw new InsufficientBalanceException("Withdrawal amount exceeds available balance.");
        balance -= amount;
    }
    public double checkBalance() { return balance; }
}

public class Q10_BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter initial balance: ");
            BankAccountImpl account = new BankAccountImpl(sc.nextDouble());

            System.out.print("Enter deposit amount: ");
            account.deposit(sc.nextDouble());
            System.out.println("Balance after deposit: " + account.checkBalance());

            System.out.print("Enter withdrawal amount: ");
            account.withdraw(sc.nextDouble());
            System.out.println("Balance after withdrawal: " + account.checkBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid numeric input.");
        } finally {
            sc.close();
        }
    }
}
