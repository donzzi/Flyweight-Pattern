import java.awt.*;

// Represents a ball with a specific position (x, y) and a type that determines its color.
class Ball {
    private int x;
    private int y;
    private BallType type;
    // Boolean variable is used to confirm the creation of a ball object
    public static boolean isObjectCreated;

    // Constructor to initialize the ball's position and type.
    public Ball(int x, int y, BallType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        isObjectCreated = true;
    }

    // Getter for the ball color
    public String getColor() {
        return type.getColor();
    }

    // Getter for the ball X position on JFrame
    public int getX() {
        return x;
    }

    // Getter for the ball Y position on JFrame
    public int getY() {
        return y;
    }

    // Draws the ball on a Graphics object using its type's draw method.
    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}