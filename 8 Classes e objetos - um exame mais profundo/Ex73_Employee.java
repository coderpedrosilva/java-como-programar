// Figura 8.8: Employee.java
// Classe Employee com referência a outros objetos.

import java.time.LocalDate;

public class Ex73_Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate hireDate;

    // construtor para inicializar nome, data de nascimento e data de contratação
    public Ex73_Employee(String firstName, String lastName, LocalDate birthDate, LocalDate hireDate) {
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
