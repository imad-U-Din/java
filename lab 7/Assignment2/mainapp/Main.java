package mainapp;

import employee.SalaryCalculator;
import employee.PermanentEmployee;
import employee.ContractEmployee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee type (P for Permanent / C for Contract): ");
        String type = sc.nextLine();

        SalaryCalculator emp;
        if (type.equalsIgnoreCase("P")) {
            System.out.print("Enter basic pay: ");
            emp = new PermanentEmployee(sc.nextDouble());
        } else {
            System.out.print("Enter hours worked: ");
            double hours = sc.nextDouble();
            System.out.print("Enter hourly rate: ");
            double rate = sc.nextDouble();
            emp = new ContractEmployee(hours, rate);
        }
        System.out.println("Salary: Rs. " + emp.calculateSalary());
        sc.close();
    }
}
