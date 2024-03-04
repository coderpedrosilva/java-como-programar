
// Figura 16.3: ListTest.java
// Lists, LinkedLists e ListIterators.
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex198_ListTest {
    public static void main(String[] args) {
        // adiciona elementos colors à list1
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        List<String> list1 = new LinkedList<>();

        for (String color : colors)
            list1.add(color);

        // adiciona elementos colors2 à list2
        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
        List<String> list2 = new LinkedList<>();

        for (String color : colors2)
            list2.add(color);

        list1.addAll(list2); // concatena as listas
        list2 = null; // libera recursos
        printList(list1); // imprime elementos list1

        convertToUppercaseStrings(list1); // converte em string de letras maiúsculas
        printList(list1); // imprime elementos list1

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove itens 4 a 6 da lista
        printList(list1); // imprime elementos list1
        printReversedList(list1); // imprime lista na ordem inversa
    }

    // gera saída do conteúdo de List
    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");

        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }

    // localiza objetos String e converte em letras maiúsculas
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next(); // obtém o item
            iterator.set(color.toUpperCase()); // converte em letras maiúsculas
        }
    }

    // obtém sublista e utiliza método clear para excluir itens da sublista
    private static void removeItems(List<String> list,
            int start, int end) {
        list.subList(start, end).clear(); // remove os itens
    }

    // imprime lista invertida
    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        // imprime lista na ordem inversa
        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
} // fim da classe ListTest