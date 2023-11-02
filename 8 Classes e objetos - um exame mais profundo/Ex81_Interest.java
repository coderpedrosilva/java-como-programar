
// Interest.java
// Cálculos de juros compostos com BigDecimal.
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String args[]) {
        // quantidade principal inicial antes dos juros ÿ
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05); // taxa de jurosÿ

        // exibe cabeçalhos
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calcula quantidade de depósito para cada um dos dez anos
        for (int year = 1; year <= 10; year++) {
            // calcula nova quantidade durante ano especificado ÿ
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            // exibe o ano e a quantidade
            System.out.printf("%4d%20s%n", year,
                    NumberFormat.getCurrencyInstance().format(amount));
        }
    }
} // fim da classe Interest