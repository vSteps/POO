package Projeto_POO;

import java.util.List;

public class Aluno {
    protected List<Disciplina> disciplinas;
    
    private String nome;
    private String matricula;



    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
      }
    
      public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
      }
      
    public String getNomeAluno(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

}
