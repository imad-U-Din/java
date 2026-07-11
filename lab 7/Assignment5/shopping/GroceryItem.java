package shopping;

public class GroceryItem implements Discountable {
    public double calculateDiscount(double amount) { return amount * 0.05; }
}
