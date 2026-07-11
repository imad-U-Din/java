import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public double calculateArea() { return Math.PI * radius * radius; }
    public double calculatePerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }
}

public class Q1_ShapeInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        Circle c = new Circle(sc.nextDouble());
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Rectangle r = new Rectangle(l, w);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
        sc.close();
    }
}
