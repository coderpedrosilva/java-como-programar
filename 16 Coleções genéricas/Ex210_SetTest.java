
// Figura 16.16: SetTest.java
// HashSet utilizado para remover valores duplicados do array de strings.
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {
    public static void main(String[] args) {
        // cria e exibe uma List<String>
        String[] colors = { "red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange" };
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        // elimina duplicatas, então imprime os valores únicos
        printNonDuplicates(list);
    }

    // cria um Set de uma coleção para eliminar duplicatas
    private static void printNonDuplicates(Collection<String> values) {
        // cria um HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set)
            System.out.printf("%s ", value);

        System.out.println();
    }
} // fim da classe SetTest