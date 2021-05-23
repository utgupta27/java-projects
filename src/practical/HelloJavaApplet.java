package practical;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;


public class HelloJavaApplet extends Applet{

    public void init(){
        setBackground(Color.black);
    }

    public void paint(Graphics g){
        showStatus("Utsav Gupta");
        g.setColor(Color.blue);
        g.drawString("Hello World...",30,180);
    }
}