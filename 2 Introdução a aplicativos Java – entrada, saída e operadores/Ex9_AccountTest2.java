// Figura 3.6: AccountTest.Java
// Usando o construtor de Account para inicializar a instância name
// variável no momento em que cada objeto Account é criado.

public class Ex9_AccountTest2 {
    public static void main(String[] args) {

        // cria dois objetos Account ÿ
        Ex7_Account account1 = new Ex7_Account("Jane Green");
        Ex7_Account account2 = new Ex7_Account("John Blue");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
} // fim da classe AccountTest