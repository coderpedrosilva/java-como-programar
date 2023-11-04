
// Figura 8.19: TestDraw.java
// Criando um JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class Ex84_TestDraw {
    public static void main(String[] args) {
        Ex83_DrawPanel panel = new Ex83_DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
} // fim da classe TestDraw