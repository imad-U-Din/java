package electricity;

public class CommercialConsumer implements BillCalculator {
    public double calculateBill(double units) {
        return units * 9;
    }
}
