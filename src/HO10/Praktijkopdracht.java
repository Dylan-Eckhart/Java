package HO10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    //Declaratie
    TextField Tekstveld;
    Button Submit;

    int Getal;
    int Kleur;

    String Oordeel = "";

    public void init() {

        //Initalisatie
        Getal = 0;
        Kleur = 0;

        Tekstveld = new TextField("", 20);
        Submit = new Button("Submit");

        Submit.addActionListener(new calc());

        add(Tekstveld);
        add(Submit);
    }

    public void paint(Graphics g) {
        switch (Kleur) {
            case 0:
                g.setColor(new Color(255, 0, 0));
                break;
            case 1:
                g.setColor(new Color(255, 150, 0));
                break;
            case 2:
                g.setColor(new Color(255, 255, 0));
                break;
            case 3:
                g.setColor(new Color(150, 255, 0));
                break;
            case 4:
                g.setColor(new Color(0, 255, 0));
                break;
            default:
                g.setColor(new Color(255, 0, 0));
                break;
        }
        g.fillRect(0,0,400,300);
        g.setColor(Color.black);
        g.drawString("Jouw cijfer is: " + Oordeel, 50, 50);
    }


    class calc implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Getal = Integer.parseInt(Tekstveld.getText());
            switch (Getal) {
                case 1:
                case 2:
                case 3:
                    Oordeel = "Slecht";
                    Kleur = 0;
                    break;
                case 4:
                    Oordeel = "Onvoldoende";
                    Kleur = 1;
                    break;
                case 5:
                    Oordeel = "Matig";
                    Kleur = 2;
                    break;
                case 6:
                case 7:
                    Oordeel = "Voldoende";
                    Kleur = 3;
                    break;
                case 8:
                case 9:
                case 10:
                    Oordeel = "Goed";
                    Kleur = 4;
                    break;
                default:
                    Oordeel = "Error";
                    Kleur = 0;
                    break;
            }
            repaint();
        }
    }
}


