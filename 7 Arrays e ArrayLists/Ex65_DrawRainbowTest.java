
// Figura 7.26: DrawRainbowTest.java
// Aplicativo de teste para exibir um arco-íris.
import javax.swing.JFrame;

public class Ex65_DrawRainbowTest {
    public static void main(String[] args) {
        Ex64_DrawRainbow panel = new Ex64_DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
} // fim da classe DrawRainbowTest