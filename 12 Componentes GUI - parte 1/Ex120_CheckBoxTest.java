
// Figura 12.18: CheckBoxTest.java
// Testando CheckBoxFrame.
import javax.swing.JFrame;

public class Ex120_CheckBoxTest {
    public static void main(String[] args) {
        Ex119_CheckBoxFrame checkBoxFrame = new Ex119_CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(275, 100);
        checkBoxFrame.setVisible(true);
    }
} // fim da classe CheckBoxTest