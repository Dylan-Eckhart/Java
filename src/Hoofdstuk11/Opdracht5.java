package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void paint(Graphics g) {
        int Aantal = 0;
        int X = 10;
        int Y = 10;
        int W = 40;
        int H = 40;

        while (Aantal < 5) {
            Aantal++;
            X += 40;
            Y += 40;
            g.drawRect(X,Y,W,H);
        }
    }
}
