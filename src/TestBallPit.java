import javax.swing.*;
import java.awt.*;

public class TestBallPit {
    // Constants for the canvas size, number of balls to drop, and number of ball colors.
    static int CANVAS_SIZE = 500;
    static int BALLS_TO_DROP = 2_000_000;
    static int BALL_COLORS = 5;

    public static void main(String[] args) {
        // An instance of the BallPit class.
        BallPit ballPit = new BallPit();

        // Drop a random number of balls of different colors into the pit.
        for (int i = 0; i < BALLS_TO_DROP; i++) {
            ballPit.dropBall(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), getRandomColor());
        }

        // Set the size of the JFrame, make it visible, and print memory usage information.
        ballPit.setSize(CANVAS_SIZE, CANVAS_SIZE);
        ballPit.setVisible(true);

        // Print information about the number of balls dropped and memory usage.
        System.out.println(BALLS_TO_DROP + " balls dropped");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Ball size (8 bytes) * " + BALLS_TO_DROP);
        System.out.println("+ BallTypes size (~30 bytes) * " + BALL_COLORS + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((BALLS_TO_DROP * 8 + BALL_COLORS * 30) / 1024 / 1024) + "MB (instead of " + ((BALLS_TO_DROP * 38) / 1024 / 1024) + "MB)");
    }

    // Generates a random color from the predefined set of colors.
    private static Color getRandomColor() {
        int randomColorIndex = random(0, BALL_COLORS - 1);
        switch (randomColorIndex) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.YELLOW;
            case 4:
                return Color.MAGENTA;
            default:
                return Color.WHITE;
        }
    }

    // Generates a random integer within the specified range.
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}