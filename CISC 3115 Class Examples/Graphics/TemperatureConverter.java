import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame{

  private class Converter implements ActionListener{

    public void actionPerformed(ActionEvent e){

      String value = text.geetText();
    }
  }

  private JLabel prompt;

  private JTextField text;

  private JButton button;

  public TemperatureConverter(){

    super();

    setSize(500,100);

    setVisible(true);

    setDefalutClosedOperation(JFrame.EXIT_ON_CLOSE);

    setTitle("Temperature Converter");

    prompt = new JLabel("Enter a elsius Temperature:");

    text = new JTextField();

    button = new JButton("calculate!!!!");

    JPanel panel = new JPanel;

    panel.add(prompt);

    panel.add(text);

    panel.add(button);

    add(panel);

    setVisible(true);

  }

  public static void main(String[] args){
    new TemperatureConverter();
  }
}
