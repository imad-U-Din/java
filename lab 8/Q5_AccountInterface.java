import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double balanceInquiry();
}

class SavingsAccount implements Account {
    private double balance;
    SavingsAccount(double initialBalance) { this.balance = initialBalance; }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double balanceInquiry() { return balance; }
}

public class Q5_AccountInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        SavingsAccount acc = new SavingsAccount(sc.nextDouble());

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("Current Balance: " + acc.balanceInquiry());
        sc.close();
    }
}
