package problem_3;

public class Circle extends Shape {
    
    private double radius;

    // Constructors //

    public Circle(String name, double radius) {
        super(name);    // This calls Shape's constructor for name //
        this.radius = radius;
    }

    // Getters //

    public double getRadius() {
        return radius;
    }

    // Setters //

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Abstract Methods for Perimeter & Area - Assisted by Chat GPT//

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
