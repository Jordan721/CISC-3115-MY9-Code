import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener{

	private JTextField number1, number2;
	private JTextField results;

	private JButton plus;
	private JButton times;

	oublic Calculator(){

		setTitle("Calculator");

		setDefalutCloseOperation(EXIT_ON_CLOSE);

		setSize(500,500);
		number1 = new TextField(20);

		number2 = new TextField(20);

		result = new TextField();

		plus = new JButton("+");

		times = new JButton("*");

		JPanel panel = new Panel();

		northpanel.add(number1);
		northpanel.add(plus);
		northpanel.add(times);
	    northpanel.add(number2);

	    add(panel, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel();

        centerPanel.add(new JLable("="));
        centerPanel.add(result);

	    setVisible(true)
	}

	public void actionPerfromed(ActionEven e){

		String text1 = number1.getText();

		String text2 = number2.getText();

		int value1, value2;

		try{
			value1 = Integer.parseInt(text1);
		}catch(numberFormatException e1){
			
		}
	}
}