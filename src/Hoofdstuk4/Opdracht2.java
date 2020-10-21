package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.drawLine(50, 120, 100, 70);
        g.drawLine(100, 70, 150, 120);
        g.drawLine(50, 120, 150, 120);
        g.drawRect(50, 120, 100, 100);
        g.drawRect(65,140,25,25);
        g.drawRect(115,180,30,40);

    }
}