// Figura 8.6: Time2Test.java
// Construtores sobrecarregados utilizados para inicializar objetos Time2.

public class Ex71_Time2Test {
    public static void main(String[] args) {
        Ex70_Time2 t1 = new Ex70_Time2(); // 00:00:00
        Ex70_Time2 t2 = new Ex70_Time2(2); // 02:00:00
        Ex70_Time2 t3 = new Ex70_Time2(21, 34); // 21:34:00
        Ex70_Time2 t4 = new Ex70_Time2(12, 25, 42); // 12:25:42
        Ex70_Time2 t5 = new Ex70_Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // tenta inicializar t6 com valores inválidos
        try {
            Ex70_Time2 t6 = new Ex70_Time2(27, 74, 99); // valores inválidos
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }
    }

    // exibe um objeto Time2 nos formatos de 24 horas e 12 horas
    private static void displayTime(String header, Ex70_Time2 t) {
        System.out.printf("%s%n %s%n %s%n",
                header, t.toUniversalString(), t.toString());
    }
} // fim da classe Time2Test