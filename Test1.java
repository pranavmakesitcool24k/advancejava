import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test1 extends JFrame implements ActionListener
{	
	JTextField jf;
	JButton b1,b2;
	Test1()
	{	
		jf = new JTextField(60);
		b1 = new JButton("First");
		b2 = new JButton("Second");
		
		
		setLayout(new FlowLayout());
		setSize(400,400);
		add(b1);
		add(b2);
		add(jf);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setTitle("Action Listener Program");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			jf.setText("First button is clicked!");
		}else if(e.getSource() ==b2){
			jf.setText("Second button is clicked!");
		}else{
			jf.setText("Error in program!");
		}
		
	}


	public static void main(String[] args) {
		new Test1();
	}
}