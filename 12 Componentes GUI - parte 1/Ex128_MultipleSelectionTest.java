
// Figura 12.26: MultipleSelectionTest.java
// Testando MultipleSelectionFrame.
import javax.swing.JFrame;

public class Ex128_MultipleSelectionTest {
    public static void main(String[] args) {
        Ex127_MultipleSelectionFrame multipleSelectionFrame = new Ex127_MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
} // fim da classe MultipleSelectionTest