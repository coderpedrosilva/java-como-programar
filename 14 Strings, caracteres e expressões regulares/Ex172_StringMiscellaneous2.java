// Figura 14.8: StringMiscellaneous2.java
// Métodos String replace, toLowerCase, toUpperCase, trim e toCharArray.

public class Ex172_StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = " spaces ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        // testa o método replace
        System.out.printf(
                "Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

        // testa o toLowerCase e toUpperCase
        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());

        // testa o método trim
        System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());

        // testa o método toCharArray
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
} // fim da classe StringMiscellaneous2