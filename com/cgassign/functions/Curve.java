package com.cgassign.functions;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Curve {
    public void drawBezierCurve(Graphics g, int x1, int y1, int cx1, int cy1, int cx2, int cy2,
            int x2, int y2) {
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother shapes
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = 0; i < 1000; i++) {
            double t = i / 1000.0;
            double x = Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * cx1
                    + 3 * (1 - t) * t * t * cx2 + Math.pow(t, 3) * x2;
            double y = Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * cy1
                    + 3 * (1 - t) * t * t * cy2 + Math.pow(t, 3) * y2;

            g2d.drawLine((int) x, (int) y, (int) x, (int) y);
        }
    }
}
