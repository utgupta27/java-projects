package swings;

import javax.swing.*;

public class hello {

    void helloSwing(){
        JFrame f = new JFrame();
        JButton b = new JButton("Click Here");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.helloSwing();
    }
}
