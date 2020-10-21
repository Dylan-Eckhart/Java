package Hoofdstuk12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {

    //Declaratie
    int getallen[] = {10, 25, 70, 105, 130, 150, 195, 199, 225, 230, 244,};
    Label tekst = new Label("Voer een getal in tussen 1-250, gebruik hierbij geen decimalen");
    TextField input = new TextField("",20);
    Button enter = new Button("Enter");

    //Controle!
    int nummer;
    int index;
    boolean controle = false;

    public void init() {

        //Initalisatie
        enter.addActionListener(new EnterListener());
        add(tekst);
        add(input);
        add(enter);
    }

    public void paint(Graphics g) {
        if (controle) {
            g.drawString("Het getal is op de: " + index + " plaats", 50, 75);
        } else {
            g.drawString("Het getal is niet gevonden",50,75);
        }
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(input.getText());

            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    index = i;
                    controle = true;
                }
            }
            repaint();
        }
    }
}
