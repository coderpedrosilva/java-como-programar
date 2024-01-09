
// Figura 13.7: ShowColors2JFrame.Java
// Escolhendo cores com JColorChooser.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class Ex149_ShowColors2JFrame extends JFrame {
    private final JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;

    // configura a GUI
    public Ex149_ShowColors2JFrame() {
        super("Using JColorChooser");

        // cria JPanel para exibir as cores
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        // configura changeColorJButton e registra sua rotina de tratamento de evento
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // exibe JColorChooser quando o usuário clica no botão
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(
                                Ex149_ShowColors2JFrame.this, "Choose a color", color);

                        // configura a cor padrão, se nenhuma cor for retornada
                        if (color == null)
                            color = Color.LIGHT_GRAY;

                        // muda a cor de fundo do painel de conteúdo
                        colorJPanel.setBackground(color);
                    } // fim do método actionPerformed
                } // fim da classe interna anônima
        ); // fim da chamada para addActionListener

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    } // fim do construtor ShowColor2JFrame
} // fim da classe ShowColors2JFrame