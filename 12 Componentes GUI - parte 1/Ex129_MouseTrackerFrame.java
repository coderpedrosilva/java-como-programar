
// Figura 12.28: MouseTrackerFrame.java
// Tratamento de evento de mouse.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex129_MouseTrackerFrame extends JFrame {
    private final JPanel mousePanel; // painel em que os eventos de mouse ocorrem
    private final JLabel statusBar; // exibe informações do evento

    // construtor MouseTrackerFrame configura GUI e
    // registra rotinas de tratamento de evento de mouse
    public Ex129_MouseTrackerFrame() {
        super("Demonstrating Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER); // adiciona painel ao JFrame

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH); // adiciona rótulo ao JFrame

        // cria e registra listener para mouse e eventos de movimento de mouse
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener,

            MouseMotionListener {
        // rotinas de tratamento de evento MouseListener
        // trata evento quando o mouse é liberado imediatamente depois de ter sido
        // pressionado
        @Override
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked at [%d, %d]",
                    event.getX(), event.getY()));
        }

        // trata evento quando mouse é pressionado
        @Override
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed at [%d, %d]",
                    event.getX(), event.getY()));
        }

        // trata o evento quando o mouse é liberado
        @Override
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Released at [%d, %d]",
                    event.getX(), event.getY()));
        }

        // trata evento quando mouse entra na área
        @Override
        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]",
                    event.getX(), event.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        // trata evento quando mouse sai da área
        @Override
        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        // rotinas de tratamento de evento MouseMotionListener
        // trata o evento quando o usuário arrasta o mouse com o botão pressionado
        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged at [%d, %d]",
                    event.getX(), event.getY()));
        }

        // trata evento quando usuário move o mouse
        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved at [%d, %d]",
                    event.getX(), event.getY()));
        }
    } // fim da classe interna MouseHandler
} // fim da classe MouseTrackerFrame