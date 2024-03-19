// Figura 9.8: BaseplusCommissionEmployee.java
// Membros private da superclasse não podem ser acessados em uma subclasse.
public class Ex89_BasePlusCommissionEmployee extends Ex85_CommissionEmployee {
    private double baseSalary; // salário-base por semana

    // construtor de seis argumentos
    public Ex89_BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        // chamada explícita para o construtor CommissionEmployee da superclasse
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override
    public double earnings() {
        // não permitido: commissionRate e grossSales privado em superclasse
        return baseSalary + (commissionRate * grossSales);
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override
    public String toString() {
        // não permitido: tenta acessar membros private da superclasse
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "commission rate", commissionRate,
                "base salary", baseSalary);
    }
} // fim da classe BasePlusCommissionEmployee