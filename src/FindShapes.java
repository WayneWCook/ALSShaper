/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the main class to test the rectangle, swuare, circle and shombus classes.
 * Force a commit
 */
//package Shape-RCC;

public class FindShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,10);
        Square square = new Square(7);
        Circle circle = new Circle(3);
        Rhombus rhombus = new Rhombus(5, 0.5);
        Trapezoid trap = new Trapezoid(5,6,3,9,4);
        Hexagon hex = new Hexagon(6);
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

    }

}

