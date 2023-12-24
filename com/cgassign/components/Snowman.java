package com.cgassign.components;

import com.cgassign.functions.Line;
import com.cgassign.functions.Circle;

import java.awt.*;

public class Snowman {
        private double totalHeight;
        private double bottomDiameter;
        private double middleDiameter;
        private double headDiameter;
        private double eyeDiameter;
        private double bottomCenterY;
        private double middleCenterY;
        private double headCenterY;
        private int centerX;

        private Line line = new Line();
        private Circle circle = new Circle();

        private String[] SnowmanColors = {"#ffffff", "#000000"};

        public void draw(Graphics2D g2d, int width, int height) {
                totalHeight = ((0.75) * height);
                bottomDiameter = (totalHeight) / 4;

                if (bottomDiameter > width) {
                        bottomDiameter = width;
                }

                g2d.setColor(Color.decode(SnowmanColors[0]));

                middleDiameter = ((bottomDiameter) * (2.0 / 3.0));
                headDiameter = (1.0 / 3.0) * (bottomDiameter);
                eyeDiameter = headDiameter * .1;

                centerX = width / 2;

                bottomCenterY = height - (bottomDiameter / 2.0) - (height * (1.0 / 8.0));
                middleCenterY = bottomCenterY - (bottomDiameter / 2.0) - (middleDiameter / 2.0);
                headCenterY = middleCenterY - (middleDiameter / 2.0) - (headDiameter / 2.0);

                // Bottom Oval
                circle.drawCircle(g2d, centerX, (int) bottomCenterY, (int) (bottomDiameter / 2),
                                true);

                // Middle Oval
                circle.drawCircle(g2d, centerX, (int) middleCenterY, (int) (middleDiameter / 2),
                                true);

                // Head Oval
                circle.drawCircle(g2d, centerX, (int) headCenterY, (int) (headDiameter / 2), true);

                g2d.setColor(Color.decode(SnowmanColors[1]));

                // Eyes Fill Oval
                circle.drawCircle(g2d, (int) ((centerX) - (headDiameter / 4)),
                                ((int) (headCenterY - (headDiameter / 4))), (int) eyeDiameter / 2,
                                true);
                circle.drawCircle(g2d, (int) ((centerX) + (headDiameter / 4) - eyeDiameter),
                                ((int) (headCenterY - (headDiameter / 4))), (int) eyeDiameter / 2,
                                true);

                // Arms Line
                line.drawBresenhamLine(g2d, (int) ((centerX) - (middleDiameter / 4)),
                                ((int) (middleCenterY - (middleDiameter / 4))),
                                (int) ((centerX) - (middleDiameter / 4) - middleDiameter / 2),
                                (int) (middleCenterY - (middleDiameter / 4) - middleDiameter / 3));
                line.drawBresenhamLine(g2d, (int) ((centerX) + (middleDiameter / 4)),
                                ((int) (middleCenterY - (middleDiameter / 4))),
                                (int) ((centerX) + (middleDiameter / 4) + middleDiameter / 2),
                                (int) (middleCenterY - (middleDiameter / 4) - middleDiameter / 3));
        }
}
