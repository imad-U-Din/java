package mainapp;

import geometry.Shape;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape: 1-Circle 2-Rectangle 3-Triangle");
        int choice = sc.nextInt();
        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                shape = new Circle(sc.nextDouble());
                break;
            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                shape = new Rectangle(l, w);
                break;
            case 3:
                System.out.print("Enter side a: ");
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                System.out.print("Enter side c: ");
                double c = sc.nextDouble();
                shape = new Triangle(a, b, c);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        sc.close();
    }
}
