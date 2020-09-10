package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {

    //Declaratie Variabelen
    int M;
    int V;
    int PM;
    int PV;
    int Totaal;

    //Declaratie Knoppen
    TextField Tekstvak;
    Button BM;
    Button BV;
    Button BPM;
    Button BPV;

    public void init() {
        setSize(800,200);

        //Initalisatie Variabelen
        M = 0;
        V = 0;
        PM = 0;
        PV = 0;
        Totaal = M + V + PM + PV;
        Tekstvak = new TextField("",5);

        //Knoppen
        BM = new Button("Mannelijke Studenten");
        BV = new Button("Vrouwelijke Studenten");
        BPM = new Button("Potentiele Mannelijke Studenten");
        BPV = new Button("Potentiele Vrouwlijke Studenten");


        //Functies Knoppen
        BM.addActionListener(new bmL());
        BV.addActionListener(new bvL());
        BPM.addActionListener(new bpotmL());
        BPV.addActionListener(new bpotvL());

        //Knoppen
        add(BM);
        add(BV);
        add(BPM);
        add(BPV);
        add(Tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Mannelijke Studenten: " + M,50,60);
        g.drawString("Vrouwlijke Studenten: " + V,50,80);
        g.drawString("Potentiele Mannelijke Studenten: " + PM,50,100);
        g.drawString("Potentiele Vrouwelijke Studenten: " + PV,50,120);
        g.drawString("Totaal: " + Totaal,50,140);

    }

    class bmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            M ++;
            repaint();
        }
    }

    class bvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            V ++;
            repaint();
        }
    }

    class bpotmL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PM ++;
            repaint();
        }
    }

    class bpotvL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PV ++;
            repaint();
        }
    }

}
