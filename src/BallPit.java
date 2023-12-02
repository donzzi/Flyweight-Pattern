import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

// Represents a ball pit as a JFrame, containing a list of balls to be displayed.
class BallPit extends JFrame {
    private List<Ball> balls = new ArrayList<>();

    // Drops a ball into the pit at the specified position with a given color.
    public void dropBall(int x, int y, Color c) {
        BallType type = BallFactory.getBallType(c);
        Ball ball = new Ball(x, y, type);
        balls.add(ball);
    }

    // Getter method to retrieve the list of balls
    public List<Ball> getBalls() {
        return balls;
    }

    // Overrides the paint method to draw all the balls on the JFrame.
    @Override
    public void paint(Graphics graphics) {
        for (Ball ball : balls) {
            ball.draw(graphics);
        }
    }
}
