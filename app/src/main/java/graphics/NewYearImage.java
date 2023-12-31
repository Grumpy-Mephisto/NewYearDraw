package graphics;

import components.*;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class NewYearImage extends JPanel {
    private Snow Snow = new Snow();
    private Tree ChristmasTree = new Tree();
    private Star Star = new Star();
    private Snowman Snowman = new Snowman();
    private Confetti Confetti = new Confetti();
    // private Elsa Elsa = new Elsa();
    private Doraemon Doraemon = new Doraemon();

    private String[] BackgroundColors = {"#0c1445", "#2d2351", "#4c408e"};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother shapes
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Background
        Color[] color = {Color.decode(BackgroundColors[0]), Color.decode(BackgroundColors[1]),
                Color.decode(BackgroundColors[2])};
        float[] BackgroundDist = {0.0f, 0.5f, 1.0f};
        g2d.setPaint(new LinearGradientPaint(getWidth() / 2, 0, getWidth() / 2, getHeight(),
                BackgroundDist, color));
        g2d.fillRect(0, 0, getWidth() + 1, getHeight() + 1);

        // Snow
        Snow.draw(g2d, getWidth(), getHeight());

        // Tree
        ChristmasTree.draw(g2d, getWidth() + 400, getHeight() + 100);

        // Star
        Star.draw(g2d, getWidth() + 400, getHeight() - 425, 200);

        // Snowman
        Snowman.draw(g2d, getWidth() - 400, getHeight() + 100);

        // Confetti
        Confetti.draw(g2d, getWidth(), getHeight(), 100);

        // Elsa
        // Elsa.draw(g2d, getWidth(), getHeight()); // illegal ways

        // Doraemon
        Doraemon.draw(g2d, getWidth(), getHeight());
    }

    public void saveImage() {
        BufferedImage imageBuffer =
                new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imageBuffer.createGraphics();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        paintComponent(g2d);

        g2d.dispose();

        try {
            ImageIO.write(imageBuffer, "png", new File("Assignment1_6505437_65050431.png"));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
