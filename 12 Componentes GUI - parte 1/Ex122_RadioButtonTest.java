
// Figura 12.20: RadioButtonTest.java
// Testando RadioButtonFrame.
import javax.swing.JFrame;

public class Ex122_RadioButtonTest {
    public static void main(String[] args) {
        Ex121_RadioButtonFrame radioButtonFrame = new Ex121_RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(300, 100);
        radioButtonFrame.setVisible(true);
    }
} // fim da classe RadioButtonTest