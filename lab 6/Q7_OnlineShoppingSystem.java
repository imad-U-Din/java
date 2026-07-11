import java.util.Scanner;

abstract class Product {
    double price;
    Product(double price) { this.price = price; }
    abstract double calculateDiscount();
    abstract double gstRate();

    double finalPayable() {
        double discount = calculateDiscount();
        double afterDiscount = price - discount;
        double gst = afterDiscount * gstRate() / 100;
        return afterDiscount + gst;
    }
}

class Electronics extends Product {
    Electronics(double price) { super(price); }
    @Override
    double calculateDiscount() { return price * 0.10; }
    @Override
    double gstRate() { return 18; }
}

class Clothing extends Product {
    Clothing(double price) { super(price); }
    @Override
    double calculateDiscount() { return price * 0.20; }
    @Override
    double gstRate() { return 12; }
}

class Books extends Product {
    Books(double price) { super(price); }
    @Override
    double calculateDiscount() { return price * 0.05; }
    @Override
    double gstRate() { return 5; }
}

public class Q7_OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter category (Electronics/Clothing/Books): ");
        String category = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product product;
        switch (category.toLowerCase()) {
            case "electronics": product = new Electronics(price); break;
            case "clothing": product = new Clothing(price); break;
            default: product = new Books(price); break;
        }

        System.out.println("Discount: " + product.calculateDiscount());
        System.out.println("Final Payable Amount: " + product.finalPayable());
        sc.close();
    }
}
