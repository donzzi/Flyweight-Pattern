import java.awt.*;

public class TestBallFactory {
    public static void main(String[] args) {
        // Get BallType objects from the factory with different colors
        BallType redBallType = BallFactory.getBallType(Color.RED);
        BallType blueBallType = BallFactory.getBallType(Color.BLUE);
        BallType greenBallType = BallFactory.getBallType(Color.GREEN);

        // Print the color names of the BallType objects
        System.out.println("Red BallType Color: " + redBallType.getColor());
        System.out.println("Blue BallType Color: " + blueBallType.getColor());
        System.out.println("Green BallType Color: " + greenBallType.getColor());

        // Get BallType objects with the same colors to test if they are shared
        BallType redBallTypeRepeated = BallFactory.getBallType(Color.RED);

        // Verify that the BallType objects with the same colors are shared
        System.out.println("Are Red BallTypes the same? " + (redBallType == redBallTypeRepeated));
        System.out.println("Are Blue and Green BallTypes the same? " + (blueBallType == greenBallType));
    }
}
