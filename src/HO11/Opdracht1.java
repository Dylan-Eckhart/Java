package HO11;

import java.applet.*;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        //loop die 10 lijnen elk op andere hoogte zet
        for(int i=1; i<=10; i++) {
            //hoogte word bepaald door de i
            g.drawLine(10, i*10,210,i*10);
        }
    }
}
