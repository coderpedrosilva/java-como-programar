
// Figura 4.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class Ex21_DrawPanelTest {
    public static void main(String[] args) {
        // cria um painel que contém nosso desenho
        Ex20_DrawPanel panel = new Ex20_DrawPanel();

        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); // adiciona o painel ao frame
        application.setSize(250, 250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visível
    }
} // fim da classe DrawPanelTest