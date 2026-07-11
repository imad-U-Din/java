import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;
    double transactionLimit;

    BankAccount(String accountNumber, double balance, double transactionLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Withdrawal exceeds transaction limit! Penalty applied.");
            balance -= 50; // penalty
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Penalty applied.");
            balance -= 50;
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    double monthlyInterest(double rate) {
        double interest = balance * rate / 100 / 12;
        balance += interest;
        return interest;
    }
}

public class Q7_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accNo = sc.next();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter transaction limit: ");
        double limit = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, balance, limit);

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();
        System.out.println("Monthly Interest Earned: " + acc.monthlyInterest(rate));
        System.out.println("Final Balance: " + acc.balance);
        sc.close();
    }
}
