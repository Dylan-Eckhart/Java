package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.BLACK);
        g.fillRect(25, 25, 5, 225);
        g.setColor(Color.red);
        g.fillRect(30,25,230,41);
        g.setColor(Color.WHITE);
        g.fillRect(30,61,230,41);
        g.setColor(Color.BLUE);
        g.fillRect(30,102,230,41);
    }
}