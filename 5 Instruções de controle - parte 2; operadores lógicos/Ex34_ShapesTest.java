// Figura 5.28: ShapesTest.java
// Obtendo a entrada de usuário e criando um JFrame para exibir Shapes.

import javax.swing.JFrame; // manipula a exibição

import javax.swing.JOptionPane;

public class Ex34_ShapesTest {

    public static void main(String[] args) {
        // obtém a escolha do usuário
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n " +
                        "Enter 2 to draw ovals");

        int choice = Integer.parseInt(input); // converte a entrada em int

        // cria o painel com a entrada do usuário
        Ex33_Shapes panel = new Ex33_Shapes(choice);

        JFrame application = new JFrame(); // cria um novo JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
} // fim da classe ShapesTest