public class RegularPolygon extends Shape{
    private double sides;
    private double length;
    RegularPolygon(double SideNum, double SideLength) {
        // Parent class is always referenced as super.
        this.length=SideLength;
        this.sides=SideNum;
    }
    // Cannot use the rectangle version, so defines its own getArea() and getPerimeter()
    double getArea() {
        return (.5 * (this.sides * this.length) * (this.length / (2 * Math.tan(Math.PI/ this.sides)))); }
    double getPerimeter() {
        return (this.sides * this.length);
    }
}