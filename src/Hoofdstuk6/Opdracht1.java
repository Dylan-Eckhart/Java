package Hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {

    //Declaratie
    double Jan;
    double Ali;
    double Jeannette;
    double Dylan;
    double personen;
    double bedrag;


    public void init() {

        //Initalisatie
        bedrag = 113;
        personen = 4;
        Jan = bedrag / personen;
        Ali = bedrag / personen;
        Jeannette = bedrag / personen;
        Dylan = bedrag / personen;


    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst voor Jan: " + Jan,20,20);
        g.drawString("Uitkomst voor Ali: " + Ali,20,40);
        g.drawString("Uitkomst voor Jeannette: " + Jeannette,20,60);
        g.drawString("Uitkomst voor Dylan: " + Dylan,20,80);
    }
}