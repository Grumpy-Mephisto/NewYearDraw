package graphics;

import components.*;

import java.awt.*;
import javax.swing.*;

public class NewYearImage extends JPanel {
    private Snow Snow = new Snow();
    private Tree ChristmasTree = new Tree();
    private Snowman Snowman = new Snowman();
    private Firework Firework = new Firework();
    private Confetti Confetti = new Confetti();
    private Elsa Elsa = new Elsa();

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
        g2d.fillRect(0, 0, getWidth() + 1, getHeight() + 1);

        // Snow
        Snow.draw(g2d, getWidth(), getHeight());

        // Tree
        ChristmasTree.draw(g2d, getWidth() + 400, getHeight() + 100);

        // Snowman
        Snowman.draw(g2d, getWidth() - 400, getHeight() + 100);

        // Fireworks
        Firework.draw(g2d, getWidth(), getHeight(), 10, 100);

        // Confetti
        Confetti.draw(g2d, getWidth(), getHeight(), 100);

        // Elsa
        Elsa.draw(g2d, getWidth(), getHeight());
    }
}
