package HO13;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        drawTree(g, 50, 50, 80, 160, 5, 2);
    }

    void drawTree(Graphics g, int x, int y, int w, int h, int tr, int row) {
        for (int i = 0; i < row; i++) {
            for (int a = 0; a < tr; a++) {
                if (h < w * 1.6) {
                    h = w / 10 * 16;
                }
                g.setColor(new Color(110, 44, 31));
                g.fillRect(x + (w / 5 * 2) + a * (w + 10), y + (w / 10 * 9) + i * (h + 20), w / 5 * 1, h - (w / 10 * 9));
                g.setColor(new Color(50, 205, 76));
                g.fillOval(x + a * (w + 10), y + i * (h + 20), w, w);
            }
        }
    }
}

