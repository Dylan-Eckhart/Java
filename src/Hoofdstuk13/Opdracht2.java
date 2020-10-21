package Hoofdstuk13;

import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setSize(1200, 700);
    }

    public void paint(Graphics g) {
        drawWall(g, 20, 20, 1100, 600);
    }

    void drawWall(Graphics g, int x, int y, int w, int h) {

        //Achtergrond
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, w, h);

        //Stenen
        g.setColor(new Color(150, 50, 50));

        //Aantal rijen
        for (int a = 0; a <= ((h - 3) / 18) - 1; a++) {
            if (a % 2 == 0) {
                for (int i = 0; i <= ((w - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((w - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);
                    g.fillRect(x + (((w - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);
                }
            }
        }
    }
}
