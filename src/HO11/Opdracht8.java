package HO11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void paint(Graphics g) {
        int X = 50;
        int Y = 50;
        int H = 100;
        int W = 100;
        int Arcangle = 360;
        int Arcstart = 0;
        int Aantal = 0;

        while (Aantal < 100) {
            Aantal++;
            H += 1;
            W += 1;
            g.drawArc(X,Y,W,H,Arcstart,Arcangle);
        }
    }
}
