package SCRUM;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtStappenplan extends Applet {

    //Declaratie
    int limietVanInvoer;
    int kwadraat;
    int som;
    int y;
    boolean error = false;

    String uitkomst;
    String sommie;
    TextField tekstvak;
    Button enter;

    public void init() {

        //Initalisatie
        limietVanInvoer = 0;
        som = 0;
        enter = new Button("Enter");
        tekstvak = new TextField("",10);
        submit submit = new submit();
        tekstvak.addActionListener(submit);
        enter.addActionListener(submit);
        add(tekstvak);
        add(enter);
        sommie = "Het totaal: ";
    }

    @Override
    public void paint(Graphics g) {
        y = 20;
        if (limietVanInvoer >= 0 && limietVanInvoer == (int) limietVanInvoer) {
            for (int x = 1; x < limietVanInvoer; x++) {
                if (x % 2 == 0) {
                    if (x % 6 == 0) {
                        kwadraat = x * x;
                        g.drawString("" + kwadraat,20,y);
                        som = som + kwadraat;
                    } else {
                        uitkomst = "" + x;
                        g.drawString("" + sommie + x,20,y);
                        som = som + x;
                    }
                    y += 15;
                }

            }
            if (som != 0) {
                g.drawString("" + sommie, 20, y);
                som = 0;
            } else if (error == true) {
        }

    }

    private class submit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input;
            input = tekstvak.getText();
            try {
                limietVanInvoer = Integer.parseInt(input);
            } catch (Exception a) {
            }
                sommie = "Error! Graag een getal invoeren.";
            }
            repaint();

        }
    }
}
