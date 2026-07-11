import java.util.Scanner;

class Rectangle {
    double length, breadth;
    Rectangle(double length, double breadth) { this.length = length; this.breadth = breadth; }
    double area() { return length * breadth; }
    double perimeter() { return 2 * (length + breadth); }
    boolean isSquare() { return length == breadth; }
    double diagonal() { return Math.sqrt(length * length + breadth * breadth); }
}

public class Q3_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle 1: ");
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter length and breadth of rectangle 2: ");
        Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("Rectangle 1 - Area: " + r1.area() + " Perimeter: " + r1.perimeter()
                + " Square? " + r1.isSquare());
        System.out.println("Rectangle 2 - Area: " + r2.area() + " Perimeter: " + r2.perimeter()
                + " Square? " + r2.isSquare());

        System.out.println(r1.area() > r2.area() ? "Rectangle 1 has larger area."
                : r2.area() > r1.area() ? "Rectangle 2 has larger area." : "Equal areas.");
        System.out.println(r1.diagonal() > r2.diagonal() ? "Rectangle 1 has longer diagonal."
                : r2.diagonal() > r1.diagonal() ? "Rectangle 2 has longer diagonal." : "Equal diagonals.");
        sc.close();
    }
}
