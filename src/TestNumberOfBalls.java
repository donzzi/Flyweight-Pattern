import java.awt.*;

public class TestNumberOfBalls {
    public static void main(String[] args) {
        BallPit ballPit = new BallPit();

        // Drop a ball into the pit and verify that it is added to the list of balls.
        ballPit.dropBall(50, 60, Color.YELLOW);

        for(int i = 0; i < 100; i++) {
            ballPit.dropBall(50, 60, Color.YELLOW);
        }

        // Print the number of balls in the ball pit.
        System.out.println("Number of balls in the pit: " + ballPit.getBalls().size());
    }
}
