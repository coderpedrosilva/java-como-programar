
// Figura 13.31: Shapes2JPanel.java
// Demonstrando um caminho geral.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class Ex163_Shapes2JPanel extends JPanel {
    // desenha caminhos gerais
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        SecureRandom random = new SecureRandom();

        int[] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
        int[] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        // configura a coordenada inicial do General Path
        star.moveTo(xPoints[0], yPoints[0]);

        // cria a estrela -- isso não desenha a estrela
        for (int count = 1; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);

        star.closePath(); // fecha a forma

        g2d.translate(150, 150); // traduz a origem para (150, 150)

        // gira em torno da origem e desenha estrelas em cores aleatórias
        for (int count = 1; count <= 20; count++) {
            g2d.rotate(Math.PI / 10.0); // rotaciona o sistema de coordenadas

            // configura cores aleatórias
            g2d.setColor(new Color(random.nextInt(256),
                    random.nextInt(256), random.nextInt(256)));

            g2d.fill(star); // desenha estrela preenchida
        }
    }
} // fim da classe Shapes2JPanel