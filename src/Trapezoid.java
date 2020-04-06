/* Luke Langius
 * Trapezoid.java
 * Created a Trapezoid class based off of the Shape class, made new getArea() and getPerimeter() because I extended from the shape class.
 * 4/3/20
 */
public class Trapezoid extends Shape{
    private double height, base1, base2, side1, side2;                      //Create everything needed for the ability to calculate the area and the perimeter.

    Trapezoid (double myHeight, double myBase1, double myBase2, double mySide1, double mySide2) {
        this.height = myHeight;
        this.base1 = myBase1;                                                 //Defining the constructor and all of the things for area and perimeter.
        this.base2 = myBase2;
        this.side1 = mySide1;
        this.side2 = mySide2;
    }
    double getArea() {return ((this.base1 + this.base2) / 2) * this.height; }                                     //Calculating the area and perimeter of the trapezoid.
    double getPerimeter() {return this.base1 + this.base2 + this.side1 + this.side2; }
}
