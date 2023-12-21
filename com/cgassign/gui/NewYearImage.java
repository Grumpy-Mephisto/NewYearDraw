package com.cgassign.gui;

import com.cgassign.components.*;
// import com.cgassign.functions.*;
import java.awt.*;
import javax.swing.*;

public class NewYearImage extends JPanel {
    // private Line line = new Line();
    // private Curve curve = new Curve();
    // private Circle circle = new Circle();
    // private Triangle triangle = new Triangle();

    private Snow Snow = new Snow();
    private Tree ChristmasTree = new Tree();
    private Snowman Snowman = new Snowman();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother shapes
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background
        Color[] BackgroundColors =
                {Color.decode("#0c1445"), Color.decode("#2d2351"), Color.decode("#4c408e")};
        float[] BackgroundDist = {0.0f, 0.5f, 1.0f};
        g2d.setPaint(new LinearGradientPaint(getWidth() / 2, 0, getWidth() / 2, getHeight(),
                BackgroundDist, BackgroundColors));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Snow
        Snow.draw(g2d, getWidth(), getHeight());

        // Tree
        ChristmasTree.draw(g2d, getWidth(), getHeight());

        // Snowman
        Snowman.draw(g2d, 1000, 700);
    }
}
