
// Figura 12.19: RadioButtonFrame.java
// Criando botões de opção utilizando ButtonGroup e JRadioButton.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Ex121_RadioButtonFrame extends JFrame {
    private final JTextField textField; // utilizado para exibir alterações de fonte
    private final Font plainFont; // fonte para texto simples
    private final Font boldFont; // fonte para texto em negrito
    private final Font italicFont; // fonte para texto em itálico
    private final Font boldItalicFont; // fonte para texto em negrito e itálico
    private final JRadioButton plainJRadioButton; // seleciona texto simples
    private final JRadioButton boldJRadioButton; // seleciona texto em negrito
    private final JRadioButton italicJRadioButton; // seleciona texto em itálico
    private final JRadioButton boldItalicJRadioButton; // negrito e itálico
    private final ButtonGroup radioGroup; // contém botões de opção

    // construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
    public Ex121_RadioButtonFrame() {
        super("RadioButton Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 25);
        add(textField); // adiciona textField ao JFrame

        // cria botões de opção
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(plainJRadioButton); // adiciona botão no estilo simples ao JFrame
        add(boldJRadioButton); // adiciona botão de negrito ao JFrame
        add(italicJRadioButton); // adiciona botão de itálico ao JFrame
        add(boldItalicJRadioButton); // adiciona botão de negrito e itálico

        // cria relacionamento lógico entre JRadioButtons
        radioGroup = new ButtonGroup(); // cria ButtonGroup
        radioGroup.add(plainJRadioButton); // adiciona texto simples ao grupo
        radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo
        radioGroup.add(italicJRadioButton); // adiciona itálico ao grupo
        radioGroup.add(boldItalicJRadioButton); // adiciona negrito e itálico

        // cria fonte objetos
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        // registra eventos para JRadioButtons
        plainJRadioButton.addItemListener(
                new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(
                new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(
                new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(
                new RadioButtonHandler(boldItalicFont));
    }

    // classe interna private para tratar eventos de botão de opção
    private class RadioButtonHandler implements ItemListener {
        private Font font; // fonte associada com esse listener

        public RadioButtonHandler(Font f) {
            font = f;
        }

        // trata eventos de botão de opção
        @Override
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }
} // fim da classe RadioButtonFrame