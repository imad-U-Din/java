import java.util.Scanner;

abstract class Vehicle {
    int days;
    Vehicle(int days) { this.days = days; }
    abstract double ratePerDay();

    double calculateRent() {
        double rentalCost = ratePerDay() * days;
        double fuelSurcharge = rentalCost * 0.05;
        double subtotal = rentalCost + fuelSurcharge;
        double gst = subtotal * 0.18;
        double finalAmount = subtotal + gst;

        System.out.println("Rental Cost: " + rentalCost);
        System.out.println("Fuel Surcharge (5%): " + fuelSurcharge);
        System.out.println("GST (18%): " + gst);
        return finalAmount;
    }
}

class Car extends Vehicle {
    Car(int days) { super(days); }
    @Override
    double ratePerDay() { return 1500; }
}

class Bike extends Vehicle {
    Bike(int days) { super(days); }
    @Override
    double ratePerDay() { return 500; }
}

class Bus extends Vehicle {
    Bus(int days) { super(days); }
    @Override
    double ratePerDay() { return 4000; }
}

public class Q5_VehicleRentalApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Bike/Bus): ");
        String type = sc.next();
        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        Vehicle vehicle;
        switch (type.toLowerCase()) {
            case "car": vehicle = new Car(days); break;
            case "bike": vehicle = new Bike(days); break;
            default: vehicle = new Bus(days); break;
        }

        double finalAmount = vehicle.calculateRent();
        System.out.println("Final Amount: " + finalAmount);
        sc.close();
    }
}
