// Figura 8.10: Book.java
// Declarando um tipo enum com um construtor e campos de instância explícitos
// e métodos de acesso para esses campos

public enum Ex75_Book {
    // declara constantes do tipo enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // campos de instância
    private final String title; // título de livro
    private final String copyrightYear; // ano dos direitos autorais

    // construtor enum
    Ex75_Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    // acessor para título de campo
    public String getTitle() {
        return title;
    }

    // acessor para o campo copyrightYear
    public String getCopyrightYear() {
        return copyrightYear;
    }
} // fim do enum Book