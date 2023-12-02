import java.awt.*;
import java.util.*;

// Factory class responsible for creating and caching different ball types based on color.
class BallFactory {
    static Map<Color, BallType> ballTypes = new HashMap<>();

    // Returns a ball type based on the specified color
    public static BallType getBallType(Color c) {
        BallType result = ballTypes.get(c);
        if(result == null) {
            result = new BallType(c);
            ballTypes.put(c, result);
        }

        return result;
    }
}