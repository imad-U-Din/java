import java.util.Scanner;

interface EmployeeSalary {
    double calculateGrossSalary(double basic, double hra, double da, double allowances);
    double calculateNetSalary(double gross, double deductions);
}

class EmployeeSalaryImpl implements EmployeeSalary {
    public double calculateGrossSalary(double basic, double hra, double da, double allowances) {
        return basic + hra + da + allowances;
    }
    public double calculateNetSalary(double gross, double deductions) {
        return gross - deductions;
    }
}

public class Q4_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter DA: ");
        double da = sc.nextDouble();
        System.out.print("Enter other allowances: ");
        double allowances = sc.nextDouble();
        System.out.print("Enter deductions: ");
        double deductions = sc.nextDouble();

        EmployeeSalaryImpl calc = new EmployeeSalaryImpl();
        double gross = calc.calculateGrossSalary(basic, hra, da, allowances);
        double net = calc.calculateNetSalary(gross, deductions);

        System.out.println("---- Salary Statement ----");
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
        sc.close();
    }
}
