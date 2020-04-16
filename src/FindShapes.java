/* FindShapes.java
 * Wayne Cook, Luke Langius, Alessandro Krapf, Safwan Ahmad
 * 7 April 2020
 * Create the main class to test the rectangle, square, circle, rhombus, parrallelogram, trapezoid, hexagon, and any regular polygon classes.
 * Force a commit
 */
//package Shape-RCC;

import java.util.Scanner;

public class FindShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s = 0,n = 0;
        Rectangle rec1 = new Rectangle(15,10);
        Square square = new Square(7);
        Circle circle = new Circle(3);
        Rhombus rhombus = new Rhombus(5, 0.5);
        Trapezoid trap = new Trapezoid(5,6,3,9,4);
        Hexagon hex = new Hexagon(5);
        Parallelogram para = new Parallelogram(6,8);
        System.out.println("Rectangle are is: " + rec1.getArea());
        System.out.println("Square area is: "+ square.getArea());
        System.out.println("Circle area is: " + circle.getArea());
        System.out.println("Rhombus area is: " + rhombus.getArea());
        System.out.println("Trapezoid area is: " + trap.getArea());
        System.out.println("Hexagon area is: " + hex.getArea());
        System.out.println("Parallelogram area is: " + para.getArea());
        System.out.println("Rectangle perimeter is: " + rec1.getPerimeter());
        System.out.println("Square perimeter is: "+ square.getPerimeter());
        System.out.println("Circle perimeter is: " + circle.getPerimeter());
        System.out.println("Rhombus perimeter is: " + rhombus.getPerimeter());
        System.out.println("Trapezoid perimeter is: " + trap.getPerimeter());
        System.out.println("Hexagon perimeter is: " + hex.getPerimeter());
        System.out.println("Parallelogram perimeter is: " + para.getPerimeter());
        System.out.println("The areas of Rectangle and Square added together is: " + rec1.addArea(square));
        System.out.println("The areas of Circle and Rhombus added together is: " + circle.addArea(rhombus));
        System.out.println("The areas of Trapezoid and Hexagon added together is: " + trap.addArea(hex));
        System.out.println("The areas of Hexagon and Parallelogram added together is: " + hex.addArea(para));
        System.out.print("How many sides does polygon X have? ");
        n = input.nextDouble();
        System.out.print("How long are the sides of polygon X? ");
        s = input.nextDouble();
        RegularPolygon poly = new RegularPolygon(n,s);
        System.out.println("Polygon X area = " + poly.getArea() + "\n" +
                            "Polygon X perimeter = " + poly.getPerimeter());
        System.out.println("The end is now here, say goodbye to the " + para.getcount() + " shapes");
        rec1.finalized();
        System.out.println("Rectangle has been yeeted, there are now " + para.getcount() + " shapes left");
        square.finalized();
        System.out.println("Square has been yeeted,    there are now " + para.getcount() + " shapes left");
        circle.finalized();
        System.out.println("Circle has been yeeted,    there are now " + para.getcount() + " shapes left");
        rhombus.finalized();
        System.out.println("Rhombus has been yeeted,   there are now " + para.getcount() + " shapes left");
        trap.finalized();
        System.out.println("Trapezoid has been yeeted, there are now " + para.getcount() + " shapes left");
        hex.finalized();
        System.out.println("Hexagon has been yeeted,   there are now " + para.getcount() + " shapes left");
        para.finalized();
        System.out.println("There is only " + para.getcount() + " shape left");
    }

}

