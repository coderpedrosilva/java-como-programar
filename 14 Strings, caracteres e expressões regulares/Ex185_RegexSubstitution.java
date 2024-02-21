
// Figura 14.23: RegexSubstitution.Java
// Métodos string replaceFirst, replaceAll e split.
import java.util.Arrays;

public class Ex185_RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original String 1: %s%n", firstString);

        // substitui '*' por '^'
        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *: %s%n", firstString);

        // substitui asteriscos por circunflexos
        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf(
                "\"carets\" substituted for \"stars\": %s%n", firstString);

        // substitui palavras por 'palavra'
        System.out.printf("Every word replaced by \"word\": %s%n%n",
                firstString.replaceAll("\\w+", "word"));

        System.out.printf("Original String 2: %s%n", secondString);

        // substitui os primeiros três dígitos pelo 'dígito'
        for (int i = 0; i < 3; i++)
            secondString = secondString.replaceFirst("\\d", "digit");

        System.out.printf(
                "First 3 digits replaced by \"digit\" : %s%n", secondString);

        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*"); // divide em vírgulas
        System.out.println(Arrays.toString(results));
    }
} // fim da classe RegexSubstitution