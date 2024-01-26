
// Figura 13.28: DrawPolygons.java
// Desenhando polígonos.
import javax.swing.JFrame;

public class Ex160_DrawPolygons {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para PolygonsJPanel
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ex159_PolygonsJPanel polygonsJPanel = new Ex159_PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
} // fim da classe DrawPolygons