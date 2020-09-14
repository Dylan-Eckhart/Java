package HO10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    //Declaratie
    Label Label;
    TextField Tekstvak;
    double Gemiddelde;
    int AantalCijfers;
    boolean Voldoende;
    Button Submit;

    public void init() {
        Label = new Label("Voer een cijfer in");
        Tekstvak =  new TextField("",5);
        Submit = new Button("Submit");
        Submit.addActionListener(new knoplistenerSubmit());

        AantalCijfers = 0;
        Gemiddelde = 0.0;
        add(Tekstvak);
        add(Submit);
    }

    public void paint(Graphics g) {
        g.drawString("Je gemiddelde cijfer: " + Gemiddelde,50,50);
        g.drawString("Is het cijfer voldoende? " + Voldoende,50,70);
        g.drawString("Aantal cijfers: " + AantalCijfers,50,90);
    }

    private class knoplistenerSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double Cijfer =  Double.parseDouble(Tekstvak.getText());
            Voldoende = Cijfer >= 5.5;
            Gemiddelde = ((Gemiddelde * AantalCijfers) + Cijfer) / (AantalCijfers + 1);
            Gemiddelde =  Gemiddelde * 10;
            int Gemiddelde_ = (int) Gemiddelde;
            Gemiddelde =  Gemiddelde_;
            Gemiddelde = Gemiddelde / 10;
            AantalCijfers++;
            repaint();

        }
    }
}
