// Figura 8.15: PackageDataTest.java
// Membros de acesso de pacote de uma classe permanecem acessíveis a outras classes
// no mesmo pacote.

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        // gera saída da representação String de packageData
        System.out.printf("After instantiation:%n%s%n", packageData);

        // muda os dados de acesso de pacote no objeto packageDataÿ
        packageData.number = 77;
        packageData.string = "Goodbye";

        // gera saída da representação String de packageData
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
} // fim da classe PackageDataTest

// classe com variáveis de instância de acesso de pacote
class PackageData {
    int number; // variável de instância de acesso de pacote ÿ
    String string; // variável de instância de acesso de pacoteÿ

    // construtor
    public PackageData() {
        number = 0;
        string = "Hello";
    }

    // retorna a representação String do objeto PackageData
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
} // fim da classe PackageData