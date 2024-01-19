
// Figura 13.24: ArcsJPanel.java
// Arcos exibidos com drawArc e fillArc.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ex157_ArcsJPanel extends JPanel {
    // desenha retângulos e arcos
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // inicia em 0 e varre 360 graus
        g.setColor(Color.RED);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80, 0, 360);

        // inicia em 0 e varre 110 graus
        g.setColor(Color.RED);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);

        // inicia em 0 e varre —270 graus
        g.setColor(Color.RED);
        g.drawRect(185, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(185, 35, 80, 80, 0, -270);

        // inicia em 0 e varre 360 graus
        g.fillArc(15, 120, 80, 40, 0, 360);

        // inicia em 270 e varre —90 graus
        g.fillArc(100, 120, 80, 40, 270, -90);

        // inicia em 0 e varre —270 graus
        g.fillArc(185, 120, 80, 40, 0, -270);
    }
} // fim da classe ArcsJPanel