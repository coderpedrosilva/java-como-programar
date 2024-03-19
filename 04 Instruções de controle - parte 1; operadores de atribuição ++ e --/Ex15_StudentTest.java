// Figura 4.5: StudentTest.java
// Cria e testa objetos Student.
public class Ex15_StudentTest {
    public static void main(String[] args) {
        Ex14_Student account1 = new Ex14_Student("Jane Green", 93.5);
        Ex14_Student account2 = new Ex14_Student("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account2.getName(), account2.getLetterGrade());
    }
} // fim da classe StudentTest