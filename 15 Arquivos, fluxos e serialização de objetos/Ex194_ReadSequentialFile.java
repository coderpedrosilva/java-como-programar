
// Figura 15.11: ReadSequentialFile.java
// Lendo um arquivo dos objetos sequencialmente com ObjectInputStream
// e exibindo cada registro.
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex194_ReadSequentialFile {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // permite que o usuário selecione o arquivo a abrir
    public static void openFile() {
        // abre o arquivo
        try {
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    // lê o registro no arquivo
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        try {
            while (true) // faz um loop até ocorrer uma EOFException
            {
                Ex192_Account record = (Ex192_Account) input.readObject();

                // exibe o conteúdo de registro
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException endOfFileException) {
            System.out.printf("%No more records%n");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        } catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        }
    } // fim do método readRecords

    // fecha o arquivo e termina o aplicativo
    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
} // fim da classe ReadSequentialFile