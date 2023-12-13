package Projeto_POO;

import java.util.List;

public class SistemaEscolar {
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;


    public Aluno cadastrarAluno(Aluno aluno)  {}
    public Disciplina cadastrarDisciplina(Disciplina disciplina)  {}
    public Professor cadastrarProfessor(Professor professor)  {}
    public boolean inserirAlunoEmDisciplina(Aluno aluno, Disciplina disciplina)  {}
    public boolean removerAlunoDaDisciplina(Aluno aluno, Disciplina disciplina)  {}
    public boolean atribuirDisciplinaAoProfessor(Professor professor, Disciplina disciplina)  {}
    public boolean removerDisciplinaDoProfessor(Professor professor, Disciplina disciplina)  {}



    public Nota registrarNota(Nota nota, Aluno aluno){}
    public Nota alterarNota(Nota nota, Aluno aluno){}
    
    

    public float calcularNotaFinal(Nota nota, Aluno aluno, Disciplina disciplina){}
    public boolean verificarAprovação(Nota nota, Aluno aluno, Disciplina disciplina){}
    public String emitirBoletim(Nota nota, Aluno aluno, Disciplina disciplina){}
}
