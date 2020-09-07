package HO4;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.yellow);
        g.fillArc(30,30,50,100,0,360);
    }
}
