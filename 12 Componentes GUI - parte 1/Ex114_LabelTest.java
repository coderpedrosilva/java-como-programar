
// Figura 12.7: LabelTest.java
// Testando LabelFrame.
import javax.swing.JFrame;

public class Ex114_LabelTest {
    public static void main(String[] args) {
        Ex113_LabelFrame labelFrame = new Ex113_LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
} // fim da classe LabelTest