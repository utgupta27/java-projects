package practical;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingCalc extends Applet implements ActionListener {
   double x, y, z;
   String resultString;
   TextField textFieldFirstOperand, textFieldSecondOperand, textFieldResult;
   Label messageFirstOperand, messageSecondOperand;
   Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;

   public void init() {
       setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
       textFieldFirstOperand = new TextField(20);
       textFieldSecondOperand = new TextField(20);
       textFieldResult = new TextField(20);
       messageFirstOperand = new Label("Input First Operand:");
       messageSecondOperand = new Label("Input Second Operand");
       buttonAdd = new Button("+");
       buttonSubtract = new Button("-");
       buttonMultiply = new Button("*");
       buttonDivide = new Button("/");
       add(messageFirstOperand);
       add(textFieldFirstOperand);
       add(messageSecondOperand);
       add(textFieldSecondOperand);
       add(new Label(""));
       add(buttonAdd);
       add(buttonSubtract);
       add(buttonMultiply);
       add(buttonDivide);
       add(new Label(""));
       add(new Label("Result:"));
       add(textFieldResult);
       buttonAdd.addActionListener(this);
       buttonSubtract.addActionListener(this);
       buttonMultiply.addActionListener(this);
       buttonDivide.addActionListener(this);
   }

   public void actionPerformed(ActionEvent actionCommand) {
       try {
           x = Double.parseDouble(textFieldFirstOperand.getText());
           y = Double.parseDouble(textFieldSecondOperand.getText());
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Incorrect Input!");
       }
       String operatorString = actionCommand.getActionCommand();
       switch (operatorString) {
           case "+":
               z = x + y;
               break;
           case "-":
               z = x - y;
               break;
           case "*":
               z = x * y;
               break;
           case "/":
               z = x / y;
               break;
       }
       resultString = String.valueOf(z);
       textFieldResult.setText(resultString);
   }
}

