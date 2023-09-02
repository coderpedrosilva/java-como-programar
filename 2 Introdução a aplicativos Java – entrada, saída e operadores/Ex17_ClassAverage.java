
// Figura 4.10: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por sentinela.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Ex17_ClassAverage {
    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // fase de inicialização
        int total = 0; // incializa a soma das notas
        int gradeCounter = 0; // inicializa o nº de notas inseridas até agora

        // fase de processamento
        // solicita entrada e lê a nota do usuário
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        // faz um loop até ler o valor de sentinela inserido pelo usuário
        while (grade != -1) {
            total = total + grade; // adiciona grade a total
            gradeCounter = gradeCounter + 1; // incrementa counter

            // solicita entrada e lê a próxima nota fornecida pelo usuário
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // fase de término
        // se usuário inseriu pelo menos uma nota...
        if (gradeCounter != 0) {
            // usa número com ponto decimal para calcular média das notas
            double average = (double) total / gradeCounter;

            // exibe o total e a média (com dois dígitos de precisão)
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
            System.out.println("No grades were entered");
    }
} // fim da classe ClassAverage
