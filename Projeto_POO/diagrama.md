```mermaid
---
title: Diagrama Projeto Sistema Escolar
---
classDiagram
    SistemaEscolar <|-- Aluno
    SistemaEscolar <|-- Disciplina
    SistemaEscolar <|-- Professor
    SistemaEscolar : - alunos : List<Aluno>
    SistemaEscolar : - disciplinas : List<Disciplina>
    SistemaEscolar : - professores : List<Professor>
    SistemaEscolar : + cadastrarAluno(aluno : Aluno) void
    SistemaEscolar : + removerAluno(aluno : Aluno) void
    SistemaEscolar : + cadastrarDisciplina(disciplina : Disciplina) void
    SistemaEscolar : + removerDisciplina(disciplina : Disciplina) void
    SistemaEscolar : + cadastrarProf(professor : Professor) void
    SistemaEscolar : + removerProf(professor : Professor) void
    SistemaEscolar : + getAluno(matriculaAluno : String) Aluno
    SistemaEscolar : + getDisciplinas(nomeDisciplina) Disciplina
    SistemaEscolar : + inserirAlunoEmDisciplina(aluno : Aluno; disciplina : Disciplina) String
    SistemaEscolar : + removerAlunoDaDisciplina(aluno : Aluno; disciplina : Disciplina) String
    SistemaEscolar : + atribuirDisciplinaAoProfessor(professor : Professor; disciplina : Disciplina) String
    SistemaEscolar : + removerDisciplinaDoProfessor(professor : Professor; disciplina : Disciplina) String
    SistemaEscolar:  + listarAlunos()
    SistemaEscolar:  + listarDisciplinas()
    SistemaEscolar:  + getBoletim
    class Aluno{
        # disciplinas : List<Disciplina>
        - matricula : String
        - nome : String
        + getDisciplinas() List<Disciplina>
        + getNomeAluno() String
        + getMatricula() String
        
    }
    class Disciplina{
        # alunos : List<Aluno>
        # professores : List<Professor>
        - professor : Professor
        - nome : String
        - map : Map<Aluno, Nota>
        + getAlunos() List<Aluno>
        + getNome()  String
        + getProfessor()  Professor
        + isPresent(aluno : Aluno)  boolean
        + inserirAluno(aluno : Aluno; nota : Nota)  void
        + removerAluno(aluno : Aluno; nota : Nota)  void
        + getNotas(aluno : Aluno)  Nota
        + getMedia(aluno : Aluno)  int
        + inserirNotaFinal(aluno  Aluno; notaFinal : int)
        + getMediaFinal(aluno : Aluno)  int
        + aprovado(aluno : Aluno)  boolean
        + aprovadoMediaFinal(aluno : Aluno)  boolean
    }
    class Professor{
        # disciplinas : List<Disciplina>
        - nome : String
        + getNome()  String
    }

    class Notas{
        - provaUm : int
        - provaDois : int
        - provaFinal : int
        + getProvaUm()  int
        + getProvaDois()  int
        + getProvaFinal()  int
    }

```