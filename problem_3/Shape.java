package problem_3;

public abstract class Shape {
    
    protected String name;

    // Constructors //

    public Shape(String name) {
        this.name = name;
    }

    // Getters //

    public String getName() {
        return name;
    }

    // Abstract Methods for Perimeter & Area //

    public abstract double getArea();
    public abstract double getPerimeter();

    // toString Method - Will give the data based on the sub-classes //

    @Override
    public String toString() {
        return "Shape: " + name + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
