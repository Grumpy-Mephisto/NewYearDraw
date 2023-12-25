package components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import functions.Curve;

public class Confetti {
    private Curve curve = new Curve();
    private Random random = new Random();

    public void draw(Graphics2D g2d, int width, int height, int amount) {
        for (int i = 0; i < amount; i++) {
            int startX = random.nextInt(width);
            int startY = random.nextInt(height);
            int endX = random.nextInt(width);
            int endY = random.nextInt(height);

            // Generate a random color
            Color randomColor =
                    new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            // Vary the length to make it smaller
            double length = random.nextDouble() * 10; // Adjust the maximum length here

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
