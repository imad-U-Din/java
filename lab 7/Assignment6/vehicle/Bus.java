package vehicle;

public class Bus implements FuelConsumption {
    private static final double MILEAGE = 5;
    public double calculateFuelCost(double distance, double fuelPrice) {
        double fuelRequired = distance / MILEAGE;
        return fuelRequired * fuelPrice;
    }
}
