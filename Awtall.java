import java.awt.*;

public class Awtall
{
	public static void main(String[] args) 
	{
		All a1 = new All();
	}

}
	class All extends Frame 
	{
		All()
		{
			Label l1 = new Label("Label Component");
			Frame f1 = new Frame();
			f1.add(l1);
 			TextField text1 = new TextField("Textfield Component",50);
 			f1.add(text1);
 			Button b1 = new Button("Button Component");
 			f1.add(b1);
 			TextArea area = new TextArea("Textarea Component");    
 			f1.add(area);
 			Checkbox checkbox1 = new Checkbox("Checkbox Component", true);
 			f1.add(checkbox1);
 			Choice c = new Choice();
 			c.add("Choice Component 1");    
	        c.add("Choice Component 2");    
	        c.add("Choice Component 3");    
	        c.add("Choice Component 4");    
	        c.add("Choice Component 5"); 
        	f1.add(c);
        	List li1 = new List(5);   
	        li1.add("List Component 1");    
	        li1.add("List Component 2");    
	        li1.add("List Component 3");    
	        li1.add("List Component 4");    
	        li1.add("List Component 5"); 
	        f1.add(li1);
	        Scrollbar s = new Scrollbar();     
	       	f1.add(s);
	     	CheckboxGroup cbg = new CheckboxGroup();  
	        Checkbox checkBox1s = new Checkbox("C++", cbg, false);        
	        Checkbox checkBox2s = new Checkbox("Java", cbg, true);    
	        f1.add(checkBox1s); 
	        f1.add(checkBox2s);   
			f1.setVisible(true);
		    f1.setSize(800,800);
		    f1.setLayout(new FlowLayout());
		}
	}
