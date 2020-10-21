package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawLine(50,250,50,150);
        g.drawLine(50,250,220,250);
        g.drawString("KG",35,145);
        g.drawString("100-",22,155);
        g.drawString("80-",30,175);
        g.drawString("60-",30,195);
        g.drawString("40-",30,215);
        g.drawString("20-",30,235);
        g.drawString("0-",36,255);
        g.drawString("Valerie",55,260);
        g.drawString("Jeroen",107,260);
        g.drawString("Hans",153,260);
        g.fillRect(55,210,40,40);
        g.setColor(Color.PINK);
        g.fillRect(100,155,40,95);
        g.setColor(Color.ORANGE);
        g.fillRect(145,170,40,80);
    }
}
