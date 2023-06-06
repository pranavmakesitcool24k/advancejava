import javax.swing.*;  

public class FirstSwingExample {  

	public static void main(String[] args) {  
		
	//creating instance of JFrame
	JFrame f=new JFrame();  

	//creating instance of JButton  
	JButton b=new JButton("click");

	//x axis, y axis, width, height  
	b.setBounds(130,100,100, 40);

	//adding button in JFrame   
	f.add(b);
	          
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
				}  
 }