package Projeto_POO;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    
    SistemaEscolar sistema = new SistemaEscolar();

    System.out.println("Sistema de gerenciamento escolar");
    System.out.println("_______________________________________");
    System.out.println("Regras:");
    System.out.println("-Apenas professores podem cadastrar Disciplinas.");
    System.out.println("-Só é possível cadastrar um professor por Disciplina.");
    System.out.println("-Cada disciplina possui duas notas e caso o aluno não obtenha 60 ou mais, a nota da prova final poderá ser adicionada.");
    System.out.println("_______________________________________");

    int controle = 0;
    Scanner input = new Scanner(System.in);
    while (controle != 7 ) {
      System.out.println("Digite o número que corresponde a ação que deseja:");

      System.out.println("1 - Cadastrar Professor");
      System.out.println("2 - Cadastrar Disciplina");
      System.out.println("3 - Cadastrar Aluno");
      System.out.println("4 - Inserir Aluno em Disciplina");
      System.out.println("5 - Remover Aluno em Disciplina");
      System.out.println("6 - Mostrar boletim de aluno");
      System.out.println("7 - Sair do sistema");
      System.out.println("_______________________________________");
      controle = input.nextInt();
      if (controle == 1) {
         System.out.println("Informe o nome do professor:");input.nextLine();
         String nomeProfessor;
         nomeProfessor = input.nextLine();
         Professor professor = new Professor(nomeProfessor);

         sistema.cadastrarProfessor(professor);

         System.out.println("Professor " + nomeProfessor + " cadastrado com sucesso!");
         
      }else if(controle == 2){
         System.out.println("Informe o nome da Disciplina:");input.nextLine();
         String nomeDisciplina = input.nextLine();
         Disciplina disciplina = new Disciplina(nomeDisciplina);
         System.out.println("Disciplina " + nomeDisciplina + " cadastrada com sucesso!");
         sistema.cadastrarDisciplina(disciplina);
        

      }else if(controle == 3){
         System.out.println("Informe o nome do Aluno:");input.nextLine();
         String nomeAluno = input.nextLine();
         System.out.println("Informe o número da Matrícula:");
         String matriculaAluno = input.nextLine();
         Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
         sistema.cadastrarAluno(aluno);
         System.out.println("Aluno " + nomeAluno + " cadastrado com sucesso!");

      }else if(controle == 4){
         System.out.println(sistema.listarAlunos());
         System.out.println("--------------------------");
         System.out.println("Informe a matrícula do aluno:");input.nextLine();
         String matriculaAluno = input.nextLine();

         System.out.println(sistema.listarDisciplinas());
         System.out.println("--------------------------");
         System.out.println("Informe a Disciplina:");
         String nomeDisciplina = input.nextLine();
         System.out.println(nomeDisciplina);


         Nota notas = new Nota(0, 0);
         sistema.getDisciplina(nomeDisciplina).inserirAluno(sistema.getAluno(matriculaAluno), notas);


      }else if(controle == 6){
         System.out.println(sistema.listarAlunos());
         System.out.println("--------------------------");
         System.out.println("Informe a matrícula do aluno:");input.nextLine();
         String matriculaAluno = input.nextLine();

         sistema.getBoletim(sistema.getAluno(matriculaAluno));
      }else{
         System.out.println("Opção inválida! Tente novamente");
      }
      }
   }
}