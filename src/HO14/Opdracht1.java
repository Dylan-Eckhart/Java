package HO14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {

    //Declaratie
    double rand1;
    double rand2;

    String kleur[] = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String betekenis[] = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    String gekozen = "";
    Button kieskaart;

    public void init() {

        //Initalisatie
        kieskaart = new Button("Druk op de knop om een kaart te kiezen");
        kieskaart.addActionListener(new KiesListener());
        add(kieskaart);
    }

    public void paint(Graphics g) {
        g.drawString(gekozen,50,50);
    }


    private class KiesListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rand1 = Math.random() * 12;
            int r1 = (int) rand1;
            rand2 = Math.random() * 3;
            int r2 = (int) rand2;

            gekozen = kleur[r2]+ "" + betekenis[r1];

            repaint();
        }
    }
}
