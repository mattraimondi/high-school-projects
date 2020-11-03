import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon {

    public FancyBalloon() {
        super();
    }

    public FancyBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(getColor());
        if (makeItFilled) {
            g.fillRect((getX() - getRadius() / 2), getY() - getRadius(), getRadius() / 4, getRadius() * 2);
            g.fillRect(getX() - getRadius(), getY() - getRadius(), getRadius(), getRadius() / 4);
        } else {
            g.drawRect(getX() - getRadius(), getY() - getRadius(), getRadius() / 4, getRadius() * 2);
            g.drawRect(getX() - getRadius(), getY() - getRadius(), getRadius(), getRadius() / 4);
        }
    }
}
