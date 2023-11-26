// Figura 10.15: PayableInterfaceTest.java
// Programa de teste da interface Payable que processa Invoices e
// Employees polimorficamente.
public class Ex105_PayableInterfaceTest {
    public static void main(String[] args) {
        // cria array Payable de quatro elementos
        Ex101_Payable[] payableObjects = new Ex101_Payable[4];

        // preenche o array com objetos que implementam Payable
        payableObjects[0] = new Ex102_Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Ex102_Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new Ex104_SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new Ex104_SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println(
                "Invoices and Employees processed polymorphically:");

        // processa genericamente cada elemento no array payableObjects
        for (Ex101_Payable currentPayable : payableObjects) {
            // gera saída de currentPayable e sua quantia de pagamento apropriado
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(), // poderia invocar implicitamente
                    "payment due", currentPayable.getPaymentAmount());
        }
    } // fim de main
} // fim da classe PayableInterfaceTest