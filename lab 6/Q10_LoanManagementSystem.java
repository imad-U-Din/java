import java.util.Scanner;

abstract class Loan {
    double amount;
    int years;
    Loan(double amount, int years) { this.amount = amount; this.years = years; }
    abstract double interestRate();

    double calculateEMI() {
        double monthlyRate = interestRate() / (12 * 100);
        int months = years * 12;
        return (amount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }

    void displaySummary() {
        double emi = calculateEMI();
        double totalRepayment = emi * years * 12;
        double totalInterest = totalRepayment - amount;

        System.out.println("\n--- Loan Summary ---");
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate() + "%");
        System.out.println("EMI: " + emi);
        System.out.println("Total Interest: " + totalInterest);
        System.out.println("Total Repayment Amount: " + totalRepayment);
    }
}

class HomeLoan extends Loan {
    HomeLoan(double amount, int years) { super(amount, years); }
    @Override
    double interestRate() { return 8; }
}

class EducationLoan extends Loan {
    EducationLoan(double amount, int years) { super(amount, years); }
    @Override
    double interestRate() { return 6; }
}

class VehicleLoan extends Loan {
    VehicleLoan(double amount, int years) { super(amount, years); }
    @Override
    double interestRate() { return 9; }
}

public class Q10_LoanManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan type (Home/Education/Vehicle): ");
        String type = sc.next();
        System.out.print("Enter loan amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter duration (years): ");
        int years = sc.nextInt();

        Loan loan;
        switch (type.toLowerCase()) {
            case "home": loan = new HomeLoan(amount, years); break;
            case "education": loan = new EducationLoan(amount, years); break;
            default: loan = new VehicleLoan(amount, years); break;
        }

        loan.displaySummary();
        sc.close();
    }
}
