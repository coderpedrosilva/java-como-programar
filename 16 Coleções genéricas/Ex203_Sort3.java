
// Figura 16.9: Sort3.java
// Método sort de Collections com um objeto Comparator personalizado.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex203_Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>(); // cria List

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        // gera saída de elementos List
        System.out.printf("Unsorted array elements:%n%s%n", list);

        // classifica em ordem utilizando um comparador ÿ
        Collections.sort(list, new TimeComparator());

        // gera saída de elementos List
        System.out.printf("Sorted list elements:%n%s%n", list);
    }
} // fim da classe Sort3
