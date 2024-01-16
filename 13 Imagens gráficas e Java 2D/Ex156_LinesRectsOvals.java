
// Figura 13.19: LinesRectsOvals.java
// Testando LinesRectsOvalsJPanel.
import java.awt.Color;
import javax.swing.JFrame;

public class Ex156_LinesRectsOvals {
    // executa o aplicativo
    public static void main(String[] args) {
        // criar frame para LinesRectsOvalsJPanel
        JFrame frame = new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ex155_LinesRectsOvalsJPanel linesRectsOvalsJPanel = new Ex155_LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400, 210);
        frame.setVisible(true);
    }
} // fim da classe LinesRectsOvals