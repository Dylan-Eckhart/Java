package Hoofdstuk12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    //Declaratie
    String namen[] = new String[10];
    int telefoonnummers[] = new int[10];

    Label tekst = new Label("Voer uw naam en telefoonnummer in");
    Button submit = new Button("Submit");

    //Naam
    Label naam = new Label("Naam: ");
    TextField tekstveldnaam = new TextField("",20);

    //Telefoonnummer
    Label telefoonnummer = new Label("Telefoonnummer: ");
    TextField tekstveldtelefoon = new TextField("",20);

    //Variabelen
    int toon = 0;
    int toonscherm = 10;

    public void init() {

        //Initalisatie
        setSize(800,400);

        submit.addActionListener(new SubmitListener());
        add(tekst);
        add(naam);
        add(tekstveldnaam);
        add(telefoonnummer);
        add(tekstveldtelefoon);
        add(submit);
    }

    public void paint(Graphics g) {
        if (toon == 10) {
            for (int i = 0; i <10; i++) {
                String nummer = String.valueOf(i + 1) + "";
                g.drawString(" naam: " + namen[i] +" telefoonnummer: " + telefoonnummers[i],100,70 + (i + 1) * 15);
            }
        } else {
            g.drawString("nog " + toonscherm + " telefoonnummers en namen te gaan",100,70);
        }
    }

    private class SubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            namen[toon] = tekstveldnaam.getText();
            telefoonnummers[toon] = Integer.parseInt(tekstveldtelefoon.getText());
            toon++;
            toonscherm--;
            repaint();

            //Reset
            tekstveldnaam.setText("");
            tekstveldtelefoon.setText("");
        }
    }
}
