import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame 
		implements ActionListener {


	private JRadioButton white, blue, red, cyan;

	public ColorChanger() {

		super();

		setTitle("Color changer");

		setSize(500, 500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		white = new JRadioButton("white", true);

		blue = new JRadioButton("blue");

		red = new JRadioButton("red");

		cyan = new JRadioButton("cyan");

		ButtonGroup group = new ButtonGroup();

		group.add(white);
		group.add(red);
		group.add(blue);
		group.add(cyan);

		setLayout(new FlowLayout());

		white.addActionListener(this);
		blue.addActionListener(this);
		red.addActionListener(this);
		cyan.addActionListener(this);

		add(white);
		add(blue);
		add(red);
		add(cyan);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		JRadioButton selected = 
				(JRadioButton)e.getSource();

		if(selected==white)
		   getContentPane().setBackground
					(Color.WHITE);
		
		else if(selected==blue)
		   getContentPane().setBackground(Color.BLUE);
		

		else if(selected==red)
		  getContentPane().setBackground(Color.RED);

		else
		   getContentPane().setBackground(Color.CYAN);

	}

	public static void main(String[] args) {

		new ColorChanger();
	}
}

