package vehicle;

public class Bike implements FuelConsumption {
    private static final double MILEAGE = 45;
    public double calculateFuelCost(double distance, double fuelPrice) {
        double fuelRequired = distance / MILEAGE;
        return fuelRequired * fuelPrice;
    }
}
