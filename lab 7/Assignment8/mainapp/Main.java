package mainapp;

import loan.Loan;
import loan.HomeLoan;
import loan.EducationLoan;
import loan.VehicleLoan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan type (Home/Education/Vehicle): ");
        String type = sc.next();
        System.out.print("Enter loan amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter tenure (months): ");
        int months = sc.nextInt();
        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        Loan loan;
        switch (type.toLowerCase()) {
            case "home": loan = new HomeLoan(); break;
            case "education": loan = new EducationLoan(); break;
            default: loan = new VehicleLoan(); break;
        }
        double emi = loan.calculateEMI(amount, months, rate);
        double totalRepayment = emi * months;

        System.out.println("Monthly EMI: " + emi);
        System.out.println("Total Repayment Amount: " + totalRepayment);
        sc.close();
    }
}
