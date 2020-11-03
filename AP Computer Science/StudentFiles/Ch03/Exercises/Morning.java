//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Morning extends JFrame implements ActionListener
{
  private int time;
  private EasySound rooster;
  private EasySound cow;
  private Container c = getContentPane();

  /**
   *   Constructor
   */

  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    cow = new EasySound("moo.wav");

    c.setBackground(Color.WHITE);
    rooster.play();

    time = 0;
    Timer clock = new Timer(5000, this);
    clock.start();
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    if (time % 2 == 0) {
      c.setBackground(Color.WHITE);
      rooster.play();
    } else {
      c.setBackground(Color.BLACK);
      cow.play();
    }
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
