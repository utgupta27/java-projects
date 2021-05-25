package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class hello extends Applet {

    @Override
    public void paint(Graphics g){
        g.drawString("Hello Applet",20,20);
    }
}