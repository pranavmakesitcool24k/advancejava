import java.awt.*;
import java.awt.event.*;

class MyFrame{
	public static void main(String[] args){

		Frame f = new Frame();
		f.setSize(300,400);
		f.setTitle("Frame");
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}