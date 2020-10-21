package Hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    //Declaratie
    int uitkomst;
    int a;
    int b;

    public void init() {

        //Initialisatie
        a = 2147483647;
        b = 5;
        uitkomst = a + b;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.drawString("Uitkomst is: " + uitkomst,20,20);
    }
}
