package Hoofdstuk10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    //Declaratie
    TextField Tekstvak;
    double Tekst;
    double Getal;
    Label Label;
    String S;

    public void init() {

        //Initalisatie
        Getal = 7;
        Tekstvak = new TextField("",10);
        Tekstvak.addActionListener(new Tekstvaklistener());
        Label = new Label("Voer een getal in en druk op enter!");

        add(Label);
        add(Tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Het getal dat u heeft ingevoerd is: " + Getal,20,50);
    }

    private class Tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            Tekst = Double.parseDouble(S);
            if (Tekst > Getal) {
                Getal = Tekst;
            }
            repaint();
        }
    }

}
