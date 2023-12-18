
// Figura 12.25: MultipleSelectionFrame.java
// JList que permite múltiplas seleções.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ex127_MultipleSelectionFrame extends JFrame {
    private final JList<String> colorJList; // lista para armazenar nomes de cor
    private final JList<String> copyJList; // lista para armazenar nomes copiados
    private JButton copyJButton; // botão para copiar nomes selecionados
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow" };

    // construtor MultipleSelectionFrame
    public Ex127_MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // lista dos nomes de cores
        colorJList.setVisibleRowCount(5); // mostra cinco linhas
        colorJList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList)); // adiciona lista com scrollpane

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
                new ActionListener() // classe interna anônima
                {
                    // trata evento de botão
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        // coloca valores selecionados na copyJList
                        copyJList.setListData(
                                colorJList.getSelectedValuesList().toArray(
                                        new String[0]));
                    }
                });

        add(copyJButton); // adiciona botão de cópia ao JFrame

        copyJList = new JList<String>(); // lista para armazenar nomes copiados
        copyJList.setVisibleRowCount(5); // mostra 5 linhas
        copyJList.setFixedCellWidth(100); // configura a largura
        copyJList.setFixedCellHeight(15); // configura a altura
        copyJList.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // adiciona lista com scrollpane
    }
} // fim da classe MultipleSelectionFrame