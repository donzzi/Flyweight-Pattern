import java.awt.*;

// Represents the type of ball, which determines its color.
class BallType {
    private Color c;

    // Constructor to initialize the ball type with a specific color.
    public BallType(Color c) {
        this.c = c;
    }

    // Getter for the ball type color
    public String getColor() {
        if(c == Color.RED) {
            return "Red";
        }
        else if(c == Color.BLUE) {
            return "Blue";
        }
        else if(c == Color.GREEN) {
            return "Green";
        }
        else if(c == Color.YELLOW) {
            return "Yellow";
        }
        else if(c == Color.MAGENTA) {
            return "Magenta";
        }
        else if(c == Color.WHITE) {
            return "White";
        }
        return "";
    }

    // Draws the ball type on a Graphics object at a specific position (x, y).
    public void draw(Graphics g, int x, int y) {
        g.setColor(c);
        g.fillOval(x, y, 10, 10);
    }
}
