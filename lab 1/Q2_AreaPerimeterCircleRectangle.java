import java.util.Scanner;

public class Q2_AreaPerimeterCircleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        double rectArea = length * width;
        double rectPerimeter = 2 * (length + width);

        System.out.println("Circle Area: " + circleArea + " Perimeter: " + circlePerimeter);
        System.out.println("Rectangle Area: " + rectArea + " Perimeter: " + rectPerimeter);
        sc.close();
    }
}
