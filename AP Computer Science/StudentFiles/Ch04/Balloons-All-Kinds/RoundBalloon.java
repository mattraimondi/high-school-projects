//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon {

    public RoundBalloon() {
        super();
    }

    public RoundBalloon(int x, int y, int r, Color c) {
        super(x, y, r, c);
    }

    public void draw(Graphics g, boolean makeItFilled) {
        g.setColor(getColor());
        if (makeItFilled)
            g.fillOval(getX() - getRadius(), getY() - getRadius(), 2 * getRadius(), 2 * getRadius());
        else
            g.drawOval(getX() - getRadius(), getY() - getRadius(), 2 * getRadius(), 2 * getRadius());
    }
}
