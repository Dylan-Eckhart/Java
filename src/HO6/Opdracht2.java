package HO6;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    //Declaratie
    double UitkomstMinuut;
    double UitkomstUur;
    double UitkomstDag;
    double UitkomstJaar;
    int Minuut;
    int Uur;
    int Dag;
    int Jaar;

    public void init() {

        //Initalisatie
        Minuut = 60;
        Uur = 60 * Minuut;
        Dag = 24 * Uur;
        Jaar = 365 * Dag;
        UitkomstMinuut = Minuut;
        UitkomstUur = Uur;
        UitkomstDag = Dag;
        UitkomstJaar = Jaar;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.drawString("Aantal seconden per uur is: " +UitkomstUur,20,20);
        g.drawString("Aantal seconden per dag is: " + UitkomstDag,20,40);
        g.drawString("Aantal seconden per jaar is: " + UitkomstJaar,20,60);
    }
}
