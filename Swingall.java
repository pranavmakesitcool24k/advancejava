// wap to create a single program using all swing components @pranav
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swingall extends JFrame
{
	Swingall()
	{	
		//creating frame object
		JFrame f= new JFrame(); 
		//creating label  
		JLabel l1 = new JLabel("Label 1");
		this.add(l1);
		//creating button
		JButton b1 = new JButton("Button 1");
		this.add(b1);
		//creating list
		List list = new List();
		list.add("USA");
		list.add("India");
		list.add("Vietnam");
		list.add("Canada");
		list.add("Denmark");
		list.add("France");
		list.add("Great Britain");
		list.add("Japan");
		this.add(list);
		//creating textfield/input box
		JTextField t1 = new JTextField(30);
		this.add(t1);
		//creating radio button object
		JRadioButton r1 = new JRadioButton("Teacher");
		JRadioButton r2 = new JRadioButton("Student");
		JRadioButton r3 = new JRadioButton("Principal");
		JRadioButton r4 = new JRadioButton("Others");
		//creating radio button group so user can check only one option 
		ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
		this.add(r1);
		this.add(r2);
		this.add(r3);
		this.add(r4);

		//JCheckBox c1 = new JCheckBox();
		JCheckBox cb1 = new JCheckBox("C++",false);
		JCheckBox cb2 = new JCheckBox("Python",false);
		JCheckBox cb3 = new JCheckBox("Java",false);

		this.add(cb1);
		this.add(cb2);
		this.add(cb3);

		//error here 
		String str[] = { "Uttar Pradesh", "Orissa", "Gujarat", "Kerala", "Uttaranchal" };
		JComboBox m = new JComboBox(str);
		this.add(m);

	}

	public static void main(String[] args)
	{
		Swingall sa = new Swingall();
		sa.setTitle("Swing All Components");
		sa.setLayout(new FlowLayout());
		sa.setSize(400,400);
		sa.setVisible(true);	
	}
}



























