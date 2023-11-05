// Figura 9.4: CommissionEmployee.java
// A classe CommissionEmployee representa um empregado que recebeu um
// percentual das vendas brutas.
public class Ex85_CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // percentagem da comissão

    // construtor de cinco argumentos
    public Ex85_CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate) {
        // a chamada implícita para o construtor padrão de Object ocorre aqui

        // se grossSales é inválido, lança uma exceção
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // fim do construtor

    // retorna o nome
    public String getFirstName() {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna o número de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // calcula os lucros ÿ
    public double earnings() {
        return commissionRate * grossSales;
    }

    // retorna a representação String do objeto CommissionEmployee
    @Override // indica que esse método substitui um método da superclasse
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
} // fim da classe CommissionEmployee