// Figura 8.8: Employee.java
// Classe Employee com referência a outros objetos.

public class Ex73_Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // construtor para inicializar nome, data de nascimento e data de contratação
    public Ex73_Employee(String firstName, String lastName, Date birthDate,
            Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // converte Employee em formato de String
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }
} // fim da classe Employee