package HO6;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    //Declaratie
    Color Achtergrond;
    Color Tekst;
    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double Uitkomst;
    int GemiddeldeUitkomst;
    double DefinitiveUitkomst;

    public void init() {

        //Initalisatie
        Achtergrond = Color.WHITE;
        Tekst = Color.black;
        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;
        Uitkomst = (Cijfer1 + Cijfer2 + Cijfer3) / 3;
        GemiddeldeUitkomst = (int) (Uitkomst * 10);
        DefinitiveUitkomst = GemiddeldeUitkomst / 10;

    }

    public void paint(Graphics g) {
        setBackground(Achtergrond);
        g.setColor(Tekst);
        g.drawString("Het gemiddelde van de cijfers is: " + DefinitiveUitkomst,20,20);
    }

}
