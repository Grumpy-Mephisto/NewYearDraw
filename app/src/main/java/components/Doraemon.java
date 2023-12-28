package components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Doraemon {
    private String[] DoraemonColor =
            {"#fdfdfd", "#000000", "#E61737", "#03ADF0", "#FED037", "#F57C33"};

    public void draw(Graphics2D g2d, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2img = image.createGraphics();

        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(204, 405, 65, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(204, 405, 65, 40);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(282, 405, 65, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(282, 405, 65, 40);
        int x[] = {200, 350, 400, 420, 348, 340, 290, 275, 260, 210, 218, 188, 168};
        int y[] = {250, 250, 200, 220, 300, 420, 420, 380, 420, 420, 310, 360, 340};
        g2img.setColor(Color.decode(DoraemonColor[3]));
        g2img.fillPolygon(x, y, 13);
        g2img.setColor(Color.decode(DoraemonColor[3]));
        g2img.fillPolygon(x, y, 13);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(223, 240, 115, 125);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(223, 240, 115, 125);
        g2img.drawLine(240, 310, 320, 310);
        g2img.drawArc(240, 270, 80, 80, 180, 180);
        g2img.setColor(Color.decode(DoraemonColor[3]));
        g2img.fillOval(170, 85, 210, 180);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(170, 85, 210, 180);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(188, 125, 175, 135);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(188, 125, 175, 135);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawLine(230, 198, 325, 200);
        g2img.drawArc(230, 155, 95, 87, 180, 180);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.fillArc(230, 155, 95, 87, 180, 180);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawArc(255, 214, 50, 40, -170, -170);
        g2img.setColor(Color.decode(DoraemonColor[5]));
        g2img.fillArc(255, 214, 50, 40, -170, -190);
        g2img.fillArc(255, 227, 48, 15, 180, 180);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(232, 100, 45, 60);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(232, 100, 45, 60);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(278, 100, 45, 60);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(278, 100, 45, 60);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.fillOval(255, 125, 14, 24);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.fillOval(285, 125, 14, 24);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(259, 135, 7, 7);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(288, 135, 7, 7);
        g2img.setColor(Color.decode(DoraemonColor[2]));
        g2img.fillOval(260, 148, 34, 34);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(260, 148, 34, 34);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(265, 158, 10, 10);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(265, 158, 10, 10);
        g2img.drawLine(278, 181, 278, 198);
        g2img.drawLine(310, 170, 368, 150);
        g2img.drawLine(310, 180, 368, 180);
        g2img.drawLine(310, 190, 368, 210);
        g2img.drawLine(240, 170, 188, 150);
        g2img.drawLine(240, 180, 188, 180);
        g2img.drawLine(240, 190, 188, 210);
        g2img.setColor(Color.decode(DoraemonColor[2]));
        g2img.fillRect(215, 248, 120, 15);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawRect(215, 248, 120, 15);
        g2img.setColor(Color.decode(DoraemonColor[4]));
        g2img.fillOval(260, 250, 40, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(260, 250, 40, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.fillOval(274, 270, 10, 10);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawArc(253, 265, 50, 20, 30, 100);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(158, 330, 40, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(158, 330, 40, 40);
        g2img.setColor(Color.decode(DoraemonColor[0]));
        g2img.fillOval(390, 190, 40, 40);
        g2img.setColor(Color.decode(DoraemonColor[1]));
        g2img.drawOval(390, 190, 40, 40);

        g2d.drawImage(image, width, height, null);
    }
}
