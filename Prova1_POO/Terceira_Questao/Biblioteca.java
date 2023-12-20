package Terceira_Questao;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class Biblioteca {

    private String nome;
    private String endereço;
    private List<Livro> livros;

    public Biblioteca(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public Livro[] listarLivros() {
        return this.livros.toArray(new Livro[0]);
    }

    public int quantidadeLivros() {
        return this.livros.size();
    }

    public int quantidadeLivros(int ano) {
        int quantidade = 0;
        for (Livro livro : this.livros) {
            if (livro.getAnoPublicacao() == ano) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public String[] autores() {
        Set<String> autores = new HashSet<>();
        for (Livro livro : this.livros) {
            autores.add(livro.getAutor());
        }
        return autores.toArray(new String[0]);
    }

   
    public String toString() {
        return  this.nome + " " + this.endereço + " " + this.livros;
    }
}
