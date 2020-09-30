package SCRUM;

import apple.laf.JRSUIConstants;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtStappenplan extends Applet {

    //Declaratie
    int getal;

    public void init() {

        //Initalisatie
        getal = 13;
         if (getal >= 0 && getal == (int)getal) {
             for (int i = 1; i < getal; i++) {
                 if (i % 2 == 0) {
                     System.out.println(i);
                 }

             }
         }

    }


}
