import java.util.Scanner;

interface ShoppingCart {
    double subtotal(double[] prices, int[] quantities);
    double gstAmount(double subtotal, double gstRate);
    double discountAmount(double subtotal, double discountRate);
    double finalBill(double subtotal, double gst, double discount);
}

class ShoppingCartImpl implements ShoppingCart {
    public double subtotal(double[] prices, int[] quantities) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) total += prices[i] * quantities[i];
        return total;
    }
    public double gstAmount(double subtotal, double gstRate) { return subtotal * gstRate / 100; }
    public double discountAmount(double subtotal, double discountRate) { return subtotal * discountRate / 100; }
    public double finalBill(double subtotal, double gst, double discount) { return subtotal + gst - discount; }
}

public class Q7_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        int[] quantities = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " price: ");
            prices[i] = sc.nextDouble();
            System.out.print("Item " + (i + 1) + " quantity: ");
            quantities[i] = sc.nextInt();
        }

        ShoppingCartImpl cart = new ShoppingCartImpl();
        double subtotal = cart.subtotal(prices, quantities);
        double gst = cart.gstAmount(subtotal, 18);
        double discount = cart.discountAmount(subtotal, 10);
        double finalAmount = cart.finalBill(subtotal, gst, discount);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST (18%): " + gst);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
        sc.close();
    }
}
