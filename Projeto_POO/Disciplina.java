package Projeto_POO;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Disciplina {
    protected List<Aluno> alunos;
    protected List<Professor> professores;
    private String nome;
    private Professor professor;
    private Map<Aluno, Nota> map;

    public Disciplina(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
        this.map = new HashMap<>();
    }

       public Disciplina(String nome){
        this.nome = nome;
        this.professor = null;
        this.map = new HashMap<>();
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
      }
    
      public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
      }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public boolean isPresent(Aluno aluno){
        if (this.map.containsKey(aluno)){
            return true;
        } 
        return false;
    }

    public void inserirAluno(Aluno aluno, Nota nota){
        this.map.put(aluno, nota);

    }

    public void removerAluno(Aluno aluno){
        this.map.remove(aluno);
    }

    public Nota getNotas(Aluno aluno){
        return map.get(aluno);
    }    


    public int getMedia(Aluno aluno){
        Nota notas = map.get(aluno);
        int media = (notas.getProvaUm() * 2 + notas.getProvaDois() * 3)/5;
        return media;
    }

    public void inserirNotaFinal(Aluno aluno, int notaFinal){
        Nota notas = map.get(aluno);
        notas.setProvaFinal(notaFinal);

    }


    public int getMediaFinal(Aluno aluno){
        Nota notas = map.get(aluno);
        int mediaFinal = (this.getMedia(aluno) + notas.getProvaFinal())/2;
        return mediaFinal;
    }


    public boolean aprovado(Aluno aluno){
        if (this.getMedia(aluno) >= 60){
        return true;
    }
    return false;

    }

    public boolean aprovadoMediaFinal(Aluno aluno){
        if (this.getMediaFinal(aluno) >= 60){
            return true;
        }
        return false;
    }
}


