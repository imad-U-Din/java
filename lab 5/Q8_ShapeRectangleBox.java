class ShapeQ8 {
    double getArea() { return 0; }
}

class RectangleQ8 extends ShapeQ8 {
    double length, width;
    RectangleQ8(double length, double width) { this.length = length; this.width = width; }
    @Override
    double getArea() { return length * width; }
}

class Box extends RectangleQ8 {
    double height;
    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    @Override
    double getArea() {
        // surface area of a box (cuboid)
        return 2 * (length * width + width * height + height * length);
    }
}

public class Q8_ShapeRectangleBox {
    public static void main(String[] args) {
        ShapeQ8 s = new ShapeQ8();
        System.out.println("Shape area: " + s.getArea());

        RectangleQ8 r = new RectangleQ8(5, 4);
        System.out.println("Rectangle area: " + r.getArea());

        Box b = new Box(5, 4, 3);
        System.out.println("Box surface area: " + b.getArea());
    }
}
