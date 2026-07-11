package mainapp;

import food.FoodOrder;
import food.PizzaOrder;
import food.BurgerOrder;
import food.SandwichOrder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item type (Pizza/Burger/Sandwich): ");
        String type = sc.next();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        FoodOrder order;
        switch (type.toLowerCase()) {
            case "pizza": order = new PizzaOrder(); break;
            case "burger": order = new BurgerOrder(); break;
            default: order = new SandwichOrder(); break;
        }

        double unitPrice = order.unitPrice();
        double itemCost = unitPrice * qty;
        double gst = itemCost * 0.05;
        double finalAmount = order.calculateBill(qty);

        System.out.println("\n--- Bill Details ---");
        System.out.println("Item Name: " + order.itemName());
        System.out.println("Quantity: " + qty);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("GST (5%): " + gst);
        System.out.println("Final Amount: " + finalAmount);
        sc.close();
    }
}
