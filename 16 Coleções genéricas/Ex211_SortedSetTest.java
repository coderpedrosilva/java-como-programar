
// Figura 16.17: SortedSetTest.java
// Usando SortedSets e TreeSets.
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex211_SortedSetTest {
    public static void main(String[] args) {
        // cria TreeSet a partir do array colors
        String[] colors = { "yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green" };
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree);

        // obtém headSet com base em "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));

        // obtém tailSet baseado em "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));
        // obtém primeiro e último elementos
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());
    }

    // envia SortedSet para a saída usando a instrução for aprimorada
    private static void printSet(SortedSet<String> set) {
        for (String s : set)
            System.out.printf("%s ", s);

        System.out.println();
    }
} // fim da classe SortedSetTest