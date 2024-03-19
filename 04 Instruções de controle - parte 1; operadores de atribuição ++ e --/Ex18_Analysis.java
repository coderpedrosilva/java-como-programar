
// Figura 4.12: Analysis.java
// Análise dos resultados do exame utilizando instruções de controle aninhadas.
import java.util.Scanner; // classe utiliza a classe Scanner

public class Ex18_Analysis {
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // inicializando variáveis nas declarações
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // processa 10 alunos utilizando o loop controlado por contador
        while (studentCounter <= 10) {
            // solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else está aninhado na instrução while
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;

            // incrementa studentCounter até o loop terminar
            studentCounter = studentCounter + 1;
        }

        // fase de término; prepara e exibe os resultados
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determina se mais de 8 alunos foram aprovados
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
} // fim da classe Analysis