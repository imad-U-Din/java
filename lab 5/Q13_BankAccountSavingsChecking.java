abstract class BankAccountQ13 {
    double balance;
    BankAccountQ13(double balance) { this.balance = balance; }
    abstract void deposit(double amount);
}

class SavingsAccountQ13 extends BankAccountQ13 {
    double interestRate = 4.0;
    SavingsAccountQ13(double balance) { super(balance); }
    @Override
    void deposit(double amount) {
        double interest = amount * interestRate / 100;
        balance += amount + interest;
        System.out.println("Deposited " + amount + " with interest " + interest + ". New balance: " + balance);
    }
}

class CheckingAccount extends BankAccountQ13 {
    CheckingAccount(double balance) { super(balance); }
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to checking account. New balance: " + balance);
    }
}

public class Q13_BankAccountSavingsChecking {
    public static void main(String[] args) {
        BankAccountQ13 sav = new SavingsAccountQ13(1000);
        sav.deposit(500);

        BankAccountQ13 chk = new CheckingAccount(1000);
        chk.deposit(500);
    }
}
