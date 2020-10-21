package Hoofdstuk12;

import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet {

    //Declaratie
    Button Buttons[] = new Button[25];

    public void init() {

        //Initalisatie
        for (int i = 0; i != 25; i++) {
            Buttons[i] = new Button("Knop " + String.valueOf(i + 1));
            add(Buttons[i]);
        }
    }
}
