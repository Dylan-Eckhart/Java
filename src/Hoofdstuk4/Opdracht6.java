package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.gray);
        g.fillArc(200,175,40,30,0,180);
        g.fillRect(200,190,40,50);
        g.fillArc(200,225,40,30,180,180);
        g.setColor(Color.red);
        g.fillArc(210,180,20,20,0,360);
        g.setColor(Color.ORANGE);
        g.fillArc(210,205,20,20,0,360);
        g.setColor(Color.GREEN);
        g.fillArc(210,230,20,20,0,360);
    }
}