import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TestGui {

public static Content content;

public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Test GUI");
    frame.setSize(1000,800);
    frame.getContentPane().setLayout(null);

    JButton cv_button = new JButton("Happy");
    cv_button.setBounds(10, 159, 70, 23);
    frame.getContentPane().add(cv_button);
    cv_button.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {
            Content.isToDraw = true;
            content.paintImmediately(content.getBounds());
            Content.isToDraw = false;

        }
    });

    
    JButton cv_buttonClear = new JButton("Clear");
    cv_buttonClear.setBounds(10, 179, 70, 23);
    frame.getContentPane().add(cv_buttonClear);
    cv_buttonClear.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {
            content.paintImmediately(content.getBounds());
        }
     });

    JButton cv_buttonSad = new JButton("Sad");
    cv_buttonSad.setBounds(10, 199, 70, 23);
    frame.getContentPane().add(cv_buttonSad);
    cv_buttonSad.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {
            Content.isToDrawSad = true;
            content.paintImmediately(content.getBounds());
            Content.isToDrawSad = false;

        }
     });

    content = new Content();
     content.setBorder(new LineBorder(new Color(0, 0, 0)));
    content.setBounds(87, 11, 450, 500);
    frame.getContentPane().add(content);
    frame.setVisible(true);
}
}

 class Content extends JPanel {

public static Boolean isToDraw = false;
public static Boolean isToDrawSad = false;

public void paintComponent(Graphics arg0) {
    if (isToDraw) {
        super.paintComponent(arg0);
        arg0.setColor(Color.yellow);
        arg0.drawArc(100,100,250,250,0,360);
        arg0.fillArc(100,100,250,250,0,360);
        arg0.setColor(Color.black);
        arg0.drawArc(170,185,25,25,0,360);
        arg0.fillArc(170,185,25,25,0,360);
        arg0.drawArc(255,185,25,25,0,360);
        arg0.fillArc(255,185,25,25,0,360);
        arg0.drawArc(150,215,150,100,0,-180);

    }else if(isToDrawSad){
        super.paintComponent(arg0);
        arg0.setColor(Color.yellow);
        arg0.drawArc(100,100,250,250,0,360);
        arg0.fillArc(100,100,250,250,0,360);
        arg0.setColor(Color.black);
        arg0.drawArc(170,185,25,25,0,360);
        arg0.fillArc(170,185,25,25,0,360);
        arg0.drawArc(255,185,25,25,0,360);
        arg0.fillArc(255,185,25,25,0,360);
        arg0.drawArc(150,250,150,100,0,180);
    } else {
        super.paintComponent(arg0);
    }
}
}