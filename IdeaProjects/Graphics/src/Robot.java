//Name - Shreyas Potnuru
//Date - 5/24/21

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas{
    public Robot(){
    setSize(800,600);
    setBackground(Color.WHITE);
    setVisible(true);
    }

    public void paint( Graphics window ){
        window.setColor(Color.BLUE);
        window.drawString("Budget Transformers :D", 35, 35 );
        head(window);
        upperBody(window);
        lowerBody(window);
    }

    public void head( Graphics window ) {
        window.setColor(Color.lightGray);
        window.fillRect(470, 380, 40, 40); // neck
        window.setColor(Color.gray);
        window.fillRect(440, 300, 100, 100); // head
        window.setColor(Color.cyan);
        window.fillRect(450, 320, 20, 20); // eyes
        window.fillRect(510, 320, 20, 20);
        window.setColor(Color.black);
        window.fillRect(470, 370, 40, 10); // mouth
    }

    public void upperBody( Graphics window ){
        window.setColor(Color.darkGray);
        window.fillRect(390, 420, 200, 200); // torso
        window.setColor(Color.RED);
        window.fillOval(460, 470, 60, 60); // red logo
        window.setColor(Color.yellow);
        window.fillArc(555, 420, 70, 70, 90, -180); // shoulders
        window.fillArc(355, 420, 70, 70, 90, 180);
        window.setColor(Color.gray);
        window.fillRect(625, 445, 150, 20); // arms
        window.fillRect(208, 445, 150, 20);

    }

    public void lowerBody( Graphics window ){
        window.setColor(Color.black);
        window.fillRect(450, 800, 80, 150); // wheel
        window.setColor(Color.gray);
        window.fillRect(410, 700, 30, 175); // lower body connectors
        window.fillRect(540, 700, 30, 175);
        window.fillRect(410, 620, 160, 80);
    }
}

