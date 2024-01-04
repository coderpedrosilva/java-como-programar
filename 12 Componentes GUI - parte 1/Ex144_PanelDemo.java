
// Figura 12.46: PanelDemo.java
// Testando PanelFrame.
import javax.swing.JFrame;

public class Ex144_PanelDemo extends JFrame {
    public static void main(String[] args) {
        Ex143_PanelFrame panelFrame = new Ex143_PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200);
        panelFrame.setVisible(true);
    }
} // fim da classe PanelDemo
