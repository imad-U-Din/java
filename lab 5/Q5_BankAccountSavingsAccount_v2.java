// Note: same structure as Q4 (as duplicated in the assignment sheet)
class BankAccountV2 {
    String accountNumber;
    double balance;
    double interestRate;

    BankAccountV2(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingsAccountV2 extends BankAccountV2 {
    double minimumBalance;

    SavingsAccountV2(String accountNumber, double balance, double interestRate, double minimumBalance) {
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

public class Q5_BankAccountSavingsAccount_v2 {
    public static void main(String[] args) {
        BankAccountV2 acc = new BankAccountV2("ACC001", 1000, 4.0);
        acc.deposit(500);

        SavingsAccountV2 sav = new SavingsAccountV2("ACC002", 2000, 4.0, 500);
        sav.deposit(300);
        sav.withdraw(1500);
    }
}
