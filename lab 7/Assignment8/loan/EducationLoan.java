package loan;

public class EducationLoan implements Loan {
    public double calculateEMI(double amount, int months, double annualRate) {
        double r = annualRate / (12 * 100);
        return (amount * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
    }
}
