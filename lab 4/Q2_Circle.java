import java.util.Scanner;

class Circle {
    double radius;
    Circle(double radius) { this.radius = radius; }
    double area() { return Math.PI * radius * radius; }
    double circumference() { return 2 * Math.PI * radius; }
    boolean canFitInside(Circle other) { return this.radius < other.radius; }
}

public class Q2_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle 1: ");
        Circle c1 = new Circle(sc.nextDouble());
        System.out.print("Enter radius of circle 2: ");
        Circle c2 = new Circle(sc.nextDouble());

        System.out.println("Circle 1 - Area: " + c1.area() + ", Circumference: " + c1.circumference());
        System.out.println("Circle 2 - Area: " + c2.area() + ", Circumference: " + c2.circumference());

        if (c1.area() > c2.area()) System.out.println("Circle 1 has larger area.");
        else if (c2.area() > c1.area()) System.out.println("Circle 2 has larger area.");
        else System.out.println("Both circles have equal area.");

        if (c1.canFitInside(c2)) System.out.println("Circle 1 can fit inside Circle 2.");
        else if (c2.canFitInside(c1)) System.out.println("Circle 2 can fit inside Circle 1.");
        else System.out.println("Neither circle can fit inside the other.");
        sc.close();
    }
}
