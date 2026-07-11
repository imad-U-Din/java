import java.util.Scanner;

abstract class BankAccount {
    double principal;
    int duration; // in years
    BankAccount(double principal, int duration) { this.principal = principal; this.duration = duration; }
    abstract double calculateInterest();

    void generateStatement() {
        double interest = calculateInterest();
        double maturity = principal + interest;
        System.out.println("\n--- Account Statement ---");
        System.out.println("Principal: " + principal);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Interest Earned: " + interest);
        System.out.println("Maturity Amount: " + maturity);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double principal, int duration) { super(principal, duration); }
    @Override
    double calculateInterest() { return principal * 0.04 * duration; }
}

class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(double principal, int duration) { super(principal, duration); }
    @Override
    double calculateInterest() { return principal * 0.07 * duration; }
}

public class Q4_BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account type (S-Savings / F-Fixed Deposit): ");
        String type = sc.next();
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter duration (years): ");
        int duration = sc.nextInt();

        BankAccount account = type.equalsIgnoreCase("S") ? new SavingsAccount(principal, duration)
                                                           : new FixedDepositAccount(principal, duration);
        account.generateStatement();
        sc.close();
    }
}
