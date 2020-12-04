// Chapter 5 Question 27
// Edited and corrected by Matthew Raimondi with the help of Mr. Eggli during class, 11/19/20

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = width/2, yCenter = (int) ((3.0/4.0 * height) + 0.5);
 
    // Declare and initialize the radius of the large semicircle:
    int largeRadius = width / 4,
            smallRadius = height / 4,
            mediumRadius = (int) (Math.sqrt(smallRadius * largeRadius) + 0.5);

    g.setColor(Color.RED);

    // Draw the large semicircle:
     g.fillArc(xCenter - largeRadius, yCenter - largeRadius, 2 * largeRadius, 2 * largeRadius, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:

    g.setColor(Color.GREEN);
    g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, 2 * mediumRadius, 2 * mediumRadius, 0, 180);

    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter - smallRadius, yCenter - smallRadius, 2 * smallRadius, 2 * smallRadius, 0, 180);


    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    int redWidth = largeRadius - mediumRadius;
    int greenWidth = mediumRadius - smallRadius;
    int magentaRadius = 2 * greenWidth - redWidth;
    int smallestRadius = 0;

    // Draw the sky-color semicircle:
    g.setColor(skyColor);
    g.fillArc(xCenter - smallestRadius, yCenter - smallestRadius, 2 * smallestRadius, 2 * smallestRadius, 0, 180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
