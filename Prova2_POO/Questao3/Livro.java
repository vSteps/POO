package Prova2_POO.Questao3;
import java.lang.String;
public class Livro implements Imprimivel{

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao)  {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() throws AnoPublicacaoInvalidoException  {
        if (anoPublicacao < 1000 | anoPublicacao > 2023){
                throw new AnoPublicacaoInvalidoException("O ano de publicação do Livro é inválido");
            }
        
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }


    @Override
    public String imprimir() throws AnoPublicacaoInvalidoException{
        return "O livro é " + getTitulo() + "\nPublicado em " + getAnoPublicacao() + "\nPelo(a) autor(a) " + getAutor() + ".";
    }
    public String toString(){
        return this.titulo + " " + this.autor + " " + this.anoPublicacao;
    
    }

    
}
