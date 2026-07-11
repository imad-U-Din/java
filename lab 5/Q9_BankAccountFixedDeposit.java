class BankAccountQ9 {
    String accountNumber;
    double balance;
    double interestRate;

    BankAccountQ9(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingsAccountQ9 extends BankAccountQ9 {
    double minimumBalance;

    SavingsAccountQ9(String accountNumber, double balance, double interestRate, double minimumBalance) {
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

class FixedDepositAccount extends SavingsAccountQ9 {
    int term; // in months

    FixedDepositAccount(String accountNumber, double balance, double interestRate, double minimumBalance, int term) {
        super(accountNumber, balance, interestRate, minimumBalance);
        this.term = term;
    }

    double getInterest() {
        return balance * (interestRate / 100) * (term / 12.0);
    }
}

public class Q9_BankAccountFixedDeposit {
    public static void main(String[] args) {
        BankAccountQ9 acc = new BankAccountQ9("ACC001", 1000, 4.0);
        acc.deposit(500);

        SavingsAccountQ9 sav = new SavingsAccountQ9("ACC002", 2000, 4.0, 500);
        sav.deposit(300);
        sav.withdraw(1500);

        FixedDepositAccount fd = new FixedDepositAccount("ACC003", 10000, 7.0, 1000, 12);
        fd.deposit(2000);
        System.out.println("Interest earned: " + fd.getInterest());
    }
}
