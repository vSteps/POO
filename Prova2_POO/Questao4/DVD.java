package Prova2_POO.Questao4;

import java.util.ArrayList;
import java.util.List;

public class DVD extends itemBiblioteca implements Emprestavel {
     public List<String> diretores;

    public DVD(int id, String titulo, List<String> diretores){
        super(titulo, id);
        this.diretores = new ArrayList<>();
    }
    
    public void exibirDiretores() {
        System.out.println("Diretores: " + this.diretores);
    }

    @Override
    public void emprestar() throws ItemEmprestadoException{
        if (estaEmprestado()){
            throw new ItemEmprestadoException("O DVD já está emprestado");    
        }
        setEstado("O item está emprestado");
       
    }
    @Override
    public void devolver() throws ItemEmprestadoException{
        if (!estaEmprestado()){
        throw new ItemEmprestadoException("Não é possível devolver o DVD pois ele está disponível.");    
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
