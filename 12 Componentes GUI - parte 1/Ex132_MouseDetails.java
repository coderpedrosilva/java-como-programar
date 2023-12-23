
// Figura 12.32: MouseDetails.java
// Testando MouseDetailsFrame.
import javax.swing.JFrame;

public class Ex132_MouseDetails {
    public static void main(String[] args) {
        Ex131_MouseDetailsFrame mouseDetailsFrame = new Ex131_MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150);
        mouseDetailsFrame.setVisible(true);
    }
} // fim da classe MouseDetails