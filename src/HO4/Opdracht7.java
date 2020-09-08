package HO4;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRect(20, 20, 200, 200);
        g.setColor(Color.BLACK);
        g.fillArc(40, 150, 60, 60, 0, 360);
        g.fillArc(140, 150, 60, 60, 0, 360);
        g.fillArc(40, 35, 60, 60, 0, 360);
        g.fillArc(140, 35, 60, 60, 0, 360);
    }

}