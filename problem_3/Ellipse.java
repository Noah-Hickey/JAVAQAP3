package problem_3;

public class Ellipse extends Shape {
    
    private double a;
    private double b;

    // Constructors  - Asked Chat GPT for help on this one as I am not familiar with ellipses. //
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // This ensures that a >= b //
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    // Getters //
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // Setters //

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Abstract Methods for Perimeter & Area //
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * Math.sqrt((a * a + b * b) / (2 * 1.0)); // Formula I found on www.geeksforgeeks.org //
    }
    
}
