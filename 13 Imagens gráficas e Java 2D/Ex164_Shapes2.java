
// Figura 13.32: Shapes2.java
// Demonstrando um caminho geral.
import java.awt.Color;
import javax.swing.JFrame;

public class Ex164_Shapes2 {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para Shapes2JPanel
        JFrame frame = new JFrame("Drawing 2D Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ex163_Shapes2JPanel shapes2JPanel = new Ex163_Shapes2JPanel();
        frame.add(shapes2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315, 330);
        frame.setVisible(true);
    }
} // fim da classe Shapes2