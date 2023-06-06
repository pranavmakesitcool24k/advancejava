/*Java Quiz Test*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class OnlineTest extends JFrame implements ActionListener
{
JLabel l;
JRadioButton jb[]=new JRadioButton[5];
JButton b1,b2;
ButtonGroup bg;
int count=0,current=0,x=1,y=1,now=0;
int m[]=new int[10];
OnlineTest(String s)
{
super(s);
JOptionPane.showMessageDialog(this,"Wel-Come to Java Quiz! Click Ok to Proceed!... All The Best... ");
l=new JLabel();
add(l);
bg=new ButtonGroup();
for(int i=0;i<5;i++)
{
jb[i]=new JRadioButton();
add(jb[i]);
bg.add(jb[i]);
}
b1=new JButton("Next");
b2=new JButton("Bookmark");
b1.addActionListener(this);
b2.addActionListener(this);
add(b1);add(b2);
set(); 
l.setBounds(30,40,650,20);
jb[0].setBounds(50,80,100,20);
jb[1].setBounds(50,110,100,20);
jb[2].setBounds(50,140,100,20);
jb[3].setBounds(50,170,100,20);
b1.setBounds(100,240,100,30);
b2.setBounds(270,240,100,30);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
setLocation(550,300);
setVisible(true);
setSize(750,350);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
if(check())
count=count+1;
current++;
set();
if(current==9)
{
b1.setEnabled(false);
b2.setText("Result");
}
}
if(e.getActionCommand().equals("Bookmark"))
{
JButton bk=new JButton("Bookmark"+x);
bk.setBounds(480,20+30*x,100,30);
add(bk);
bk.addActionListener(this);
m[x]=current;
x++;
current++;
set();
if(current==9)
b2.setText("Result");
setVisible(false);
setVisible(true);
}
for(int i=0,y=1;i<x;i++,y++)
{
if(e.getActionCommand().equals("Bookmark"+y))
{
if(check())
count=count+1;
now=current;
current=m[y];
set();
((JButton)e.getSource()).setEnabled(false);
current=now;
}
}
if(e.getActionCommand().equals("Result"))
{
if(check())
count=count+1;
current++;
JOptionPane.showMessageDialog(this,"correct ans="+count);
JOptionPane.showMessageDialog(this,"Thank You!");
System.exit(0);
}
}
void set()
{
jb[4].setSelected(true);
if(current==0)
{
l.setText("Q.1: Which is a component in AWT that can contain another components like button, textfields, lables, etc.?");
jb[0].setText("Window");jb[1].setText("Container");jb[2].setText("Panel");jb[3].setText("Frame");
}
if(current==1)
{
l.setText("Q.2: Swing is based on __ architecture.");
jb[0].setText("layered");jb[1].setText("client server");jb[2].setText("model view controller");jb[3].setText("none of these");
}
if(current==2)
{
l.setText("Q.3: In swing JButton class derived from ___.");
jb[0].setText("none of these");
jb[1].setText("JComponent");
jb[2].setText("JToggleButton");
jb[3].setText("AbstractButton");
}
if(current==3)
{
l.setText("Q.4: Which of these packages contains all the event handling interface?");
jb[0].setText("java.awt.event");
jb[1].setText("java.lang");
jb[2].setText("java.awt");jb[3].setText("java.event");
}
if(current==4)
{
l.setText("Q.5: Which of these methods will be invoked if a charater is entered?");
jb[0].setText("KeyPressed()");
jb[1].setText("KeyReleased()");
jb[2].setText("KeyTyped()");jb[3].setText("KeyEntered()");
}
if(current==5)
{
l.setText("Q.6: Which package contains the classes & interfaces required for java networking?");
jb[0].setText("java.io");jb[1].setText("java.util");jb[2].setText("java.net");jb[3].setText("java.awt");
}
if(current==6)
{
l.setText("Q.7: JDBC stands for ___. ");
jb[0].setText("Java Database Control");jb[1].setText("Java Database Conectivity");jb[2].setText("Java Database Components");jb[3].setText("None of these");
}
if(current==7)
{
l.setText("Q.8: Java applet are used to create __.");
jb[0].setText("graphical");jb[1].setText("user interactive");jb[2].setText("none of these");jb[3].setText("both (a) & (b)");
}
if(current==8)
{
l.setText("Q.9: Which object can be constructed to show any number of choices in the visible window?");
jb[0].setText("Choice");jb[1].setText("List");jb[2].setText("Menu");
jb[3].setText("Checbox");
}
if(current==9)
{
l.setText("Q.10: Following letter used as a prefix to swing component.");
jb[0].setText("A");jb[1].setText("G");jb[2].setText("J");jb[3].setText("S");
}
l.setBounds(30,40,650,20);
for(int i=0,j=0;i<=90;i+=30,j++)
jb[j].setBounds(50,80+i,200,20);
}
boolean check()
{
if(current==0)
return(jb[1].isSelected());
if(current==1)
return(jb[2].isSelected());
if(current==2)
return(jb[3].isSelected());
if(current==3)
return(jb[0].isSelected());
if(current==4)
return(jb[2].isSelected());
if(current==5)
return(jb[2].isSelected());
if(current==6)
return(jb[1].isSelected());
if(current==7)
return(jb[3].isSelected());
if(current==8)
return(jb[1].isSelected());
if(current==9)
return(jb[2].isSelected());
return false;
}
public static void main(String s[])
{
new OnlineTest("Online Java Test");
}
}