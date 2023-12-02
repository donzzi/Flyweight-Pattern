import javax.swing.*;
import java.awt.*;

public class TestBallDrawing {
    public static void main(String[] args) {
        BallPit ballPit = new BallPit();

        // Create two balls to test if they are shown in the JFrame
        ballPit.dropBall(40, 35, Color.YELLOW);
        ballPit.dropBall(76, 170, Color.GREEN);

        // Creates a 200 by 200 JFrame
        ballPit.setSize(200, 200);
        ballPit.setVisible(true);
    }
}
