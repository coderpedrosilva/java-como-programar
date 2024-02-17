// Figura 14.17: OtherCharMethods.java
// Métodos de instância da classe Character.
public class Ex181_OtherCharMethods {
    public static void main(String[] args) {
        Character c1 = 'A';
        Character c2 = 'a';

        System.out.printf(
                "c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.toString());

        if (c1.equals(c2))
            System.out.println("c1 and c2 are equal%n");
        else
            System.out.println("c1 and c2 are not equal%n");
    }
} // fim da classe OtherCharMethods