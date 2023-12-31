package functions;

import java.awt.Graphics;

public class Circle {
    public void drawCircle(Graphics g, int x, int y, int radius, boolean filled) {
        int diameter = radius * 2;
        g.drawOval(x - radius, y - radius, diameter, diameter);
        if (filled) {
            g.fillOval(x - radius, y - radius, diameter + 1, diameter + 1);
        }
    }
}
