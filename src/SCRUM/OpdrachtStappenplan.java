package SCRUM;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtStappenplan extends Applet {

    //Declaratie
    int limietVanInvoerGebruiker;
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
        limietVanInvoerGebruiker = 0;
        enter = new Button("Enter");
        tekstvak = new TextField("",10);
        add(tekstvak);
        add(enter);
        submit submit = new submit();
        enter.addActionListener(submit);
        tekstvak.addActionListener(submit);
        som = 0;
        sommie = "de som = ";
    }

    public void paint(Graphics g) {
        y = 50;
        if (limietVanInvoerGebruiker >= 0 && limietVanInvoerGebruiker == (int) limietVanInvoerGebruiker) {
            for (int x = 1; x <= limietVanInvoerGebruiker; x++) {
                if (x % 2 == 0) {
                    if (x % 6 == 0) {
                        kwadraat = x * x;
                        g.drawString("" + kwadraat, 20, y);
                        som = som + kwadraat;
                    } else {
                        System.out.println(x);
                        uitkomst = "" + x;
                        g.drawString("" + x, 20,y);
                        som = som + x;
                    }
                    y += 15;
                }
            }
            if (som != 0) {
                g.drawString("" + sommie + som,20,y);
                som = 0;
            } else if (error == true){
                g.drawString("" + sommie,20,y);
            }
        }
    }

    private class submit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input;
            input = tekstvak.getText();
            try {
                limietVanInvoerGebruiker = Integer.parseInt(input);
            } catch (Exception s) {
                limietVanInvoerGebruiker = 0;
                error = true;
                sommie = "ERROR! u moet een getal invullen niet een woord of een letter.";
            }
            repaint();
        }
    }
}

