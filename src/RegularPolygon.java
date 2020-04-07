/* Regular.java
 * Alessandro Krapf
 * 7 April 2020
 * It uses all the parent defined methods, in Shape.
 * But because the area is calculated in a different way from other shapes it overloads the getArea() method and the getPerimeter() method.
 */
// Have RegularPolygon use all of Shapes methods
public class RegularPolygon extends Shape{
    private double sides;       //the formula for finding the area and perimeter uses two independent variables
    private double length;
    RegularPolygon(double SideNum, double SideLength) {
        // Parent class is always referenced as super.
        this.length=SideLength;
        this.sides=SideNum;
    }
    // Cannot use any other shapes' version, so defines its own getArea() and getPerimeter()
    double getArea() {
        return (.5 * (this.sides * this.length) * (this.length / (2 * Math.tan(Math.PI/ this.sides)))); }
    double getPerimeter() {
        return (this.sides * this.length);
    }
}