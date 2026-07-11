import java.util.Scanner;

class Product {
    String productId;
    int quantity;
    double pricePerUnit;
    boolean expired;
    String discountCategory;

    Product(String productId, int quantity, double pricePerUnit, boolean expired, String discountCategory) {
        this.productId = productId;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.expired = expired;
        this.discountCategory = discountCategory;
    }

    double totalCost() { return quantity * pricePerUnit; }

    double discount() {
        double total = totalCost();
        switch (discountCategory.toLowerCase()) {
            case "premium": return total * 0.15;
            case "regular": return total * 0.05;
            default: return 0;
        }
    }

    double tax(double amountAfterDiscount) { return amountAfterDiscount * 0.12; }

    double finalInvoice() {
        if (expired) {
            System.out.println("Warning: Product is expired! Cannot generate invoice for sale.");
            return 0;
        }
        double total = totalCost();
        double disc = discount();
        double afterDiscount = total - disc;
        double tax = tax(afterDiscount);
        return afterDiscount + tax;
    }
}

public class Q10_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id = sc.next();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();
        System.out.print("Is expired? (true/false): ");
        boolean expired = sc.nextBoolean();
        System.out.print("Enter discount category (Premium/Regular/None): ");
        String category = sc.next();

        Product p = new Product(id, qty, price, expired, category);
        System.out.println("Total Cost: " + p.totalCost());
        System.out.println("Discount: " + p.discount());
        System.out.println("Final Invoice Amount: " + p.finalInvoice());
        sc.close();
    }
}
