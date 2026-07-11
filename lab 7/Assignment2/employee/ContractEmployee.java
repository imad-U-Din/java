package employee;

public class ContractEmployee implements SalaryCalculator {
    private double hoursWorked, hourlyRate;
    public ContractEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
