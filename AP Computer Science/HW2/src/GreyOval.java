// Matthew Raimondi, 3 October 2020, Chapter 2 Problem 15b

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GreyOval extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.GRAY);
    g.fillOval(xCenter - 30, yCenter - 30, 60, 60);
    g.setColor(Color.WHITE);
    g.fillOval(xCenter - 20 , yCenter - 20, 40, 40);
    g.setColor(Color.GRAY);
    g.fillOval(xCenter - 10, yCenter - 10, 20, 20);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Grey Oval");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GreyOval panel = new GreyOval();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

