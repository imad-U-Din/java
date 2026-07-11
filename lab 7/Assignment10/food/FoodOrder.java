package food;

public interface FoodOrder {
    double unitPrice();
    default double calculateBill(int quantity) {
        double itemCost = unitPrice() * quantity;
        double gst = itemCost * 0.05;
        return itemCost + gst;
    }
    String itemName();
}
