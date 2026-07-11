package geometry;

public class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }
}
