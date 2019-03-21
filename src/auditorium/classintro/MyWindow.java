package auditorium.classintro;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(50,100,150,100);
        g.drawRect(50,120,50,70);
        g.drawOval(50,250,50,50);
        g.setColor(new Color(255,0,0));
        g.fillOval(100,120,30,30);


    }
}
