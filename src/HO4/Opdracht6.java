package HO4;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.gray);
        g.fillArc(200,175,40,30,0,150);
        g.fillRect(200,190,40,50);
        g.fillArc(200,225,40,30,100,100);
        g.setColor(Color.red);
        g.fillArc(210,180,20,20,0,360);
        g.setColor(Color.ORANGE);
        g.fillArc(210,180,20,20,0,360);
    }
}