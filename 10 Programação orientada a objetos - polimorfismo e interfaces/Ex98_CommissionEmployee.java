// Figura 10.7: CommissionEmployee.java
// Classe CommissionEmployee estende Employee.

public class Ex98_CommissionEmployee extends Ex95_Employee {
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comissão

    // construtor
    public Ex98_CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0) // valida
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) // valida
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // retorna a representação String do objeto CommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
} // fim da classe CommissionEmployee