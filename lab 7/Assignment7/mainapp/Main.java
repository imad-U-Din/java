package mainapp;

import hotel.RoomBilling;
import hotel.StandardRoom;
import hotel.DeluxeRoom;
import hotel.SuiteRoom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String type = sc.nextLine();
        System.out.print("Enter number of days stayed: ");
        int days = sc.nextInt();

        RoomBilling room;
        switch (type.toLowerCase()) {
            case "standard": room = new StandardRoom(); break;
            case "deluxe": room = new DeluxeRoom(); break;
            default: room = new SuiteRoom(); break;
        }
        double roomCharge = room.calculateBill(days);
        double gst = roomCharge * 0.18;
        double finalBill = roomCharge + gst;

        System.out.println("\n--- Hotel Bill ---");
        System.out.println("Customer: " + name);
        System.out.println("Room Charges: " + roomCharge);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill: " + finalBill);
        sc.close();
    }
}
