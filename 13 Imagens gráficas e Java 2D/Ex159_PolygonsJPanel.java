
// Figura 13.27: PolygonsJPanel.java
// Desenhando polígonos.
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Ex159_PolygonsJPanel extends JPanel {
    // desenha polígonos e polilinhas
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // desenha o polígono com objeto Polygon
        int[] xValues = { 20, 40, 50, 30, 20, 15 };
        int[] yValues = { 50, 50, 60, 80, 80, 60 };
        Polygon polygon1 = new Polygon(xValues, yValues, 6);
        g.drawPolygon(polygon1);

        // desenha polilinhas com dois arrays
        int[] xValues2 = { 70, 90, 100, 80, 70, 65, 60 };
        int[] yValues2 = { 100, 100, 110, 110, 130, 110, 90 };
        g.drawPolyline(xValues2, yValues2, 7);

        // preenche o polígono com dois arrays
        int[] xValues3 = { 120, 140, 150, 190 };
        int[] yValues3 = { 40, 70, 80, 60 };
        g.fillPolygon(xValues3, yValues3, 4);

        // desenha o polígono preenchido com objeto Polygon
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(165, 135);
        polygon2.addPoint(175, 150);
        polygon2.addPoint(270, 200);
        polygon2.addPoint(200, 220);
        polygon2.addPoint(130, 180);
        g.fillPolygon(polygon2);
    }
} // fim da classe PolygonsJPanel
