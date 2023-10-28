
// Figura 8.11: EnumTest.java
// Testando o tipo enum Book.
import java.util.EnumSet;

public class Ex76_EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:");

        // imprime todos os livros em enum Book
        for (Ex75_Book book : Ex75_Book.values())
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());

        System.out.printf("%nDisplay a range of enum constants:%n");

        // imprime os primeiros quatro livros
        for (Ex75_Book book : EnumSet.range(Ex75_Book.JHTP, Ex75_Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
    }
} // fim da classe EnumTest