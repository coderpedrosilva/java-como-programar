// Figura 7.21: InitArray.java
// Inicializando um array com argumentos de linha de comando.
public class Ex61_InitArray {
    public static void main(String[] args) {
        // verifica número de argumentos de linha de comando
        if (args.length != 3)
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n" +
                            "an array size, initial value and increment.%n");
        else {
            // obtém o tamanho do array a partir do primeiro argumento de linha de comando
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // obtém o valor inicial e o incrementa a partir dos argumentos de linha de
            // comando
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calcula valor de cada elemento do array ÿ
            for (int counter = 0; counter < array.length; counter++)
                array[counter] = initialValue + increment * counter;

            System.out.printf("%s%8s%n", "Index", "Value");

            // exibe o valor e o índice de array
            for (int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
} // fim da classe InitArray