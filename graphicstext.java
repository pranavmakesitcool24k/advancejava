import java.awt.*;
import java.awt.event.*;

class GraphicsText extends Frame{
	GraphicsText(){
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		g.setColor(Color.red);

		Font f1=new Font("serif",Font.PLAIN,30);
		Font f2=new Font("serif",Font.ITALIC,30);
		Font f3=new Font("Arial",Font.BOLD+Font.ITALIC,30);
		Font f4=new Font("Times New Roman", Font.BOLD,20);

		Color purple =new Color(138,43,226);

		g.setFont(f1);
		g.setFont(f2);
		g.setFont(f3);
		g.setFont(f4);
		g.setColor(Color.black);
		g.drawString("How are you...?",20,100);
		g.drawString("I am fine",40,130);
		g.drawString("What's the time",60,150);
		g.drawString("Its 12'o clock",80,170);
	}
	public static void main(String[]args){
		GraphicsText gt=new GraphicsText();
		gt.setSize(400,400);
		gt.setTitle("Graphics Text");
		gt.setVisible(true);
	}
}