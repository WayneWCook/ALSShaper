/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the main class to test the rectangle, square, circle and rhombus classes.
 * Force a commit
 */
//package Shape-RCC;

public class FindShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,10);
        Square square = new Square(7);
        Circle circle = new Circle(3);
        Rhombus rhombus = new Rhombus(5, 0.5);
        Trapazoid trap = new Trapazoid(3,5,7,4,4);
        Parallelogram par = new Parallelogram(5,4);
        System.out.println("The Rectangle are is: " + rec1.getArea());
        System.out.println("The Square area is: " + square.getArea());
        System.out.println("The Circle area is: " + circle.getArea());
        System.out.println("The Rhombus area is: " + rhombus.getArea());
        System.out.println("The Trapezoid area is: " + trap.getArea());
        System.out.println("The Parallelogram area is: " + par.getArea());
        System.out.println("The Rectangle and Square ares add to: : " + rec1.addArea(square));
        System.out.println("The Circle and Rhombus areas add to: " + circle.addArea(rhombus));
        System.out.println("The Trapezoid and Parallelogram areas add to: " + trap.addArea(par));
}
}

