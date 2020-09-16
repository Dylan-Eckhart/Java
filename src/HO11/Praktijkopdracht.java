package HO11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    //Declaratie
    int A;
    long Reset;
    Button Submit;
    TextField Tekstveld;

    public void init() {

        //Initalisatie

        A = 0;
        Reset = 0;
        Submit = new Button("Submit");
        Tekstveld = new TextField("",10);

        Submit.addActionListener(new SubmitListener());
        add(Tekstveld);
        add(Submit);
    }

    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            Reset = A * i;
            g.drawString("" + Reset,50, i * 20 + 30);

            //Berekeningen Tafels
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString();
            g.drawString("10 x " + Reset,50,200);
            g.drawString("10 x " + Reset,50,200);
        }
    }

    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            A = Integer.parseInt(Tekstveld.getText());
            repaint();
        }
    }
}
