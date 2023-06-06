import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MyJmenu extends JFrame implements ActionListener{

	JMenuBar mb;
	JMenu file,edit;
	JMenuItem op,nf,pr,cp,pst,ct;

	MyJmenu(){
		// Container c = getContentPane();
		// c.setLayout(new BorderLayout());

		this.setLayout(new BorderLayout());   

		mb = new JMenuBar();  // create menu bar

		// c.add("North",mb);
		this.add("North", mb); // adding menubar to the container

		file = new JMenu("File");    // creating a menu 

		mb.add(file);   // add menu to the menu bar

		op = new JMenuItem("Open File");    // create menu items
		nf = new JMenuItem("New File");

		file.add(op);    // adding menu items to the menu
		file.add(nf);

		edit = new JMenu("Edit");
		mb.add(edit);
		cp = new JMenuItem("Copy");
		pst = new JMenuItem("Paste");
		ct = new JMenuItem("Cut");
		edit.add(cp);edit.add(pst);edit.add(ct);

		op.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		if(op.isArmed()){ this.openFile(); }
	}

	void openFile(){
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if(i == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
		}
	}

	public static void main(String[] args) {
		MyJmenu mj = new  MyJmenu();

		mj.setSize(500,500);
		mj.setVisible(true);
	}
}
