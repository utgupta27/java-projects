package practical;

import javax.swing.*;
import java.awt.*;

public class circleRectangleSwing extends JFrame {

   public circleRectangleSwing(){
       setTitle("Shapes with Swing");
       setSize(800, 800);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   @Override
   public void paint(Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(Color.RED);
       g2d.fillOval(150, 150, 100, 100);
       g2d.setColor(Color.YELLOW);
       g2d.fillRect(300, 250, 250, 500);
   }

   public static void main(String[] args) {

       new circleRectangleSwing();

   }
}
