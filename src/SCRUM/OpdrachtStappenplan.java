package SCRUM;

import apple.laf.JRSUIConstants;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtStappenplan extends Applet {

    //Declaratie
    int getal;
    int kwadraat;

    public void init() {

        //Initalisatie
        getal = 13;
         if (getal >= 0 && getal == (int)getal) {
             for (int x = 1; x < getal; x++) {
                 if (x % 2 == 0) {
                     if (x % 6 == 0) {
                         kwadraat = x * x;

                     }
                     System.out.println(x);
                 }

             }
         }

    }


}
