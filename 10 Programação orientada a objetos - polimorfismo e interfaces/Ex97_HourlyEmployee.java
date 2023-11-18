// Figura 10.6: HourlyEmployee.java
// Classe HourlyEmployee estende Employee.

public class Ex97_HourlyEmployee extends Ex95_Employee {
    private double wage; // salário por hora
    private double hours; // horas trabalhadas durante a semana

    // construtor
    public Ex97_HourlyEmployee(String firstName, String lastName,
            String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) // valida remuneração
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");

        if ((hours < 0.0) || (hours > 168.0)) // valida horas
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }

    // configura a remuneração
    public void setWage(double wage) {
        if (wage < 0.0) // valida remuneração
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    // retorna a remuneração
    public double getWage() {
        return wage;
    }

    // configura as horas trabalhadas
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) // valida horas
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }

    // retorna as horas trabalhadas
    public double getHours() {
        return hours;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double earnings() {
        if (getHours() <= 40) // nenhuma hora extra
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    // retorna a representação de String do objeto HourlyEmployee
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
} // fim da classe HourlyEmployee
