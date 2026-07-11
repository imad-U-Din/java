class Shape {
    double getArea() { return 0; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override
    double getArea() { return length * width; }
}

public class Q3_ShapeRectangle {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Shape area: " + s.getArea());

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + r.getArea());
    }
}
