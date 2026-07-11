import java.util.Scanner;

class Triangle {
    double a, b, c;
    Triangle(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }

    boolean isValid() { return (a + b > c) && (b + c > a) && (a + c > b); }

    String type() {
        if (a == b && b == c) return "Equilateral";
        else if (a == b || b == c || a == c) return "Isosceles";
        else return "Scalene";
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Q4_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        if (!t.isValid()) {
            System.out.println("Invalid triangle! Sides do not satisfy triangle inequality.");
        } else {
            System.out.println("Triangle type: " + t.type());
            System.out.println("Area (Heron's Formula): " + t.area());
        }
        sc.close();
    }
}
