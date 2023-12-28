package functions;

import java.awt.Graphics;

public class Line {
    public void drawBresenhamLine(Graphics g, int x1, int y1, int x2, int y2, int thickness) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int p = 2 * dy - dx;
        int twoDy = 2 * dy;
        int twoDyMinusDx = 2 * (dy - dx);
        int x, y, xEnd;

        if (x1 > x2) {
            x = x2;
            y = y2;
            xEnd = x1;
        } else {
            x = x1;
            y = y1;
            xEnd = x2;
        }

        g.fillRect(x, y, thickness, thickness);

        while (x < xEnd) {
            x++;
            if (p < 0) {
                p += twoDy;
            } else {
                y++;
                p += twoDyMinusDx;
            }
            g.fillRect(x, y, thickness, thickness);
        }
    }
}
