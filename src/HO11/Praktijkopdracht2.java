package HO11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Praktijkopdracht2 extends Applet {

    //Declaratie
    int A;
    long Tafel;
    Button Submit;
    int I;

    public void init() {

        //Initalisatie

        A = 0;
        Tafel = 0;
        Submit = new Button("Submit");

        Submit.addActionListener(new SubmitListener());
        add(Submit);
    }

    public void paint(Graphics g) {
        for (I = 1; I<=10; I++) {
            Tafel = A * I;
            g.drawString("" + Tafel,100, I * 20 + 30);

            //Berekeningen Tafels
            g.drawString("1 x " + A + "=",50,50);
            g.drawString("2 x " + A + "=",50,70);
            g.drawString("3 x " + A + "=",50,90);
            g.drawString("4 x " + A + "=",50,110);
            g.drawString("5 x " + A + "=",50,130);
            g.drawString("6 x " + A + "=",50,150);
            g.drawString("7 x " + A + "=",50,170);
            g.drawString("8 x " + A + "=",50,190);
            g.drawString("9 x " + A + "=",50,210);
            g.drawString("10 x " + A + "=",45,230);
        }
    }

    class SubmitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            I = Integer.parseInt(String.valueOf(A++));
            repaint();
        }
    }
}

