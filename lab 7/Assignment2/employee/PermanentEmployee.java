package employee;

public class PermanentEmployee implements SalaryCalculator {
    private double basicPay;
    public PermanentEmployee(double basicPay) { this.basicPay = basicPay; }
    public double calculateSalary() {
        double hra = basicPay * 0.20;
        double da = basicPay * 0.10;
        return basicPay + hra + da;
    }
}
