package shopping;

public class ClothingItem implements Discountable {
    public double calculateDiscount(double amount) { return amount * 0.10; }
}
