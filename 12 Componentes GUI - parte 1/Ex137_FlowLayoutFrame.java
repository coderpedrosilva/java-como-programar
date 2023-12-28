
// Figura 12.39: FlowLayoutFrame.java
// FlowLayout permite que os componentes fluam ao longo de múltiplas linhas.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Ex137_FlowLayoutFrame extends JFrame {
    private final JButton leftJButton; // botão para configurar alinhamento à esquerda
    private final JButton centerJButton; // botão para configurar alinhamento centralizado
    private final JButton rightJButton; // botão para configurar alinhamento à direita
    private final FlowLayout layout; // objeto de layout
    private final Container container; // contêiner para configurar layout

    // configura GUI e registra listeners de botão
    public Ex137_FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane(); // obtém contêiner para layout
        setLayout(layout);

        // configura leftJButton e registra listener
        leftJButton = new JButton("Left");
        add(leftJButton); // adiciona o botão Left ao frame
        leftJButton.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // processa o evento leftJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                });

        // configura centerJButton e registra o listener
        centerJButton = new JButton("Center");
        add(centerJButton); // adiciona botão Center ao frame
        centerJButton.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // processa evento centerJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                });

        // configura rightJButton e registra o listener
        rightJButton = new JButton("Right");
        add(rightJButton); // adiciona botão Right ao frame
        rightJButton.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // processa evento rightJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                });
    } // fim do construtor FlowLayoutFrame
} // fim da classe FlowLayoutFrame