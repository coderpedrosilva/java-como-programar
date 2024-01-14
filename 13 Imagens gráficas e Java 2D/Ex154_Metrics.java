
// Figura 13.16: Metrics.java
// Exibindo a métrica de fonte.
import javax.swing.JFrame;

public class Ex154_Metrics {
    // executa o aplicativo
    public static void main(String[] args) {
        // cria frame para MetricsJPanel
        JFrame frame = new JFrame("Demonstrating FontMetrics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ex153_MetricsJPanel metricsJPanel = new Ex153_MetricsJPanel();
        frame.add(metricsJPanel);
        frame.setSize(510, 240);
        frame.setVisible(true);
    }
} // fim da classe Metrics