package Hoofdstuk11;

import java.applet.*;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        for(int i=1; i<=10; i++) {
            g.drawLine(10, i*10,210,i*10);
        }
    }
}
