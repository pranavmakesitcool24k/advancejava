import java.awt.*;
import java.awt.event.*;

class Home extends Frame
{

	Home(){
		this.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e){System.exit(0);}});
	}

	public void paint(Graphics g)
	{
	 //sun
	 g.setColor(Color.yellow);
	 g.fillOval(200,120,120,120);
 	 g.setColor(Color.black);
 	 g.drawLine(20,250,150,60);	
	 g.drawLine(20,250,500,250);
	 g.drawLine(150,60,250,250);
	 g.drawLine(250,250,400,60);
	 g.drawLine(400,60,500,250);	
	}

	public static void main(String[] args)
	{
		Home h = new Home();
		h.setSize(1800,1000);
		h.setTitle("Homework");
		h.setVisible(true);
	}
}
