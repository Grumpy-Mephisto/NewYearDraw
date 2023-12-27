package components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

public class Star {
    private String[] StarColors = {"#ffcda5", "#ffd250", "#ff8220", "#fff220", "#ff5000"};

    public void draw(Graphics2D g2d, int width, int height, int size) {
        int midX = width / 2;
        int midY = height / 2;
        int max = 16;
        int[] radius = {size * 118 / 500, size * 40 / 500, size * 90 / 500, size * 40 / 500};
        int nPoints = 16;
        int[] X = new int[nPoints];
        int[] Y = new int[nPoints];

        for (double current = 0.0; current < nPoints; current++) {
            int i = (int) current;
            double x = Math.cos(current * ((2 * Math.PI) / max)) * radius[i % 4];
            double y = Math.sin(current * ((2 * Math.PI) / max)) * radius[i % 4];

            X[i] = (int) x + midX;
            Y[i] = (int) y + midY;
        }

        Point2D center = new Point2D.Float(midX, midY);
        float radiusLength = size / 2.0f;
        float[] dist = {0.0f, 0.2f, 0.4f, 0.6f, 1.0f};
        Color[] colors = {Color.decode(StarColors[0]), Color.decode(StarColors[1]),
                Color.decode(StarColors[2]), Color.decode(StarColors[3]),
                Color.decode(StarColors[4])};

        RadialGradientPaint gradientPaint =
                new RadialGradientPaint(center, radiusLength, dist, colors);

        g2d.setPaint(gradientPaint);

        g2d.fillPolygon(X, Y, nPoints);
    }
}
