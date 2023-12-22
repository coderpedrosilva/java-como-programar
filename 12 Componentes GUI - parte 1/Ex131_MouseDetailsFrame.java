
// Figura 12.31: MouseDetailsFrame.java
// Demonstrando cliques de mouse e distinguindo entre botões do mouse.
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex131_MouseDetailsFrame extends JFrame {
    private String details; // String exibida na statusBar
    private final JLabel statusBar; // JLabel na parte inferior da janela

    // construtor configura String de barra de título e registra o listener de mouse
    public Ex131_MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // adiciona tratamento de evento
    }

    // classe interna para tratar eventos de mouse
    private class MouseClickHandler extends MouseAdapter {
        // trata evento de clique de mouse e determina qual botão foi pressionado
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // obtém a posição x do mouse
            int yPos = event.getY(); // obtém a posição y do mouse
            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown()) // botão direito do mouse
                details += " with right mouse button";
            else if (event.isAltDown()) // botão do meio do mouse
                details += " with center mouse button";
            else // botão esquerdo do mouse
                details += " with left mouse button";

            statusBar.setText(details); // exibe mensagem em statusBar
        }
    }
} // fim da classe MouseDetailsFrame
