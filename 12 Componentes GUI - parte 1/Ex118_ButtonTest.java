
// Figura 12.16: ButtonTest.java
// Testando ButtonFrame.
import javax.swing.JFrame;

public class Ex118_ButtonTest {
    public static void main(String[] args) {
        Ex117_ButtonFrame buttonFrame = new Ex117_ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
} // fim da classe ButtonTest