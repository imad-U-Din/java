import java.util.Scanner;

public class Assignment3_SalaryComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = (basic <= 20000) ? basic * 0.20 : basic * 0.30;
        double da = basic * 0.80;
        double gross = basic + hra + da;
        double tax = (gross > 50000) ? gross * 0.10 : 0;
        double net = gross - tax;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);
        sc.close();
    }
}
