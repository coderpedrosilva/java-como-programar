// Figura 10.13: Employee.java
// Superclasse abstrata Employee que implementa Payable.
public abstract class Ex103_Employee implements Ex101_Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor
    public Ex103_Employee(String firstName, String lastName,
            String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

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

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // Observação: não implementamos o método getPaymentAmount de Payable aqui,
    // assim
    // essa classe deve ser declarada abstrata para evitar um erro de compilação.
} // fim da classe abstrata Employee