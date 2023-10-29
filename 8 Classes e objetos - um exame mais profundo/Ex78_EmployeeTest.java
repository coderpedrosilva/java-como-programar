// Figura 8.13: EmployeeTest.java
// Demonstração do membro static.

public class Ex78_EmployeeTest {
    public static void main(String[] args) {
        // mostra que a contagem é 0 antes de criar Employees
        System.out.printf("Employees before instantiation: %d%n",
                Ex77_Employee.getCount());

        // cria dois Employees; a contagem deve ser 2
        Ex77_Employee e1 = new Ex77_Employee("Susan", "Baker");
        Ex77_Employee e2 = new Ex77_Employee("Bob", "Blue");

        // mostra que a contagem é 2 depois de criar dois Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n",
                Ex77_Employee.getCount());

        // obtém nomes de Employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
} // fim da classe EmployeeTest