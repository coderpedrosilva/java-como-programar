
// Figura 13.29: ShapesJPanel.java
// Demonstrando algumas formas 2D Java.
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.TexturePaint;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Ex161_ShapesJPanel extends JPanel {
    // desenha formas com Java 2D API
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // faz uma coerção em g para Graphics2D

        // desenha oval 2D preenchida com um gradiente azul-amarelo
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        // desenha retângulo 2D em vermelho
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

        // desenha retâng. arred. 2D com um fundo armazenado em bufferÿ
        BufferedImage buffImage = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_RGB);

        // obtém Graphics2D de buffImage e desenha nela
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(Color.BLACK);
        gg.drawRect(1, 1, 6, 6);
        gg.setColor(Color.BLUE);
        gg.fillRect(1, 1, 3, 3);
        gg.setColor(Color.RED);
        gg.fillRect(4, 4, 3, 3); // desenha um retângulo preenchido

        // pinta buffImage sobre o JFrame
        g2d.setPaint(new TexturePaint(buffImage,
                new Rectangle(10, 10)));
        g2d.fill(
                new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

        // Desenha arco 2D em forma de torta em branco
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(
                new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

        // Desenha linhas 2D em verde e amarelo
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(395, 30, 320, 150));

        // desenha uma linha em 2D utilizando traço
        float[] dashes = { 10 }; // especifica padrão de traço
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(320, 30, 395, 150));
    }
} // fim da classe ShapesJPanel
