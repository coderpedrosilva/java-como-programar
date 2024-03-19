// Figura 8.7: Date.java
// Declaração da classe Date.

public class Ex72_Date {
    private int month; // 1-12
    private int day; // 1-31 conforme o mês
    private int year; // qualquer ano

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // construtor: confirma o valor adequado para o mês e dia dado o ano
    public Ex72_Date(int month, int day, int year) {
        // verifica se mês está no intervalo
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        // verifica se day está no intervalo para month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        // verifique no ano bissexto se o mês é 2 e o dia é 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Date object constructor for date %s%n", this);
    }

    // retorna uma String no formato mês/dia/ano
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
} // fim da classe Date
