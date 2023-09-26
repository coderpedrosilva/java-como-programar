// Figura 7.4: InitArray.java
// Calculando os valores a serem colocados nos elementos de um array.

public class InitArray {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declara constante
        int[] array = new int[ARRAY_LENGTH]; // cria o arrayÿ

        // calcula valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
} // fim da classe InitArray