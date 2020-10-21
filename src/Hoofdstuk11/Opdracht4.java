package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void paint(Graphics g) {
        int Getal = 0;
        int x = 10;
        int Tafel;

        while (Getal < 10) {
            x += 15;
            Getal++;
            Tafel = 3 * Getal;
            g.drawString("" + Tafel,x,10);
        }
    }
}
