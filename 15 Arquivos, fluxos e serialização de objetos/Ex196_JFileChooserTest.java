// Figura 15.13: JFileChooserTest.java
// Testa a classe JFileChooserDemo.

import java.io.IOException;
import javax.swing.JFrame;

public class Ex196_JFileChooserTest {

    public static void main(String[] args) throws IOException {
        Ex195_JFileChooserDemo application = new Ex195_JFileChooserDemo();
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
// fim da classe JFileChooserTest