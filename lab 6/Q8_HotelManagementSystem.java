import java.util.Scanner;

abstract class Room {
    int days;
    double foodCharges;
    Room(int days, double foodCharges) { this.days = days; this.foodCharges = foodCharges; }
    abstract double ratePerDay();

    double calculateBill() {
        double roomCharges = ratePerDay() * days;
        double subtotal = roomCharges + foodCharges;
        double gst = subtotal * 0.12;
        System.out.println("Room Charges: " + roomCharges);
        System.out.println("Food Charges: " + foodCharges);
        System.out.println("GST (12%): " + gst);
        return subtotal + gst;
    }
}

class StandardRoom extends Room {
    StandardRoom(int days, double foodCharges) { super(days, foodCharges); }
    @Override
    double ratePerDay() { return 2000; }
}

class DeluxeRoom extends Room {
    DeluxeRoom(int days, double foodCharges) { super(days, foodCharges); }
    @Override
    double ratePerDay() { return 4000; }
}

class SuiteRoom extends Room {
    SuiteRoom(int days, double foodCharges) { super(days, foodCharges); }
    @Override
    double ratePerDay() { return 7000; }
}

public class Q8_HotelManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String type = sc.next();
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        System.out.print("Enter food charges: ");
        double food = sc.nextDouble();

        Room room;
        switch (type.toLowerCase()) {
            case "standard": room = new StandardRoom(days, food); break;
            case "deluxe": room = new DeluxeRoom(days, food); break;
            default: room = new SuiteRoom(days, food); break;
        }

        System.out.println("Final Bill: " + room.calculateBill());
        sc.close();
    }
}
