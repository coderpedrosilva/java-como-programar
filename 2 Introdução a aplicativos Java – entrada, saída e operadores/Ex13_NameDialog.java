
// Figura 3.13: NameDialog.Java
// Obtendo a entrada de usuário a partir de um diálogo.
import javax.swing.JOptionPane;

public class Ex13_NameDialog {
    public static void main(String[] args) {
        // pede para o usuário inserir seu nome ÿ
        String name = JOptionPane.showInputDialog("What is your name?");

        // cria a mensagemÿ
        String message = String.format("Welcome, %s, to Java Programming!", name);

        // exibe a mensagem para cumprimentar o usuário pelo nomeÿ
        JOptionPane.showMessageDialog(null, message);
    } // fim de main
} // termina NameDialog