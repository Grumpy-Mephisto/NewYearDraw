package com.cgassign.components;

import com.cgassign.functions.Triangle;

import java.awt.*;

public class Tree {
    private int TreeLayers;
    private int TreeTriangleHeight;

    private Triangle triangle = new Triangle();

    private String[] TreeColors = {"#004d00", "#00b300"};

    public void draw(Graphics2D g2d, int width, int height) {
        TreeLayers = 3;
        TreeTriangleHeight = height / (TreeLayers + 1);

        for (int i = 0; i < TreeLayers; i++) {
            int TreeTriangleWidth = width / (i + 2);
            int x = (width - TreeTriangleWidth) / 2;
            int y = height - (i + 1) * TreeTriangleHeight;

            // Gradient color
            GradientPaint TreeGradientColor = new GradientPaint(x, y, Color.decode(TreeColors[0]),
                    x + TreeTriangleWidth / 2, y + TreeTriangleHeight, Color.decode(TreeColors[1]));
            g2d.setPaint(TreeGradientColor);

            // Draw the tree
            int[] xArr = {x, x + TreeTriangleWidth / 2, x + TreeTriangleWidth};
            int[] yArr = {y + TreeTriangleHeight, y / 2, y + TreeTriangleHeight};
            triangle.drawFillPolygonTriangle(g2d, xArr[0], yArr[0], xArr[1], yArr[1], xArr[2],
                    yArr[2], true);
        }
    }
}
