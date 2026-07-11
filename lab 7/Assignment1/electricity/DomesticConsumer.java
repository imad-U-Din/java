package electricity;

public class DomesticConsumer implements BillCalculator {
    public double calculateBill(double units) {
        return units * 6;
    }
}
