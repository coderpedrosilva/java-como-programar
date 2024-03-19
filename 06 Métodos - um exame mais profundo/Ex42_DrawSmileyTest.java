
// Figura 6.12: DrawSmileyTest.java
// Aplicativo de teste que exibe um rosto sorridente.
import javax.swing.JFrame;

public class Ex42_DrawSmileyTest {
    public static void main(String[] args) {
        Ex41_DrawSmiley panel = new Ex41_DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
} // fim da classe DrawSmileyTest