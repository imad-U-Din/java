import java.util.Scanner;

abstract class Consumer {
    String name;
    double units;
    Consumer(String name, double units) { this.name = name; this.units = units; }
    abstract double calculateBill();
}

class DomesticConsumer extends Consumer {
    DomesticConsumer(String name, double units) { super(name, units); }
    @Override
    double calculateBill() {
        double bill;
        if (units <= 100) bill = units * 3;
        else if (units <= 300) bill = 100 * 3 + (units - 100) * 5;
        else bill = 100 * 3 + 200 * 5 + (units - 300) * 7;
        return bill;
    }
}

class CommercialConsumer extends Consumer {
    CommercialConsumer(String name, double units) { super(name, units); }
    @Override
    double calculateBill() {
        double bill;
        if (units <= 100) bill = units * 6;
        else if (units <= 300) bill = 100 * 6 + (units - 100) * 8;
        else bill = 100 * 6 + 200 * 8 + (units - 300) * 10;
        return bill;
    }
}

public class Q2_ElectricityBillingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumer name: ");
        String name = sc.nextLine();
        System.out.print("Enter consumer type (D-Domestic / C-Commercial): ");
        String type = sc.nextLine();
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        Consumer consumer = type.equalsIgnoreCase("D") ? new DomesticConsumer(name, units)
                                                         : new CommercialConsumer(name, units);
        System.out.println("\n--- Bill Breakdown ---");
        System.out.println("Consumer: " + consumer.name);
        System.out.println("Units Consumed: " + consumer.units);
        System.out.println("Total Bill: Rs. " + consumer.calculateBill());
        sc.close();
    }
}
