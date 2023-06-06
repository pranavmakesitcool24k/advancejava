import java.applet.*;
import java.awt.*;

public class Test extends Applet
{
    public void paint(Graphics g){
        //oval for face outline
        g.drawOval(90,100,130,130);
        
        //ovals for eyes
        //with black color filled

        g.setColor(Color.BLACK);
        g.fillOval(120,120,15,15);
        g.fillOval(170,120,15,15);

        //arc for the smile
        g.drawArc(130,180,50,20,180,180);

    }
}

//<applet code="Test.java" width=400 height=400></applet>