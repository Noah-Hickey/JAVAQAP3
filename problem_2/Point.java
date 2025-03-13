
package problem_2;

public class Point {
    
    // Variables //
    private float x;
    private float y;

    // Constructors //

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with parameters //
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Setters //
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Getters //
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // toString Method //
    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
