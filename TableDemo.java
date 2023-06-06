import javax.swing.*;

public class TableDemo
{
	TableDemo()
	{
		JFrame f = new JFrame();
		String rdata[][] = {{"1","Aniket","1000"},{"2","Om","2000"},{"3","Kaveri","3000"}};
		String cdata[] = {"EID","NAME","SALARY"};
		JTable jtb = new JTable(rdata,cdata);
		jtb.setBounds(30,40,300,300);
		JScrollPane s = new JScrollPane(jtb);
		f.add(s);
		f.setTitle("Employee's Data");
		f.setSize(400,400);
		f.setVisible(true);

	}
	public static void main(String[] args) {
		new TableDemo();
	}
}