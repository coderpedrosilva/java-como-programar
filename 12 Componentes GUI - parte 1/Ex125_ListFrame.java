
// Figura 12.23: ListFrame.java
// JList que exibe uma lista de cores.
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class Ex125_ListFrame extends JFrame {
    private final JList<String> colorJList; // lista para exibir cores
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow" };
    private static final Color[] colors = { Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW };

    // construtor ListFrame adiciona JScrollPane que contém JList ao JFrame
    public Ex125_ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // lista de colorNames
        colorJList.setVisibleRowCount(5); // exibe cinco linhas de uma vez

        // não permite múltiplas seleções
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // adiciona um JScrollPane que contém JList ao frame
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                new ListSelectionListener() // classe interna anônima
                {
                    // trata eventos de seleção de lista
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(
                                colors[colorJList.getSelectedIndex()]);
                    }
                });
    }
} // fim da classe ListFrame