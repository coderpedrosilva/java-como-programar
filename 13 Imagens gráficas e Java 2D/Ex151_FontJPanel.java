
// Figura 13.11: FontJPanel.java
// Exibe strings em diferentes fontes e cores.
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ex151_FontJPanel extends JPanel {
    // exibe Strings em diferentes fontes e cores
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // configura fonte com Serifa (Times), negrito, 12 pt e desenha uma string
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 point bold.", 20, 30);

        // define a fonte como Monospaced (Courier), itálico, 24 pt e desenha uma string
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 point italic.", 20, 50);

        // define a fonte como SansSerif (Helvetica), simples, 14 pt e desenha uma
        // string
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("SansSerif 14 point plain.", 20, 70);

        // configura fonte com Serifa (Times), 18 pt, negrito/itálico e desenha uma
        // string
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize() +
                " point bold italic.", 20, 90);
    }
} // fim da classe FontJPanel