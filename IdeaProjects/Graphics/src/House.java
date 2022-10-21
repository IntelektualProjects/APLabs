import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.util.Arrays;

public class House extends Canvas {

    public House() {
        setBackground(Color.blue);
        setVisible(true);
    }
    public void paint(Graphics window) {
        paintGrid(window); // I comment this out for the end result
        baseHouse(window);
        topHouse(window);
        roofLine(window);
        outdoors(window);

    }
    public void paintGrid(Graphics window) {
        window.setColor(Color.black);
        for(int x = 0; x< 1000; x +=100) {
            for(int y = 0; y<1000; y +=100) {
                window.drawRect(x, y, 1, 1);
            }
        }
    }
    public void baseHouse(Graphics window) {
        window.setColor(Color.gray);
        window.fillRect(200,500, 500, 400); // base house
        window.setColor(Color.black);
        window.fillRect(400, 700, 100, 200); // door
        window.setColor(Color.yellow);
        window.fillOval(405, 800, 15, 15); // doorknob
        window.setColor(Color.black);
        window.fillRect(555, 565, 110, 110); // window outlines
        window.fillRect(235, 565, 110, 110);
        window.setColor(Color.cyan);
        window.fillRect(560, 570, 100, 100); // windows
        window.fillRect(240, 570, 100, 100);
    }

    public void topHouse(Graphics window) {
        window.setColor(Color.gray);
        window.fillRect(200,300, 300, 200); //smaller top section
        window.setColor(Color.black);
        window.fillOval(295, 365, 90, 90); // outline of window
        window.setColor(Color.cyan);
        window.fillOval(300, 370, 80, 80); // window

    }
    public void roofLine(Graphics window) {
        float[] hsb = Color.RGBtoHSB(139,69,19, new float[3]);
        window.setColor(Color.getHSBColor(hsb[0], hsb[1], hsb[2])); // brown roof
        int[] x = {150, 350, 550};
        int[] y = {300, 170, 300};
        window.fillPolygon(x, y, 3); // upper roof
        int[] x2 = {400, 575, 750};
        int[] y2 = {500, 370, 500};
        window.fillPolygon(x2, y2, 3); // lower roof
    }
    public void outdoors(Graphics window){
        window.setColor(Color.green);
        window.fillRect(0, 900, 1000, 100);// grass
        window.setColor(Color.yellow);
        window.fillOval(800, 100, 100, 100); // sun
    }
}

