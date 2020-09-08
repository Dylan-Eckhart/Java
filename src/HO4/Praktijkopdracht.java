package HO4;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        //Lijn
        g.drawLine(20,150,100,150);

        //Rechthoek
        g.drawRect(10,20,100,40);

        //Afgeronde rechthoek
        g.drawRoundRect(10,80,100,40,40,40);

        //Gevulde rechthoek met ovaal
        g.fillRect(120,30,100,40);
        g.setColor(Color.magenta);
        g.drawArc(120,30,100,40,0,360);

        //Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(120,80,100,40,0,360);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.drawArc(230,20,100,40,0,360);
        g.setColor(Color.magenta);
        g.fillArc(230,20,100,40,0,45);

        //Cirkel
        g.setColor(Color.black);
        g.drawArc(230,75,50,50,0,360);

        //Namen
        g.drawString("Lijn",25,145);
        g.drawString("Rechthoek",15,25);
        g.drawString("Afgeronde rechhoek",15,75);
        g.drawString("Gevulde rechthoek met ovaal",125,20);
        g.drawString("Gevulde ovaal",125,80);
        g.drawString("Taartpunt met ovaal eromheen",235,25);
        g.drawString("Cirkel",235,70);

    }
}
