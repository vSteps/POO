package Projeto_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static Scanner leia = new Scanner(System.in);
   static int opcao=-1;
   static SistemaEscolar se = new SistemaEscolar();
   
   public static void main(String[] args) {
    
    SistemaEscolar sistema = new SistemaEscolar();

    System.out.println("Sistema de gerenciamento escolar");
    System.out.println("_______________________________________");
    System.out.println("Regras:");
    System.out.println("-As matrículas dos alunos devem ser um valor de até 9 digitos(20231014040002 vira 231014042).");
    System.out.println("-Só é possível cadastrar um professor por Disciplina.");
    System.out.println("-Cada disciplina possui duas notas e caso o aluno não obtenha 60 ou mais, a nota da prova final poderá ser adicionada.");
    System.out.println("_______________________________________");

    int controle = 0;
    Scanner input = new Scanner(System.in);
    while (controle != 12 ) {
      System.out.println("Digite o número que corresponde a ação que deseja:");

      System.out.println("1 - Cadastrar Professor");
      System.out.println("2 - Cadastrar Disciplina");
      System.out.println("3 - Cadastrar Aluno");
      System.out.println("4 - Inserir Aluno em Disciplina");
      System.out.println("5 - Inserir Professor em Disciplina");
      System.out.println("6 - Remover Professor da Disciplina");
      System.out.println("7 - Ver Professores");
      System.out.println("8 - Ver Alunos");
      System.out.println("9 - Ver Disciplinas");
      System.out.println("10 - Mostrar boletim de aluno");
      System.out.println("11 - Atribuir Nota ao Aluno");
      System.out.println("12 - Sair do sistema");
      System.out.println("_______________________________________");
      controle = input.nextInt();
      if (controle == 1) {
         System.out.println("______________Cadastrar Professor______________\n");
         System.out.print("Insira o nome do Professor: ");
         String nomepro = leia.nextLine();
         Professor prof = new Professor(nomepro);
         se.CadastrarProfessor(prof);                        
         
      }else if(controle == 2){
         System.out.println("______________Cadastrar Disciplina______________");
         System.out.print("Insira o nome da Disciplina: ");
         String nomedisc = leia.nextLine();
         Disciplina disc = new Disciplina(nomedisc);
         se.CadastrarDisciplina(disc);
        

      }else if(controle == 3){
         System.out.println("______________Cadastrar Aluno______________\n");
         System.out.print("Insira o nome Aluno: ");
         String nomealu = leia.nextLine();
         System.out.print("Insira a matrícula: ");
         String inputMatricula = leia.nextLine();
         int matricula = Integer.parseInt(inputMatricula);
         Aluno alu = new Aluno(nomealu, matricula);
         se.CadastrarAluno(alu);             

      }else if(controle == 4){
         System.out.println("______________Cadastrar um Aluno em uma disciplina______________");

         se.ListarAlunos();
         System.out.print("Insira a matrícula do aluno: ");
        int idAluno =  leia.nextInt();

         System.out.println("__________________________________");

         se.ListarDisciplinas();
         System.out.print("Insira o id da disciplina: ");
         int iddisca =  leia.nextInt();

         se.CadastrarAlunoDisciplina(idAluno,iddisca-1);  

      }else if(controle ==5){
         System.out.println("______________Cadastrar um Professor em uma disciplina______________");

         se.ListarProfessores();
         System.out.print("Insira o id do professor: ");
         int idprof =  leia.nextInt();

         System.out.print("__________________________________");

         se.ListarDisciplinas();
         System.out.print("Insira o id da disciplina: ");
         int iddisc =  leia.nextInt();

         se.CadastrarProfessorDisciplina(idprof-1, iddisc-1);



      }else if(controle == 6){
         System.out.print("______________Remover um Professor de uma disciplina______________");
         se.ListarDisciplinas();
         System.out.print("Insira o id da disciplina: ");
         int iddisc = leia.nextInt();
         se.RemoverProfessorDisciplina(iddisc-1);
   

   }else if(controle == 7){
      System.out.println("______________Ver Professores______________\n");                           
      se.ListarProfessores();

   }else if(controle == 8){
      System.out.println("______________Ver Alunos______________\n");
      se.ListarAlunos();
 

   }else if(controle == 9){
      System.out.println("______________Ver Disciplinas______________\n");
      se.ListarDisciplinas();

   }else if(controle == 10){
      System.out.println("______________Gerar boletim ______________\n");
      se.ListarAlunos();
      System.out.print("Insira a Matrícula do Aluno.");
      int mat =  leia.nextInt();
      se.GerarBoletim(mat);

   }else if(controle == 11){
      System.out.println("______________Atribuir Nota ______________\n");
      se.ListarAlunos();
      System.out.print("Escolha o Aluno por id: ");
      int id_aluno = leia.nextInt();
      System.out.println("Lista de disciplinas do Aluno:  " + se.getListadeAlunos().get(id_aluno-1).getNomeAluno());
      System.out.println("______________________________________________\n");
      if(se.getListadeAlunos().get(id_aluno-1).getBoletim().size() != 0){
      se.ListarDisciplinasAluno(id_aluno-1);

      System.out.print("Digite o id da disciplina: ");
      int disciplina = leia.nextInt();
      leia.nextLine();
      System.out.println("Disciplina selecionada!");
      System.out.print("Insira nota 01: ");
      int nota01 = leia.nextInt();
      System.out.print("Insira nota 02: ");
      int nota02 = leia.nextInt();
      System.out.println();
      se.AtribuirNotaAluno(id_aluno-1, disciplina, nota01, nota02);
      }else System.out.println("Esse aluno ainda não possui disciplinas.\n");

}
   }
}
}