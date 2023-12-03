import java.awt.*;

public class TestBallCreation {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 20, new BallType(Color.RED));
        Ball ball1 = new Ball(30, 70, new BallType(Color.ORANGE));

        // Verify that the ball is created successfully with the specified color and position
        if(BallConfirmation.isObjectCreated) {
            System.out.println(ball1.getBallColor() + " ball created successfully at x = " + ball1.getX() + " and y = " + ball1.getY());
        }
        else {
            System.out.println("Ball was not created");
        }
    }
}
