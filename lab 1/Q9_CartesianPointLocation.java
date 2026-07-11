import java.util.Scanner;

public class Q9_CartesianPointLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point is in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in Quadrant III.");
        } else {
            System.out.println("The point is in Quadrant IV.");
        }
        sc.close();
    }
}
