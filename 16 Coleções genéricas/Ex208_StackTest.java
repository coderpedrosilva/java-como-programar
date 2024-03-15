
// Figura 16.14: StackTest.java
// classe Stack do pacote java.util.
import java.util.Stack;
import java.util.EmptyStackException;

public class Ex208_StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>(); // cria uma Stack

        // utiliza método push
        stack.push(12L); // insere o valor long 12L
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567); // insere o valor int 34567ÿ
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F); // insere o valor float 1.0Fÿ
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678); // insere o valor double 1234.5678ÿ
        System.out.println("Pushed 1234.5678 ");
        printStack(stack);

        // remove itens de pilha
        try {
            Number removedObject = null;

            // remove elementos da pilha
            while (true) {
                removedObject = stack.pop(); // utiliza método popÿ
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    // exibe o conteúdo de Stack
    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty())
            System.out.printf("stack is empty%n%n"); // a pilha está vazia
        else // a pilha não está vazia
            System.out.printf("stack contains: %s (top)%n", stack);
    }
} // fim da classe StackTest