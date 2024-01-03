
// Figura 12.45: PanelFrame.java
// Utilizando um JPanel para ajudar a fazer o layout dos componentes.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ex143_PanelFrame extends JFrame {
    private final JPanel buttonJPanel; // painel para armazenar botões
    private final JButton[] buttons;

    // construtor sem argumento
    public Ex143_PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // cria e adiciona botões
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]); // adiciona botão ao painel
        }

        add(buttonJPanel, BorderLayout.SOUTH); // adiciona painel ao JFrame
    }
} // fim da classe PanelFrame