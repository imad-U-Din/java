import java.util.Scanner;

abstract class InsurancePolicy {
    int age;
    InsurancePolicy(int age) { this.age = age; }
    abstract double calculatePremium();

    void generateReport() {
        double premium = calculatePremium();
        System.out.println("\n--- Policy Report ---");
        System.out.println("Age: " + age);
        System.out.println("Final Premium: " + premium);
    }
}

class VehicleInsurance extends InsurancePolicy {
    double vehicleValue;
    VehicleInsurance(int age, double vehicleValue) { super(age); this.vehicleValue = vehicleValue; }
    @Override
    double calculatePremium() {
        double premium = vehicleValue * 0.03;
        if (age > 50) premium += premium * 0.20;
        return premium;
    }
}

class HealthInsurance extends InsurancePolicy {
    double insuredAmount;
    HealthInsurance(int age, double insuredAmount) { super(age); this.insuredAmount = insuredAmount; }
    @Override
    double calculatePremium() {
        double premium = insuredAmount * 0.05;
        if (age > 50) premium += premium * 0.20;
        return premium;
    }
}

public class Q9_InsuranceManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter policy type (Vehicle/Health): ");
        String type = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        InsurancePolicy policy;
        if (type.equalsIgnoreCase("Vehicle")) {
            System.out.print("Enter vehicle value: ");
            policy = new VehicleInsurance(age, sc.nextDouble());
        } else {
            System.out.print("Enter insured amount: ");
            policy = new HealthInsurance(age, sc.nextDouble());
        }

        policy.generateReport();
        sc.close();
    }
}
