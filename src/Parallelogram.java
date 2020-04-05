
/*Safwan Ahmad
4/3/20
Parallelogram class
This line is a test of commitment function
 */



public class Parallelogram extends Rectangle {
    private double angle;
    Parallelogram(double myWidth, double myHeight) {
        super(myWidth, myHeight);
        if (angle < 0) angle=0;
        else if (angle > 1) angle=1;
    }
}
