package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {

    //Declaratie Knoppen
    TextField Tekstvak;
    Button BM;
    Button BV;
    Button BPM;
    Button BPV;

    //Declaratie Variabelen
    String SM;
    double DM;
    String SV;
    double DV;
    String SPM;
    double DPM;
    String SPV;
    double DPV;
    String STotaal;
    double DTotaal;

    public void init() {
        setSize(800,175);

        //Initalisatie Variabelen
        DM = 0;
        SM = Double.toString(DM);
        DV = 0;
        SV = Double.toString(DV);
        DPM = 0;
        SPM = Double.toString(DPM);
        DPV = 0;
        SPV = Double.toString(DPV);
        DTotaal = 0;
        STotaal = Double.toString(DTotaal);

        //Initalisatie Knoppen
        BM = new Button("Mannelijke Studenten");
        BV = new Button("Vrouwelijke Studenten");
        BPM = new Button("Potentiele Mannelijke Studenten");
        BPV = new Button("Potentiele Vrouwlijke Studenten");
        Tekstvak = new TextField("",5);

        //Initalisatie Functies Knoppen
        BM.addActionListener(new Man());
        BV.addActionListener(new Vrouw());
        BPM.addActionListener(new PMan());
        BPV.addActionListener(new PVrouw());

        //Initalisatie Add Knoppen
        add(BM);
        add(BV);
        add(BPM);
        add(BPV);
        add(Tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Mannelijke Studenten: ",50,60);
        g.drawString("Vrouwlijke Studenten: ",50,80);
        g.drawString("Potentiele Mannelijke Studenten: ",50,100);
        g.drawString("Potentiele Vrouwelijke Studenten: ",50,120);
        g.drawString("Totaal: ",50,140);
        g.drawString(SM,190,60);
        g.drawString(SV,190,80);
        g.drawString(SPM,257,100);
        g.drawString(SPV,263,120);
        g.drawString(STotaal,97,140);

    }

    class Man implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SM = Tekstvak.getText();
            DTotaal = Double.parseDouble(SM)+Double.parseDouble(SV)+Double.parseDouble(SPM)+Double.parseDouble(SPV);
            STotaal = Double.toString(DTotaal);
            repaint();
        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SV = Tekstvak.getText();
            DTotaal = Double.parseDouble(SM) + Double.parseDouble(SV) + Double.parseDouble(SPM) + Double.parseDouble(SPV);
            STotaal = Double.toString(DTotaal);
            repaint();
        }
    }

    class PMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SPM = Tekstvak.getText();
            DTotaal = Double.parseDouble(SM) + Double.parseDouble(SV) + Double.parseDouble(SPM) + Double.parseDouble(SPV);
            STotaal = Double.toString(DTotaal);
            repaint();
        }
    }

    class PVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SPV = Tekstvak.getText();
            DTotaal = Double.parseDouble(SM) + Double.parseDouble(SV) + Double.parseDouble(SPM) + Double.parseDouble(SPV);
            STotaal = Double.toString(DTotaal);
            repaint();
        }
    }

}
