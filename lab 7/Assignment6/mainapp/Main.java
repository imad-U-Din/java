package mainapp;

import vehicle.FuelConsumption;
import vehicle.Car;
import vehicle.Bike;
import vehicle.Bus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Bike/Bus): ");
        String type = sc.next();
        System.out.print("Enter distance to travel (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter fuel price per litre: ");
        double fuelPrice = sc.nextDouble();

        FuelConsumption vehicle;
        switch (type.toLowerCase()) {
            case "car": vehicle = new Car(); break;
            case "bike": vehicle = new Bike(); break;
            default: vehicle = new Bus(); break;
        }
        double cost = vehicle.calculateFuelCost(distance, fuelPrice);
        System.out.println("Total Fuel Cost: Rs. " + cost);
        sc.close();
    }
}
