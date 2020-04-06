    /* Hexagon.java
     * Alessandro Krapf
     * 5 April 2020
     * Creates a hexagon based on the square class
     * Because of inheritance, no methods or attributes need to be defined here.
     * Square uses all the methods defined in Shape, Rectangle, and Square.
     */
// Have Hexagon use all of Squares methods
    public class Hexagon extends Square{
        private double side;
        Hexagon(double side) {
            // Parent class is always referenced as super.
            super(side);
            this.side=side;
        }
        // Cannot use the rectangle version, so defines its own getArea() and getPerimeter()
        double getArea() {
            return Math.pow(this.side,2) * ((3*Math.pow(3,.5))/2);
        }
        double getPerimeter() {
            return (6 * this.side);
        }
    }