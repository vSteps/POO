package Prova2_POO.Questao4;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
public class Livro extends itemBiblioteca implements Emprestavel{

 public List<String> autores;

    public Livro(int id, String titulo, List<String> autores){
        super(titulo, id);
        this.autores = new ArrayList<>();
    }

    public void exibirAutores() {
        System.out.println("Autores: " + this.autores);
    }

    @Override
    public void emprestar() throws ItemEmprestadoException{
        if (estaEmprestado()){
            throw new ItemEmprestadoException("O livro já está emprestado");    
        }
        setEstado("O item está emprestado");
       
    }
    @Override
    public void devolver() throws ItemEmprestadoException{
        if (!estaEmprestado()){
        throw new ItemEmprestadoException("Não é possível devolver o livro pois ele está disponível.");    
        }
        setEstado("O item está disponível");
    }

    @Override
    public boolean estaEmprestado() {
        if (getEstado().equals("O item está emprestado")){
            return true;
        }
        return false;
    }

    
}
 