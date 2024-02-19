
// Figura 14.21: Validate.java
// Insere e valida os dados do usuário usando a classe ValidateInput.
import java.util.Scanner;

public class Ex184_Validate {
    public static void main(String[] args) {
        // obtém entrada de usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();

        // valida a entrada de usuário e exibe mensagem de erro
        System.out.println("%nValidate Result:");

        if (!Ex183_ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!Ex183_ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!Ex183_ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if (!Ex183_ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!Ex183_ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if (!Ex183_ValidateInput.validateZip(zip))
            System.out.println("Invalid zip code");
        else if (!Ex183_ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input. Thank you.");
    }
} // fim da classe Validate