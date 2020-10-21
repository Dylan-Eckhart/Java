package Hoofdstuk12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht6 extends Applet {

    //Declaratie
    int getallen[] = {5, 1, 8, 4, 1, 5, 2, 8, 3, 7, 5, 4, 1, 6, 9, 7, 1, 1, 10, 2, 5, 10, 10, 1, 5, 10, 3, 5, 2, 5, 2};
    Label tekst = new Label("Voer een getal in tussen 1-10");
    TextField tekstvak = new TextField("",20);
    Button enter = new Button("Enter");

    //Extra Variabelen
    int nummer = 0;
    int voorkomen = 0;

    public void init() {

        //Initalisatie
        enter.addActionListener(new EnterListener());
        add(tekst);
        add(tekstvak);
        add(enter);
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevulde getal komt "+ voorkomen +" keer voor in de array",50,75);
    }

    class EnterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            voorkomen = 0;
            nummer = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    voorkomen++;
                }
            }
            repaint();
        }
    }

}
