abstract class ShapeQ10 {
    abstract double calculateArea();
}

class RectangleQ10 extends ShapeQ10 {
    double length, width;
    RectangleQ10(double length, double width) { this.length = length; this.width = width; }
    @Override
    double calculateArea() { return length * width; }
}

class TriangleQ10 extends ShapeQ10 {
    double base, height;
    TriangleQ10(double base, double height) { this.base = base; this.height = height; }
    @Override
    double calculateArea() { return 0.5 * base * height; }
}

public class Q10_ShapeRectangleTriangle {
    public static void main(String[] args) {
        ShapeQ10 r = new RectangleQ10(5, 4);
        ShapeQ10 t = new TriangleQ10(6, 3);

        System.out.println("Rectangle area: " + r.calculateArea());
        System.out.println("Triangle area: " + t.calculateArea());
    }
}
