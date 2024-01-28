
// Figura 13.30: Shapes.java
// Testando ShapesJPanel.
import javax.swing.JFrame;

public class Ex162_Shapes {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para ShapesJPanel
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // cria ShapesJPanel
        Ex161_ShapesJPanel shapesJPanel = new Ex161_ShapesJPanel();

        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
} // fim da classe Shapes
