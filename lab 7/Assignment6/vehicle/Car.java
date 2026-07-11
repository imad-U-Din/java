package vehicle;

public class Car implements FuelConsumption {
    private static final double MILEAGE = 15;
    public double calculateFuelCost(double distance, double fuelPrice) {
        double fuelRequired = distance / MILEAGE;
        return fuelRequired * fuelPrice;
    }
}
