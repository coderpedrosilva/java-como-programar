
// Figura 11.3: DivideByZeroWithExceptionHandling.java
// Tratando ArithmeticExceptions e InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex107_DivideByZeroWithExceptionHandling {
    // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        return numerator / denominator; // possível divisão por zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determina se mais entradas são necessárias

        do {
            try // lê dois números e calcula o quociente
            {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false; // entrada bem-sucedida; fim do loop
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);
    }
} // fim da classe DivideByZeroWithExceptionHandling