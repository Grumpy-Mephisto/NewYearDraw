package components;

import functions.Line;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Snow {
    private int SnowballsBlurLevel;
    private int SnowballsRadius;
    private int SnowballsAmount;

    private Random random = new Random();
    private Line line = new Line();

    private String[] SnowballsColors = {"#e4e5e5", "#d1ddf3"};

    public void draw(Graphics2D g2d, int width, int height) {
        SnowballsBlurLevel = 5;
        SnowballsRadius = 3;
        SnowballsAmount = 100;

        for (int i = 0; i < SnowballsAmount; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);

            // Check if position is not at the edge
            if (x == 0 || y == 0) {
                SnowballsAmount++;
                continue;
            }

            Color snowflakeColor = Color.decode(SnowballsColors[random.nextInt(2)]);
            g2d.setColor(snowflakeColor);

            // Blur effect
            for (int blurLevel = 0; blurLevel < SnowballsBlurLevel; blurLevel++) {
                float transparency = 0.1f + blurLevel * 0.1f;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency));
                g2d.fillOval(x - blurLevel, y - blurLevel, SnowballsRadius + blurLevel * 2,
                        SnowballsRadius + blurLevel * 2);
            }

            // Glowing effect
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));

            // Draw the snowflake
            g2d.setColor(snowflakeColor);
            line.drawBresenhamLine(g2d, x, y, x, y, 1);
            line.drawBresenhamLine(g2d, x, y, x, y, 1);
        }
    }
}
