package practical;

import java.awt.*;
import java.awt.event.*;

public class swingForms {
    public swingForms() {
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(new Label("First Name:    "));
        TextField firstName = new TextField(20);
        frame.add(firstName);
 
        frame.add(new Label("Last Name:    "));
        TextField lastName = new TextField(20);
        frame.add(lastName);
 
        frame.add(new Label("Date of Birth:    "));
        TextField dateOfBirth = new TextField(20);
        frame.add(dateOfBirth);
 
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Dialog dialog = new Dialog(frame, "Success", true);
                dialog.setLayout(new FlowLayout());
                dialog.add(new Label("Data Submitted!"));
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent windowEvent) {
                        dialog.dispose();
                    }
                });
 
                dialog.setSize(100, 100);
                dialog.setVisible(true);
            }
        });
        frame.add(submitButton);
 
        Button resetButton = new Button("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstName.setText("");
                lastName.setText("");
                dateOfBirth.setText("");
            }
        });
        frame.add(resetButton);
 
 
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                frame.dispose();
            }
        });
 
        frame.setTitle("Swing Forms");
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        new swingForms();
    }
 
}
