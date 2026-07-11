package mainapp;

import electricity.BillCalculator;
import electricity.DomesticConsumer;
import electricity.CommercialConsumer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumer name: ");
        String name = sc.nextLine();
        System.out.print("Enter consumer ID: ");
        String id = sc.nextLine();
        System.out.print("Enter consumer type (D for Domestic / C for Commercial): ");
        String type = sc.nextLine();
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        BillCalculator calc = type.equalsIgnoreCase("D") ? new DomesticConsumer() : new CommercialConsumer();
        double bill = calc.calculateBill(units);

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name: " + name);
        System.out.println("Consumer ID: " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: Rs. " + bill);
        sc.close();
    }
}
