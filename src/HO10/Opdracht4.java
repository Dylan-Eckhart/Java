package HO10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    //Decleratie
    Label Label;
    TextField TekstMaand;
    TextField TekstJaar;
    String StringMaand;
    String StringDagen;
    String StringJaar;
    String Uitkomst;
    double DoubleMaand;
    double DoubleJaar;

    public void init() {

        //Initialisatie
        setSize(500, 200);
        Uitkomst = "";
        StringMaand = "Geen geldig getal";
        Label = new Label("Voer het nummer van de maand in en druk op enter!");
        TekstMaand = new TextField("",10);
        TekstJaar = new TextField("",10);
        TekstJaar.addActionListener(new textlistenertmaand());
        TekstMaand.addActionListener(new textlistenertmaand());

        add(Label);
        add(TekstMaand);
        add(TekstJaar);
    }

    public void paint(Graphics g) {
        g.drawString(Uitkomst,20,50);
    }

    private class textlistenertmaand implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringMaand = TekstMaand.getText();
            DoubleMaand = Double.parseDouble(StringMaand);
            if (DoubleMaand == 1) {
                StringMaand = "Januari";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen:  " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if ( (DoubleJaar % 4 == 0 && !(DoubleJaar % 100 == 0)) || DoubleJaar % 400 == 0 && DoubleMaand == 2) {
                StringMaand = "Februari";
                StringDagen = "28 of 29";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 3) {
                StringMaand = "Maart";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 4) {
                StringMaand = "April";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 5) {
                StringMaand = "Mei";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 6) {
                StringMaand = "Juni";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 7) {
                StringMaand = "Juli";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 8) {
                StringMaand = "Augustus";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 9) {
                StringMaand = "September";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 10) {
                StringMaand = "Oktober";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 11) {
                StringMaand = "November";
                StringDagen = "30";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand == 12) {
                StringMaand = "December";
                StringDagen = "31";
                Uitkomst = "Maand + aantal Dagen: " + StringMaand + " en " + StringDagen + " dagen.";
            }
            if (DoubleMaand >= 13){
                Uitkomst = "Geen geldige maand";
            }
            repaint();
        }
    }
}
