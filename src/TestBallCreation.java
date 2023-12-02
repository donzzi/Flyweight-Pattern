import java.awt.*;

public class TestBallCreation {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 20, new BallType(Color.RED));

        // Verify that the ball is created successfully with the specified color and position
        if(Ball.isObjectCreated) {
            System.out.println(ball.getColor() + " ball created successfully at x = " + ball.getX() + " and y = " + ball.getY());
        }
        else {
            System.out.println("Ball was not created");
        }
    }
}
