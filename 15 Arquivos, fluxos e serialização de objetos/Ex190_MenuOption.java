// Figura 15.7: MenuOption.Java
// tipo enum para as opções do programa de consulta de crédito.

public enum Ex190_MenuOption {
    // declara o conteúdo do tipo enum
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value; // opção atual de menu

    // construtor
    private Ex190_MenuOption(int value) {
        this.value = value;
    }
} // fim do enum de MenuOption
