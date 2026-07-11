import java.util.Scanner;

abstract class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId; this.name = name; this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayReport() {
        System.out.println("\n--- Salary Report ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Net Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    PermanentEmployee(int empId, String name, double basicSalary) { super(empId, name, basicSalary); }
    @Override
    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.15;
        double pf = basicSalary * 0.12;
        double gross = basicSalary + hra + da;
        double net = gross - pf;
        System.out.println("Gross Salary: " + gross + " | PF Deduction: " + pf);
        return net;
    }
}

class ContractEmployee extends Employee {
    ContractEmployee(int empId, String name, double basicSalary) { super(empId, name, basicSalary); }
    @Override
    double calculateSalary() {
        double serviceAllowance = basicSalary * 0.10;
        double gross = basicSalary + serviceAllowance;
        System.out.println("Gross Salary: " + gross + " | No PF Deduction");
        return gross;
    }
}

public class Q1_PayrollManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Payroll Management System =====");
            System.out.println("1. Add Permanent Employee");
            System.out.println("2. Add Contract Employee");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Basic Salary: ");
                double basic = sc.nextDouble();

                Employee emp = (choice == 1) ? new PermanentEmployee(id, name, basic)
                                              : new ContractEmployee(id, name, basic);
                emp.displayReport();
            }
        } while (choice != 3);
        System.out.println("Exiting Payroll System.");
        sc.close();
    }
}
