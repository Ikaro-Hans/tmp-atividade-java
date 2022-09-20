import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Painel extends JPanel {
    public Painel(){
        this.setPreferredSize(new Dimension(1280, 1080));
        this.setBackground(Color.red);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.yellow);
        g2d.fillOval(640, 540, 100, 100);
        g2d.fillRect(100, 200, 100, 100);
        Quadrado forma = new Quadrado(new Ponto2D(150, 150), Color.BLACK, 50;

    }
}
