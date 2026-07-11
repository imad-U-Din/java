package loan;

public interface Loan {
    double calculateEMI(double amount, int months, double annualRate);
}
