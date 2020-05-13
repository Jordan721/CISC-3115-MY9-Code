import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApplet extends JApplet implements ActionListener{

    private JButton button;
	public void init(){
        
        button = new JButton("Hello");
        button.addActionListener(this);
		getContentPane().setBackground(Color.RED);

		setLayout(new FlowLayout());
		add(button);

		rePaint();
	}

	public void actionPerfrormed(ActionEvent e){

		getContentPane().setBackground(Color.White);
	}

	public void paint(Graphics g)

}

// // public void paint(Graphics g){
// g.setColor(Color c);

// g.drawRect(int x, int, int w, int h);
	
// // }