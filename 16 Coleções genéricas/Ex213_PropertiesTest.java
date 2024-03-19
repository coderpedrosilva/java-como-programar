
// Figura 16.19: PropertiesTest.java
// Demonstra classe Properties do pacote java.util.
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Ex213_PropertiesTest {
    public static void main(String[] args) {
        Properties table = new Properties();

        // configura propriedades
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // substitui o valor de propriedade
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);

        table.clear(); // tabela vazia

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        // obtém valor de cor da propriedade
        Object value = table.getProperty("color");

        // verifica se o valor está na tabela
        if (value != null)
            System.out.printf("Property color's value is %s%n", value);
        else
            System.out.println("Property color is not in table");
    }

    // salva as propriedades em um arquivo
    private static void saveProperties(Properties props) {
        // salva o conteúdo de tabela
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // salva as propriedades
            output.close();
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // carrega as propriedades de um arquivo
    private static void loadProperties(Properties props) {
        // carrega o conteúdo de tabela
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input); // carrega propriedades
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // gera saída de valores de propriedade
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); // obtém nomes de propriedade

        // gera saída de pares nome/valor
        for (Object key : keys)
            System.out.printf(
                    "%s\t%s%n", key, props.getProperty((String) key));

        System.out.println();
    }
} // fim da classe PropertiesTest