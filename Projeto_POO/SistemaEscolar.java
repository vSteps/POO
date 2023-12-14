package Projeto_POO;

import java.util.List;
import java.util.ArrayList;

public class SistemaEscolar {
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;


    public SistemaEscolar(){
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();

        }

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }


    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void removerDiscplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }


    public void cadastrarProfessor(Professor professor){
        professores.add(professor);
    }
    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }


    public Aluno getAluno(String matriculaAluno){
        for(Aluno aluno : alunos){
            return aluno;
        }
        return null;
    }

    public Disciplina getDisciplina(String nomeDisciplina){
        for(Disciplina disciplina : disciplinas){
            return disciplina;
        }
        return null;
    }


    public String inserirAlunoEmDisciplina(Aluno aluno, Disciplina disciplina){
        if (disciplina.isPresent(aluno)){
            return "O(A) aluno(a) já está nessa disciplina!";
     }
        else{
            aluno.disciplinas.add(disciplina);
            disciplina.alunos.add(aluno);
            return "O(A) aluno(a) foi inserido(a) na disciplina!";
            
        }
    }
    public String removerAlunoDaDisciplina(Aluno aluno, Disciplina disciplina){
          if (!disciplina.isPresent(aluno)){
            return "O(A) aluno(a) não paga essa disciplina!";
     }
        else{
            aluno.disciplinas.remove(disciplina);
            disciplina.alunos.remove(aluno);
            return "O(A) aluno(a) foi removido(a) da disciplina!";
            
        }
    }


    public String atribuirDisciplinaAoProfessor(Professor professor, Disciplina disciplina){
        if (professor.disciplinas.contains(disciplina)){
            return "Ele(a) já é professor(a) dessa matéria";
        }
        disciplina.professores.add(professor);
        professor.disciplinas.add(disciplina);
        return "Esse(a) professor(a) lecionará essa matéria agora!";
    }
    public String removerDisciplinaDoProfessor(Professor professor, Disciplina disciplina){
        if (!professor.disciplinas.contains(disciplina)){
            return "Ele(a) não é professor(a) dessa matéria";
        }
        disciplina.professores.remove(professor);
        professor.disciplinas.remove(disciplina);
        return "Esse(a) professor(a) não lecionará mais essa matéria!";
    }
    
    public String listarAlunos(){}
    public String listarDisciplinas(){}
    public String getBoletim(){}


}
