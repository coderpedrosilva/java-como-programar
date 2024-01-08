
// Figura 13.6: ShowColors.java
// Demonstrando Colors.
import javax.swing.JFrame;

public class Ex148_ShowColors {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria o frame para ColorJPanel
        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ex147_ColorJPanel colorJPanel = new Ex147_ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
} // fim da classe ShowColors