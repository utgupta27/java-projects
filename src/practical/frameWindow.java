package practical;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frameWindow {
    

class SampleFrame extends Frame {
   SampleFrame(String title) {
       super(title);
       MyWindowAdapter adapter = new MyWindowAdapter(this);
       addWindowListener(adapter);
   }

   public void paint(Graphics g) {
       g.drawString("This is in frame window", 100, 100);
   }
}

class MyWindowAdapter extends WindowAdapter {
   SampleFrame sampleFrame;

   public MyWindowAdapter(SampleFrame sampleFrame) {
       this.sampleFrame = sampleFrame;
   }

   public void windowClosing(WindowEvent we) {
       sampleFrame.setVisible(false);
   }
}

public class AppletFrame extends Applet {
   Frame f;

   public void init() {
       f = new SampleFrame("A Frame Window");
       f.setSize(300, 300);
       f.setVisible(true);
   }

   public void start() {
       f.setVisible(true);
   }

   public void stop() {
       f.setVisible(false);
   }

   public void paint(Graphics g) {
       g.drawString("This is in applet window", 15, 30);
   }

}


}
