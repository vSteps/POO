package Terceira_Questao;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Leonardo Reis Lucena", "Rua da Alegria, 934");

        Livro livro1 = new Livro("Harry Potter e a Câmara Secreta", "J.K Rowling", 1998);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling", 1997);
        Livro livro3 = new Livro("As Crônicas de Nárnia", "C.S. Lewis", 1950);
        Livro livro4 = new Livro("Cartas de um Diabo ao seu aprendiz", "C.S. Lewis", 1942);
        Livro livro5 = new Livro("Meu Livro", "Victor Passos", 1950);

        


        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        System.out.println(biblioteca);
        biblioteca.removerLivro(livro1);
        System.out.println(biblioteca);

        System.out.println("Quantidade de livros: " + biblioteca.quantidadeLivros());
        System.out.println("Quantidade de livros publicados em 1950: " + biblioteca.quantidadeLivros(1950));
        System.out.println("Autores: " + Arrays.toString(biblioteca.autores()));
    }
}
