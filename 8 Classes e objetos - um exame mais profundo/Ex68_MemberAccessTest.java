// Figura 8.3: MemberAccessTest.java
// Membros privados da classe Time1 não são acessíveis.
public class Ex68_MemberAccessTest {
    public static void main(String[] args) {
        Ex66_Time1 time = new Ex66_Time1(); // cria e inicializa o objeto Time1

        time.hour = 7; // erro: hour tem acesso privado em Time1
        time.minute = 15; // erro: minute tem acesso privado em Time1
        time.second = 30; // erro: second tem acesso privado em Time1
    }
} // fim da classe MemberAccessTest