package practical;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class  ShapesApplet extends Applet
{
    int x=300,y=100,r=50;
    public void paint(Graphics g)
    {
        g.setColor(Color.orange);
        g.drawLine(3,300,200,10);

        g.setColor(Color.red);
        g.drawOval(250,50,100,100);
        g.fillOval(250,50,100,100);

        g.setColor(Color.yellow);
        g.drawOval(250,50,200,100);
        g.fillOval(250,50,200,100);

        g.setColor(Color.blue);
        g.drawRoundRect(10,10,50,100,10,10);
        g.fillRoundRect(200,20,50,100,10,10);

        g.setColor(Color.green);
        g.drawRect(400,50,200,100);
        g.fillRect( 400,50, 200, 100 );

    }
}
