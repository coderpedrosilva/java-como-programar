// Figura 11.7: UsingChainedExceptions.java
// Exceções encadeadas.

public class Ex110_UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) // exceções lançadas de method1
        {
            exception.printStackTrace();
        }
    }

    // chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        try {
            method2();
        } // fim do try
        catch (Exception exception) // exceção lançada de method2
        {
            throw new Exception("Exception thrown in method1", exception);
        }
    }

    // chama method3; lança exceções de volta para method1
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) // exceção lançada de method3
        {
            throw new Exception("Exception thrown in method2", exception);
        }
    }

    // lança Exception de volta para method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
} // fim da classe UsingChainedExceptions