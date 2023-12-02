import java.awt.*;

public interface IBallTypeProvider {
    String getColor();
    void draw(Graphics g, int x, int y);
}
