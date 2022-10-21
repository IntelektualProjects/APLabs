//Name - Shreyas Potnuru
//Date - 5/22/21

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;

public class smileyFace extends Canvas
{
    public smileyFace()
    {
        setSize(1000,1000);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void paint(Graphics window)
    {
        paintGrid(window);
        eyeroll(window);

    }

    public void paintGrid(Graphics window){
        window.setColor(Color.black);
        for(int x = 0; x< 1000; x +=100) {
            for(int y = 0; y<1000; y +=100) {
                window.drawRect(x, y, 1, 1);
            }
        }
    }
    public void faceNEyes( Graphics window )
    {
        window.setColor(Color.BLUE);
        window.setFont(new Font("TOHOMA", Font.ITALIC, 22));
        window.drawString("Extra", 35, 35);

        // yellow emoticon body
        window.setColor(Color.YELLOW);
        window.fillOval( 210, 100, 400, 400 );
        // eyes
        window.setColor(Color.WHITE);
        window.fillOval(280, 185, 100, 100);
        window.fillOval(450, 185, 100, 100);
        // pupils
        window.setColor(Color.black);
        window.fillOval(310, 200, 35, 35);
        window.fillOval(480, 200, 35, 35);

    }
    public void noseNMouth(Graphics window){
        // mouth
        window.setColor(Color.black);
        window.drawArc(370, 400, 100, 30, 180, 180);
        // nose
        window.setColor(Color.red);
        window.fillOval(385, 280, 50, 80);
    }

    public void eyeroll (Graphics window){
        window.setColor(Color.BLUE);
        window.setFont(new Font("TOHOMA", Font.ITALIC, 22));
        window.drawString("Extra Eyeroll Emoticon :D", 35, 35);
        // yellow emoticon body
        window.setColor(Color.YELLOW);
        window.fillOval( 210, 100, 400, 400 );
        // eyes
        window.setColor(Color.WHITE);
        window.fillOval(280, 185, 100, 100);
        window.fillOval(450, 185, 100, 100);
        // pupils
        window.setColor(Color.black);
        window.fillOval(310, 185, 35, 35);
        window.fillOval(480, 185, 35, 35);
        // mouth
        window.fillRect(360, 400, 100, 25);
        window.fillArc(346, 400, 27, 25, 90,180);
        window.fillArc(445, 400, 27, 25, 90,-180);
    }
}
