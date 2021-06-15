package practical;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouseAdapter extends MouseAdapter {
   Frame f;

   mouseAdapter() {
       f = new Frame("Mouse Adapter");
       f.addMouseListener(this);

       f.setSize(300, 300);
       f.setLayout(null);
       f.setVisible(true);
       f.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent windowEvent) {
               f.dispose();
           }
       });
   }

   public static void main(String[] args) {
       new mouseAdapter();
   }

   public void mouseClicked(MouseEvent e) {
       Graphics g = f.getGraphics();
       g.setColor(Color.BLUE);
       g.fillOval(e.getX(), e.getY(), 30, 30);
   }
}
