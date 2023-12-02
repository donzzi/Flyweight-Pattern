import java.awt.*;

// Represents the type of ball, which determines its color.
class BallType implements IColorProvider, IBallTypeProvider {
    private Color c;

    // Constructor to initialize the ball type with a specific color.
    public BallType(Color c) {
        this.c = c;
    }

    // Getter for the ball type color
    @Override
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
        else if(c == Color.ORANGE) {
            return "Orange";
        }
        else if(c == Color.PINK) {
            return "Pink";
        }
        else if(c == Color.BLACK) {
            return "Black";
        }
        return "";
    }

    // Draws the ball type on a Graphics object at a specific position (x, y).
    public void draw(Graphics g, int x, int y) {
        g.setColor(c);
        g.fillOval(x, y, 10, 10);
    }
}
