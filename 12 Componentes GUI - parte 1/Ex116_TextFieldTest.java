
// Figura 12.10: TextFieldTest.java
// Testando TextFieldFrame.
import javax.swing.JFrame;

public class Ex116_TextFieldTest {
    public static void main(String[] args) {
        Ex115_TextFieldFrame textFieldFrame = new Ex115_TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100);
        textFieldFrame.setVisible(true);
    }
} // fim da classe TextFieldTest