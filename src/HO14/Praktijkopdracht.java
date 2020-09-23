package HO14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    //Declaratie
    Image smiley;
    URL path;
    Button play;
    Button reset;
    TextField tekstveld;

    int smileys = 23;
    boolean turn = true;
    boolean gameover = false;
    boolean lost = false;

    String tekst1 = "";
    String tekst2 = "Voer 1,2 of 3 in en druk op play!";

    public void init() {

        //Initalisatie
        setSize(500,500);

        tekst1 = tekst2;
        path = Praktijkopdracht.class.getResource("/H014/resources/");
        smiley = getImage(path, "smileys.png");

        //Knoppen
        play = new Button("Play");
        reset = new Button("Reset");
        tekstveld = new TextField("",10);
        play.addActionListener(new playListener());
        reset.addActionListener(new resetListener());
        add(tekstveld);
        add(play);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString(tekst1,70,50);
        for (int i = 0; i < smileys; i++) {
            g.drawImage(smiley, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 50, 50, this);
        }
    }

    int botPlays(int userplay, int smileys) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int)random;

        if(smileys == 23) {
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }


        }else if(smileys == 21 || smileys == 17 || smileys == 13 || smileys == 9|| smileys == 5) {
            switch(userplay) {
                case 1:
                    botplays = 3;
                    break;
                case 2:
                    botplays = 2;
                    break;
                case 3:
                    botplays = 1;
                    break;
            }
        }else if(smileys == 20 || smileys == 16 || smileys == 12 || smileys == 8|| smileys == 4){
            switch(userplay) {
                case 1:
                    botplays = 2;
                    break;
                case 2:
                    botplays = 1;
                    break;
                case 3:
                    botplays = r;
                    break;
            }
        }else if(smileys == 19 || smileys == 15 || smileys == 11 || smileys == 7|| smileys == 3){
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }
        }else if(smileys == 18 || smileys == 14 || smileys == 10 || smileys == 6|| smileys == 2){
            switch(userplay) {
                case 1:
                    botplays = r;
                    break;
                case 2:
                    botplays = 3;
                    break;
                case 3:
                    botplays = 2;
                    break;
            }
        }else {
            botplays =r;
        }

        return botplays;
    }


    class playListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if(Integer.parseInt(tekstveld.getText()) == 1 || Integer.parseInt(tekstveld.getText()) == 2 || Integer.parseInt(tekstveld.getText()) ==3) {
                userplay = Integer.parseInt(tekstveld.getText());
                bot = botPlays(userplay,smileys;

                turn = true;
                smileys-=userplay;
                if(smileys <= 0 && gameover == false) {
                    if(true == true) {
                        lost = true;
                        gameover = true;
                    }
                }



                turn = false;
                smileys-=bot;
                if(smileys <= 0 && gameover == false) {
                    lost = false;
                    gameover = true;
                }

                tekst1 = "Bot koos " + bot + " Smileys te verwijderen.";

            }else {
                tekst1 = "Error: Voer een getal tussen 1-3 in!";
                repaint();
            }



            if(gameover==true) {
                if(lost == true) {
                    tekst1 = "Winner!";
                }else {
                    tekst1 = "Loser!";
                }
            }


            tekstveld.setText("");
            repaint();
        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstveld.setText("");
            tekst1 = tekst2;
            smileys = 23;
            lost = false;
            gameover = false;
            turn = true;
            repaint();
        }
    }
}
