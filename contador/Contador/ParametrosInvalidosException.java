package contador.Contador;

public class ParametrosInvalidosException extends Exception {
    
    // Construtor sem parâmetros
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos!"); // Mensagem padrão
    }

    // Construtor que aceita uma mensagem personalizada
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
