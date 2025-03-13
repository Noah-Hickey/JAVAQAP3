
package problem_2;

public class MovablePoint extends Point{
    
    // Variables for speed //

    private float xSpeed;
    private float ySpeed;

    // Constructors //

    public MovablePoint() {
        super();

        this.xSpeed = 0.0f;

        this.ySpeed = 0.0f;
    }

    // Constructor with parameters //

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);

        this.xSpeed = xSpeed;

        this.ySpeed = ySpeed;
    }

    // Setters //

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Getters //

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // Method for moving the point by its speed //

    public void move() {
        setX(getX() + xSpeed); // Using the inherited methods from Point class //
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "Movable" + super.toString()
        + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
