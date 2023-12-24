package com.cgassign.components;

import com.cgassign.functions.Curve;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Firework {
    private Curve curve = new Curve();
    private Random random = new Random();

    public void draw(Graphics2D g2d, int width, int height, int numFireworks, int numLinesPerFirework) {
        for (int i = 0; i < numFireworks; i++) {
            int startX = random.nextInt(width - 100) + 50;
            int startY = random.nextInt(height - 100) + 50;

            for (int j = 0; j < numLinesPerFirework; j++) {
                int endX = random.nextInt(width);
                int endY = random.nextInt(height);

                // Generate a random color
                Color randomColor =
                        new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

                // Vary the length to make it smaller
                double length = random.nextDouble() * 100 / 2; // Adjust the maximum length here

                int endXAdjusted =
                        (int) (startX + length * Math.cos(Math.atan2(endY - startY, endX - startX)));
                int endYAdjusted =
                        (int) (startY + length * Math.sin(Math.atan2(endY - startY, endX - startX)));

                g2d.setColor(randomColor); // Set the color for the line
                curve.drawBezierCurve(g2d, startX, startY, startX + 5, startY + 5, endXAdjusted,
                        endYAdjusted, endXAdjusted, endYAdjusted);
            }
        }
    }
}
