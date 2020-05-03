import javax.swing.*; //components
import java.awt.*; //layout (if we decide we want one)
import java.awt.event.*; //button listener

public class TemperatureConverter extends JFrame 
        implements ActionListener{

  private JButton button;
  private JTextField textBox;
  private JLabel label;

  public TemperatureConverter() {

    super();

    setTitle("Temperature Converter");

    setSize(500, 500);

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    button = new JButton("Calculate!");
    label = new JLabel("Enter a C temperature: ");

    textBox = new JTextField(15);


    button.addActionListener(this);
    setLayout(new FlowLayout());

    add(label);

    add(textBox);

    add(button);

    
    setVisible(true);

  }

      
        public void actionPerformed(ActionEvent e) {

      String text = textBox.getText();

    try {
      double value = Double.parseDouble(text);

      value = value * 9 / 5 + 32;

      text = Double.toString(value);

      textBox.setText(text);
    }catch(NumberFormatException exp) {
    textBox.setText("Please enter a number.");    
    }
       
  }
      

  public static void main(String[] args) {


    new TemperatureConverter();
  }


  /*

  default: BorderLayout

  5 regions to put things: 
    NORTH, SOUTH, EAST, WEST, CENTER
  can only put one thing in each location


  FlowLayout
     adds things left to right in order,
    and moves components around based on window size


        GridLayout
    can specify how many rows and columns to add
    components in, adds them row by row. 



  */








}
