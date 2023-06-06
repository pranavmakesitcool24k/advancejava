import java.awt.*;
import java.awt.event.*;

class MyLoginForm extends Frame implements ActionListener {
	
	Button submit,cancel;
	TextField username,password;
	String uname, pass;
	String msg ="";

	MyLoginForm(){
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		// do not set any layout
		this.setLayout(null);

		// now create 2 push Buttons
		submit = new Button("Submit");
		cancel = new Button("Clear");

		// Set Bounds of Buttons
		submit.setBounds(50,100, 60, 25);
		cancel.setBounds(120,100, 60, 25);

		// Add Button to the Frame
		this.add(submit);
		this.add(cancel);

		// <button onclick="validate()">Click</button>
		// attach ActionListener to the Button

		submit.addActionListener(this);
		cancel.addActionListener(this);


		username = new TextField();
		password = new TextField();

		username.setBounds(50,60,100,20);
		password.setBounds(50,80,100,20);

		this.add(password);
		this.add(username);
	}

	public void paint(Graphics g){
		// msg = "User name : "+username.getText()+" ";
		// msg += "\r\nPassword : "+password.getText();
		g.drawString(msg, 50,250);
	}

	public void actionPerformed(ActionEvent ae){

		if(ae.getSource() == submit){
			// this.setBackground(Color.red);
			uname = username.getText();
			pass = password.getText();

			if (uname.equals("pranav") && pass.equals("12345")) {
				msg = "Welcome..!";
			}else{
				msg = "Please Try again..! Username and Password is incorrect";
			}
			repaint();

		}

		if(ae.getSource() == cancel){
			username.setText("");
			password.setText("");
			msg = "";
			repaint();
		}
	}

	public static void main(String[] args) {
		MyLoginForm mb = new MyLoginForm();

		mb.setSize(400,400);
		mb.setTitle("Log in Page");
		mb.setVisible(true);
	}

}