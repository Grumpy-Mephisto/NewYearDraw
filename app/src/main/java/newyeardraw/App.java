package newyeardraw;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import graphics.NewYearImage;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("New Year Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            NewYearImage newYearImage = new NewYearImage();
            newYearImage.setPreferredSize(new java.awt.Dimension(600, 600));
            frame.getContentPane().add(newYearImage);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
