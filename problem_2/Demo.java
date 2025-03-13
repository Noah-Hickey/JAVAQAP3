package problem_2;

public class Demo {
    public static void main(String[] args) {

        // Test the point class //
        Point p1 = new Point(2.3f, 3.6f);
        System.out.println("Initial point: " + p1);

        // Test the movable point class //
        MovablePoint mp1 = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("Initial movable point: " + mp1);

        // Move the point 3 times //
        mp1.move();
        mp1.move();
        mp1.move();
        System.out.println("After moving: " + mp1);
    }
}
