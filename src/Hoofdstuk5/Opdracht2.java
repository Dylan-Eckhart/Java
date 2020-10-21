package Hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    //Declaratie.
    Color opvulkleur1;
    Color opvulkleur2;
    Color opvulkleur3;
    Color lijnkleur;
    Color achtergrond;
    int breedte;
    int hoogte1;
    int hoogte2;
    int hoogte3;


    public void init() {
        //Initialisatie.
        opvulkleur1 = Color.PINK;
        opvulkleur2 = Color.BLUE;
        opvulkleur3 = Color.GREEN;
        lijnkleur = Color.BLACK;
        achtergrond = Color.WHITE;
        breedte = 50;
        hoogte1 = 40;
        hoogte2 = 100;
        hoogte3 = 80;

    }

    public void paint(Graphics g) {
        setBackground(achtergrond);

        //Grafiek
        g.drawLine(50,250,50,150);
        g.drawLine(50,250,220,250);

        //Legenda
        g.drawString("KG",35,145);
        g.drawString("100-",22,155);
        g.drawString("80-",30,175);
        g.drawString("60-",30,195);
        g.drawString("40-",30,215);
        g.drawString("20-",30,235);
        g.drawString("0-",36,255);
        g.drawString("Valerie",55,260);
        g.drawString("Jeroen",107,260);
        g.drawString("Hans",153,260);

        //Staven
        g.setColor(opvulkleur1);
        g.fillRect(55,210,breedte,hoogte1);
        g.setColor(opvulkleur2);
        g.fillRect(100,150,breedte,hoogte2);
        g.setColor(opvulkleur3);
        g.fillRect(150,170,breedte,hoogte3);

    }
}
