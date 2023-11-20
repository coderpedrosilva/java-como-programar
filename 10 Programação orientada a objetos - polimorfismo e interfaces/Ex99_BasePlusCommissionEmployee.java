// Figura 10.8: BaseplusCommissionEmployee.java
// Classe BasePlusCommissionEmployee estende a CommissionEmployee.

public class Ex99_BasePlusCommissionEmployee extends Ex98_CommissionEmployee {
    private double baseSalary; // salário de base por semana

    // construtor
    public Ex99_BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // configura o salário-base
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os vencimentos; sobrescreve o método earnings em CommissionEmployee
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
} // fim da classe BasePlusCommissionEmployee