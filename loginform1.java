import java.awt.*;
import java.awt.event.*;

class LoginForm extends Frame implements ActionListener
{
	Button submit,cancel;
	TextField username,password;
	String uname, pass;
	String msg ="";

	//constructor
	LoginForm(){
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
								{
									System.exit(0);
								}
			}
						 );


		// do not set any layout
		this.setLayout(null);

		// now create 2 push Buttons
		submit = new Button("Submit");
		cancel = new Button("Clear");

		submit.setBounds(50,110, 60, 25);
		cancel.setBounds(120,110, 60, 25);

		// Add Button to the Frame
		this.add(submit);
		this.add(cancel);

		// attach ActionListener to the Button
		submit.addActionListener(this);
		cancel.addActionListener(this);

		username = new TextField();
		password = new TextField();

		username.setBounds(50,60,100,20);
		password.setBounds(50,100,100,20);

		this.add(password);
		this.add(username);
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, 50,250);
	}

	public void actionPerformed(ActionEvent ae)
	{
		//checking submit button is click or not
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
		//checking cancel button is click or not
		if(ae.getSource() == cancel){
			//passing empty string to input box
			username.setText("");
			password.setText("");
			msg = "";
			repaint();
		}
	}

		//main method contain static keyword so it will allocate memory to this class first!
		public static void main(String[] args) {
		//creating object frame
		MyLoginForm mb = new MyLoginForm();

		mb.setSize(400,400);
		mb.setTitle("Log in Page");
		mb.setVisible(true);
	}



	}












































































































































