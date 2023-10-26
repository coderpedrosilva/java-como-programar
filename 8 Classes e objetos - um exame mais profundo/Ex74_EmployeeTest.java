// Figura 8.9: EmployeeTest.java
// Demonstração de composição.

import java.time.LocalDate;
import java.time.Month;

public class Ex74_EmployeeTest {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1949, Month.JULY, 24);
        LocalDate hire = LocalDate.of(1988, Month.MARCH, 12);
        Ex73_Employee employee = new Ex73_Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
} // fim da classe EmployeeTest