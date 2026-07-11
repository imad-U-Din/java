import java.util.Scanner;

class ElectricityBill {
    String consumerType;
    double units;

    ElectricityBill(String consumerType, double units) {
        this.consumerType = consumerType;
        this.units = units;
    }

    double calculateSlabBill() {
        double bill;
        if (consumerType.equalsIgnoreCase("Domestic")) {
            if (units <= 100) bill = units * 3;
            else if (units <= 300) bill = 100 * 3 + (units - 100) * 5;
            else bill = 100 * 3 + 200 * 5 + (units - 300) * 7;
        } else {
            if (units <= 100) bill = units * 6;
            else if (units <= 300) bill = 100 * 6 + (units - 100) * 8;
            else bill = 100 * 6 + 200 * 8 + (units - 300) * 10;
        }
        return bill;
    }

    double applyTax(double bill) { return bill * 0.05; }
    double applySubsidy(double bill) { return consumerType.equalsIgnoreCase("Domestic") ? bill * 0.02 : 0; }
    double lateCharge(boolean isLate) { return isLate ? 100 : 0; }
}

public class Q9_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumer type (Domestic/Commercial): ");
        String type = sc.next();
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();
        System.out.print("Is payment late? (true/false): ");
        boolean isLate = sc.nextBoolean();

        ElectricityBill bill = new ElectricityBill(type, units);
        double base = bill.calculateSlabBill();
        double tax = bill.applyTax(base);
        double subsidy = bill.applySubsidy(base);
        double lateFee = bill.lateCharge(isLate);
        double finalAmount = base + tax - subsidy + lateFee;

        System.out.println("Base Bill: " + base);
        System.out.println("Tax: " + tax);
        System.out.println("Subsidy: " + subsidy);
        System.out.println("Late Charge: " + lateFee);
        System.out.println("Final Payable Amount: " + finalAmount);
        sc.close();
    }
}
