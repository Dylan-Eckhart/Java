package Hoofdstuk8;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {

    //Declaratie
    double Bedrag;
    TextField Tekstvak;
    Button Knop;
    Label Label;

    public void init() {

        //Initalisatie
        Bedrag = 0;
        Label = new Label("€");
        Knop = new Button("Geef prijs weer");
        Tekstvak = new TextField("",20);

        Knop.addActionListener(new BTW());

        add(Label);
        add(Tekstvak);
        add(Knop);
    }

    public void paint(Graphics g) {
        g.drawString("Bedrag met 21% BTW: " + Bedrag,50,60);
    }

    class BTW implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x = Tekstvak.getText();
            Bedrag = Double.parseDouble(x);
            Bedrag *= 1.21;
            repaint();

        }
    }
}
