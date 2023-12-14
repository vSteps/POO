package Projeto_POO;

import java.util.List;

public class Professor {
    protected List<Disciplina> disciplinas;
    private String nome;


    public Professor(String nome){
        this.nome = nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
}
