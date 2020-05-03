import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class RGBWindow extends JFrame 
			implements ChangeListener,
				   ActionListener
{


	private JSlider red, green, blue;
	private JTextField redVal, greenVal, blueVal;
	private JButton button;

	public RGBWindow() {

		setTitle("Sliders");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		red = new JSlider(SwingConstants.VERTICAL,
				   0, 255, 0);

	        green = new JSlider(SwingConstants.VERTICAL,
				   0, 255, 0);

		blue = new JSlider(SwingConstants.VERTICAL,
				   0, 255, 0);



		red.setMajorTickSpacing(50);
		green.setMajorTickSpacing(50);
		blue.setMajorTickSpacing(50);

		red.setPaintTicks(true);
		green.setPaintTicks(true);
		blue.setPaintTicks(true);

		red.addChangeListener(this);
		green.addChangeListener(this);
		blue.addChangeListener(this);

		redVal = new JTextField(3);
		greenVal = new JTextField(3);
		blueVal = new JTextField(3);

		redVal.setText("0");
		greenVal.setText("0");
		blueVal.setText("0");

		redVal.setEditable(false);
		blueVal.setEditable(false);
		greenVal.setEditable(false);
		

		setLayout(new GridLayout(3, 3));


		button = new JButton("Change color");

		button.addActionListener(this);
	
		add(redVal);
		add(greenVal);
		add(blueVal);
		add(red);
		add(green);
		add(blue);
		add(button);
		
		setVisible(true);

	 }

	  public void actionPerformed(ActionEvent e) {

	    int red = this.red.getValue();
	    int green = this.green.getValue();
	    int blue = this.blue.getValue();
	    Color color = new Color(red, green, blue);

	    getContentPane().setBackground(color);
	  }

	  public void stateChanged(ChangeEvent e) {

		redVal.setText(Integer.toString(
					red.getValue()));

		blueVal.setText(Integer.toString(
					 blue.getValue()));
		
		greenVal.setText(Integer.toString(
					  green.getValue()));

	  }
	
	public static void main(String[] args) {
		new RGBWindow();
	}	 



}
