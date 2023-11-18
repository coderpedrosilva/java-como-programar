// Figura 10.5: SalariedEmployee.java
// A classe concreta SalariedEmployee estende a classe abstrata Employee.

public class Ex96_SalariedEmployee extends Ex95_Employee {
    private double weeklySalary;

    // construtor
    public Ex96_SalariedEmployee(String firstName, String lastName,
            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // configura o salário
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // retorna o salário
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employeeÿ
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // retorna a representação String do objeto SalariedEmployee ÿ
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
} // fim da classe SalariedEmployee