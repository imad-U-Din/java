package mainapp;

import shopping.Discountable;
import shopping.GroceryItem;
import shopping.ClothingItem;
import shopping.ElectronicsItem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product category (Grocery/Clothing/Electronics): ");
        String category = sc.next();
        System.out.print("Enter price per unit: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;
        Discountable item;
        switch (category.toLowerCase()) {
            case "grocery": item = new GroceryItem(); break;
            case "clothing": item = new ClothingItem(); break;
            default: item = new ElectronicsItem(); break;
        }
        double discount = item.calculateDiscount(total);
        double finalAmount = total - discount;

        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill Amount: " + finalAmount);
        sc.close();
    }
}
