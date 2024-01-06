
// Figura 12.48: TextAreaDemo.java
// Testando TextAreaFrame.
import javax.swing.JFrame;

public class Ex146_TextAreaDemo {
    public static void main(String[] args) {
        Ex145_TextAreaFrame textAreaFrame = new Ex145_TextAreaFrame();
        textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaFrame.setSize(425, 200);
        textAreaFrame.setVisible(true);
    }
} // fim da classe TextAreaDemo