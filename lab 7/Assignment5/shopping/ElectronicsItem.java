package shopping;

public class ElectronicsItem implements Discountable {
    public double calculateDiscount(double amount) { return amount * 0.15; }
}
