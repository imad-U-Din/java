class BankAccount {
    String accountNumber;
    double balance;
    double interestRate;

    BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;

    SavingsAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }

    void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Withdrawal denied: minimum balance requirement not met.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        }
    }
}

public class Q4_BankAccountSavingsAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC001", 1000, 4.0);
        acc.deposit(500);

        SavingsAccount sav = new SavingsAccount("ACC002", 2000, 4.0, 500);
        sav.deposit(300);
        sav.withdraw(1500);
    }
}
