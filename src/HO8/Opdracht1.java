package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {

    //Declaratie
    Button OkayKnop;
    Button ResetKnop;
    Label Label;
    TextField Tekstvak;
    String S;

    public void init() {

        //Initalisatie
        Tekstvak = new TextField("Klik hier");
        OkayKnop = new Button("Klik Hier");
        Label = new Label("Type hier iets!");
        ResetKnop = new Button("Reset");
        OkayKnop.addActionListener(new KnoplistenerOkay() );
        ResetKnop.addActionListener(new KnoplistenerReset() );
        add(Label);
        add(Tekstvak);
        add(OkayKnop);
        add(ResetKnop);
        S = "";
    }

    public void paint(Graphics g) {
        g.drawString("Type een tekst!" + "In het tekstvak" + "En klik op okay",50,60);
        g.drawString(S,60,80);
    }

    class KnoplistenerOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            repaint();
        }

    }

    class KnoplistenerReset implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Tekstvak.getText();
            repaint();
        }
    }
}
