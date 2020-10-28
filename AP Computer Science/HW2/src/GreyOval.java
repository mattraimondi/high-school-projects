// Matthew Raimondi, 7 October 2020, Chapter 2 Problem 15b (Improved)

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class GreyOval extends JPanel
{
  public void paintComponent(Graphics g)
  {
    Scanner keyboard = new Scanner(System.in); // set up the scanner to receive user input
    super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;

    System.out.print("Enter the amount of of rings you would like on the target: ");
    while(!keyboard.hasNextInt())
    {
      keyboard.nextLine(); // Ensure that input is integer
      System.out.println("Please enter an integer...");
    }
    int ringCount = keyboard.nextInt(); // Used to determine amount of rings total
    int ringCountIterator = ringCount; // Used for determining ring color

    int diameter = ringCount*20;
    int offset = diameter/2;

    for (int i = 0; i < ringCount; i++) {
      if (ringCountIterator % 2 == 0) {
        g.setColor(Color.GRAY);
      } else {
        g.setColor(Color.WHITE);
      }
      g.fillOval(xCenter - offset, yCenter - offset, diameter, diameter); // diameter is used twice for the width and height of the "oval"
      diameter = diameter - 20; // Make the next ring smaller
      offset = diameter/2; // Readjust the offset
      ringCountIterator--; // Subtract one from the reverse-interator variable that determines the color of the next ring
    }
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Grey Oval");
    window.setBounds(300, 300, 500, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    GreyOval panel = new GreyOval();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

