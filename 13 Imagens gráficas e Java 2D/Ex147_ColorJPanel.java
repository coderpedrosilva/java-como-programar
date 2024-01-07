
// Figura 13.5: ColorJPanel.java
// Alterando cores de desenho.
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Ex147_ColorJPanel extends JPanel {
    // desenha retângulos e Strings em cores diferentes
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        // nova cor de desenho configurada utiliza inteiros
        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40);

        // nova cor de desenho configurada utiliza floats
        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);

        // nova cor de desenho configurada usa objetos Color estáticos
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 90);

        // exibe valores individuais de RGB
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
        g.drawString("RGB values: " + color.getRed() + ", " +
                color.getGreen() + ", " + color.getBlue(), 130, 115);
    }
} // fim da classe ColorJPanel