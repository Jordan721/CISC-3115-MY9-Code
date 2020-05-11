import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckBoxFrame extends JFrame 
			   implements ItemListener,
				      ActionListener
{



	private JCheckBox colorHandler;
	private JCheckBox textBoxHandler;

	private JTextField input;
	

	private JButton exclamation;

	public CheckBoxFrame() {


	  setLayout(new FlowLayout());
	  setTitle("Check boxes");
	
          setSize(500, 500);

	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	  colorHandler = new JCheckBox("Change color to blue");

	  textBoxHandler = new JCheckBox("enable text box");

	  exclamation = new JButton("add exclamation point");

	  exclamation.addActionListener(this);
		
	  colorHandler.addItemListener(this);
          textBoxHandler.addItemListener(this);

	  input = new JTextField(10);

	  input.setEditable(false);

	

	  JPanel north = new JPanel();
	  north.add(textBoxHandler);
	  north.add(colorHandler);

	
	  add(north);
	  
	  JPanel center = new JPanel();
	  center.add(input);
	  center.add(exclamation);
	
	  add(center);


	  setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {

		if(input.isEditable())

		   input.setText(input.getText() + "!");

	}

	public void itemStateChanged(ItemEvent e) {

		if(e.getSource()==colorHandler) {
			if(colorHandler.isSelected())
				getContentPane().
				setBackground(Color.BLUE);
 			else
			       getContentPane().
				setBackground(Color.WHITE);
		}
		if(e.getSource()==textBoxHandler) {

		    if(textBoxHandler.isSelected()) 
		    	input.setEditable(true);
		    else
			input.setEditable(false);
	        }
	}
	
	public static void main(String[] args) {

	    new CheckBoxFrame();
	}
}