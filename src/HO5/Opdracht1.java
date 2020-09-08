package HO5;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    //Declaratie.
    Color opvulkleur;
    Color lijnkleur;
    Color achtergrond;
    int breedte;
    int hoogte;
    int breedte2;


    public void init() {
        //Initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        achtergrond = Color.WHITE;
        breedte = 200;
        breedte2 = 100;
        hoogte = 100;

    }

    public void paint(Graphics g) {
        //Rechthoek
        g.drawRect(100, 100, breedte, hoogte);

        //Afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        //Gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);

        //Ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        //Lijn
        g.setColor(lijnkleur);
        g.drawLine(100,80,300,80);

        //Taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawArc(100,360,breedte,hoogte,0,360);
        g.setColor(opvulkleur);
        g.fillArc(100,360,breedte,hoogte,0,45);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawArc(370,360,breedte2,hoogte,0,360);

        //Namen
        g.drawString("Lijn",100,75);
        g.drawString("Rechthoek",100,95);
        g.drawString("Afgeronde rechhoek",100,220);
        g.drawString("Gevulde rechthoek met ovaal",315,95);
        g.drawString("Gevulde ovaal",315,220);
        g.drawString("Taartpunt met ovaal eromheen",100,355);
        g.drawString("Cirkel",370,355);
    }
}
