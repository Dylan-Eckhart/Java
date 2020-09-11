package HO8;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    //Declaratie
    TextField Tekstveld1;
    TextField Tekstveld2;
    Button Plus;
    Button Min;
    Button Keer;
    Button Delen;
    Double T1;
    Double T2;
    Double Uitkomst;
    String SUitkomst;

    public void init() {

        //Initalisatie
        T1 = 0.0;
        T2 = 0.0;
        Uitkomst = 0.0;
        SUitkomst = "";

        Tekstveld1 = new TextField("",30);
        Tekstveld2 = new TextField("",30);
        Plus = new Button("+");
        Min = new Button("-");
        Keer = new Button("*");
        Delen = new Button("/");

        Plus.addActionListener(new PlusAction());
        Min.addActionListener(new MinAction());
        Keer.addActionListener(new KeerAction());
        Delen.addActionListener(new DelenAction());

        add(Tekstveld1);
        add(Tekstveld2);
        add(Plus);
        add(Min);
        add(Keer);
        add(Delen);

    }

    Pubic void paint(Graphics g) {

    }

    class PlusAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            T1 = Double.parseDouble(Tekstveld1.getText());
            T2 = Double.parseDouble(Tekstveld2.getText());
            Uitkomst = T1 + T2;
            SUitkomst = String.valueOf(Uitkomst);
            Tekstveld1.setText(SUitkomst);
            Tekstveld2.setText("");
            SUitkomst = String.valueOf(Uitkomst);


        }
    }
}
