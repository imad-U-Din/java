import java.util.Scanner;

class Employee {
    double basicSalary, overtimeHours, leaveDeductions;

    Employee(double basicSalary, double overtimeHours, double leaveDeductions) {
        this.basicSalary = basicSalary;
        this.overtimeHours = overtimeHours;
        this.leaveDeductions = leaveDeductions;
    }

    double hra() { return basicSalary * 0.20; }
    double da() { return basicSalary * 0.10; }
    double overtimePay() { return overtimeHours * 200; }
    double tax() {
        double gross = grossBeforeTax();
        return gross > 50000 ? gross * 0.10 : gross * 0.05;
    }
    double bonus() { return basicSalary > 30000 ? 2000 : 1000; }

    private double grossBeforeTax() {
        return basicSalary + hra() + da() + overtimePay() + bonus();
    }

    double grossSalary() { return grossBeforeTax(); }
    double netSalary() { return grossSalary() - tax() - leaveDeductions; }
}

public class Q6_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter overtime hours: ");
        double ot = sc.nextDouble();
        System.out.print("Enter leave deductions: ");
        double leaveDed = sc.nextDouble();

        Employee e = new Employee(basic, ot, leaveDed);
        System.out.println("HRA: " + e.hra());
        System.out.println("DA: " + e.da());
        System.out.println("Overtime Pay: " + e.overtimePay());
        System.out.println("Bonus: " + e.bonus());
        System.out.println("Tax Deduction: " + e.tax());
        System.out.println("Gross Salary: " + e.grossSalary());
        System.out.println("Net Salary: " + e.netSalary());
        sc.close();
    }
}
