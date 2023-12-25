package components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Elsa {
    private final String filename = "src/main/resources/elsa-pixel.csv";

    private List<Color> colorsList;
    private List<int[]> coordinatesList;

    public Elsa() {
        colorsList = new ArrayList<>();
        coordinatesList = new ArrayList<>();
        ReadCoordinatesFromFile(filename);
    }

    private void ReadCoordinatesFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    int x = Integer.parseInt(parts[0]);
                    int y = Integer.parseInt(parts[1]);
                    int r = Integer.parseInt(parts[2]);
                    int g = Integer.parseInt(parts[3]);
                    int b = Integer.parseInt(parts[4]);

                    coordinatesList.add(new int[] {x, y});
                    colorsList.add(new Color(r, g, b));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void draw(Graphics2D g2d, int width, int height) {
        for (int i = 0; i < coordinatesList.size() - 1; i++) {
            int[] coordinates = coordinatesList.get(i);
            Color color = colorsList.get(i);

            if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0) {
                continue;
            }

            g2d.setColor(color);
            int x = coordinates[0];
            int y = coordinates[1];

            g2d.drawLine(x, y, x, y);
        }
    }
}
