import javax.swing.*;
import java.awt.*; 


public class SwingDemo{
		
		public static void main(String[] args)
		{
			Demo d1 = new Demo();
			
		}

					}

//another class

class Demo extends JFrame
{
	Demo()
	{
		JLabel l1 = new JLabel("Select Hobby->");
		JRadioButton r1=new JRadioButton("A) Cricket");    
		JRadioButton r2=new JRadioButton("B) Football"); 
		JRadioButton r3=new JRadioButton("C) Hockey");
		JRadioButton r4=new JRadioButton("D) Basketball");
		JRadioButton r5=new JRadioButton("E) Boxing");
		ButtonGroup bg=new ButtonGroup();           
		add(l1);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
	}
}






















/* 
structure of program


class First
{
	main method()
	{
		create object of Second class
		for ex.
		Second s1 = new Second();
		do not forget to type:
		s1.setVisible(true)

	}
}

class Second extends JFrame
{
	Second()
	{
		//constructor body
		here you can implement components,methods,etc.
	}
}



*/









