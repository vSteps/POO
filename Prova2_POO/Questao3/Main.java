package Prova2_POO.Questao3;
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Câmara Secreta", "J.K. Rowling", 1998);
        try {
            System.out.println(livro.imprimir());
        } catch (AnoPublicacaoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
