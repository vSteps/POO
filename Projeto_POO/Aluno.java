package Projeto_POO;

import java.util.List;
import java.util.ArrayList;

public class Aluno{


    private String nome;
    private int matricula;
    private ArrayList<Notas> boletim;




    public int getMatriculaAluno(){
        return this.matricula;
    }
    public String getNomeAluno(){
        return this.nome;
    }
    public ArrayList<Notas> getBoletim(){
        return this.boletim;
    }
    public void setBoletim(Notas disciplina) {
        this.boletim.add(disciplina);
    }
    
   public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.boletim = new ArrayList<>();
    }
    


    public void ListarDisciplinas(){
            for(int x = 0; x < boletim.size();x++){
                System.out.println(boletim.get(x).getDisciplina()+"\n");
            }
    }
}
