package Projeto_POO;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class SistemaEscolar{
    Scanner scanner = new Scanner(System.in);
    private List<Aluno> ListaAlunos;
    private List<Disciplina> ListaDisciplinas;
    private List<Professor> ListaProfessores;



    public SistemaEscolar(){

        this.ListaAlunos = new ArrayList();
        this.ListaDisciplinas = new ArrayList();
        ListaProfessores = new ArrayList();

    }
   
   
    public boolean MatricularAluno(){
        return true;
    }

   
    public void GerarBoletim(int matricula) {
        int idAluno = findAluno(matricula);
        Aluno aluno = ListaAlunos.get(idAluno);
    
        System.out.println("+-----------------------------------------+----------------------------------------+");
        System.out.println("|      Nome Aluno:       ->     " + aluno.getNomeAluno() + "      |      Matrícula:     ->   " +  aluno.getMatriculaAluno());
        System.out.println("+-----------------------------------------+----------------------------------------+");
    
        ArrayList<Notas> notas = aluno.getBoletim();
    
        for (int x = 0; x < notas.size(); x++) {
            System.out.println("+--------------------+---------------------------------------------------------+");
            System.out.println("|      Disciplina      |       ->         " + notas.get(x).getDisciplina());
            System.out.println("+--------------------+---------------------------------------------------------+");
            System.out.println("| Nota 01: " + notas.get(x).getNota1() + "   Nota 02: " + notas.get(x).getNota2());
            if(!notas.get(x).aprovado()){
                System.out.println("| Nota Final: " + notas.get(x).getNotaFinal());
                System.out.println("| Média Final: " + notas.get(x).getMediaFinal());
            }
            System.out.println("| Média Simples: " + notas.get(x).getMediaSimples());
            System.out.println("+-------------------------------------------------------------------------------+");
            System.out.println();

        }
    }
    
    public int findAluno(int matricula){
        Aluno encontrado = ListaAlunos.stream().filter(a -> a.getMatriculaAluno() == matricula).findFirst().orElse(null);        
        return ListaAlunos.indexOf(encontrado);
    }

    public int findDisciplinaAluno(Aluno aluno, String disciplina) {
        ArrayList<Notas> disciplinas = aluno.getBoletim();

        for(int x=0; x < disciplinas.size();x++){
            if(disciplinas.get(x).getDisciplina().toUpperCase().trim().equals(disciplina.toUpperCase().trim())){
                return x;
            }
            System.out.println(disciplina.toUpperCase().trim() + " " + disciplinas.get(x).getDisciplina().toUpperCase().trim());
        }
        return -1;
    }

    public void CadastrarAlunoDisciplina (int matricula, int idDisciplina){
           try{
            int  encontrado = findDisciplinaAluno(ListaAlunos.get(findAluno(matricula)), ListaDisciplinas.get(idDisciplina).getNomeDisciplina());
            if(encontrado == -1){
                    ListaDisciplinas.get(idDisciplina).inserirAluno(ListaAlunos.get(findAluno(matricula))); // adiciona aluno na lista de alunos da disciplina
                    Notas discipli = new Notas(ListaDisciplinas.get(idDisciplina).getNomeDisciplina(), ListaAlunos.get(findAluno(matricula)).getNomeAluno());
                    ListaAlunos.get(findAluno(matricula)).setBoletim(discipli); // adiciona nome da disciplina noboletim do aluno
                    System.out.println("Aluno: " + ListaAlunos.get(findAluno(matricula)).getNomeAluno() 
                    + " Matriculado na disciplina: " +  discipli.getDisciplina());
            }else{
                System.out.println("Aluno já matriculado na disciplina");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Matrícula ou indice da disciplina inválidos");
        }
    }

    public void CadastrarAluno(Aluno aluno){
      int cadastrado = findAluno(aluno.getMatriculaAluno());
       if(cadastrado == -1){
            ListaAlunos.add(aluno);
            System.out.println("\nAluno cadastrado com sucesso!");
       }else{
            System.out.println("\nNão foi possível cadastrar aluno, pois ele já se encontra no sistema.");
       }

    }
   
    public List<Aluno> getListadeAlunos(){
        return this.ListaAlunos;
    }
    public void ListarAlunos() {
        System.out.println("Listagem de Alunos:\n");
    
        for (int x = 0; x < this.ListaAlunos.size(); x++) {
            Aluno aluno = ListaAlunos.get(x);
            System.out.println("Id: " + (x+1));
            System.out.println("Matrícula: " + aluno.getMatriculaAluno());
            System.out.println("Nome: " + aluno.getNomeAluno());
            
            System.out.println("- Disciplinas:");
            ArrayList<Notas> disciplinas = aluno.getBoletim();
            for (int y = 0; y < disciplinas.size(); y++) {
                System.out.println((y+1) + ". " + disciplinas.get(y).getDisciplina());
            }
    
            System.out.println(); 
        }
    }
    
    


    public void AtribuirNotaAluno(int id_aluno, int disciplina, int nota01, int nota02) {
        Aluno aluno = ListaAlunos.get(id_aluno);
        int indexa = findAluno(aluno.getMatriculaAluno());

        if (indexa != -1 && disciplina < aluno.getBoletim().size()) {
            Notas disciplinaAtual = ListaAlunos.get(indexa).getBoletim().get(disciplina);
            disciplinaAtual.setNota1(nota01);
            disciplinaAtual.setNota2(nota02);

            System.out.println(disciplinaAtual.getNota1() + " " + disciplinaAtual.getNota2());

            if (disciplinaAtual.aprovado()) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno não aprovado");

                System.out.println("Digite nota da prova final: ");
                int notaf = scanner.nextInt();
                disciplinaAtual.setNotaFinal(notaf);

                if (disciplinaAtual.aprovadoFinal()) {
                    System.out.println("Aluno aprovado na prova final!");
                } else {
                    System.out.println("Aluno reprovado");
                }
            }
        } else {
            System.out.println("Aluno ou disciplina inválida");
        }
    }



    public int findProfessor(int idprof ){
        Professor encontrado = ListaProfessores.stream().filter(prof -> prof.getIdProf() == idprof).findFirst().orElse(null);        
        return ListaProfessores.indexOf(encontrado);
    }
   


    public boolean CadastrarProfessor(Professor professor){
       int cadastrado = findProfessor(professor.getIdProf());
       if(cadastrado == -1){
            professor.setid(ListaProfessores.size()+1);
            ListaProfessores.add(professor);

            System.out.println("\nProfessor cadastrado com sucesso!");
            return true;
       }else{
            System.out.println("\nNão foi possível cadastrar professor, pois ele já se encontra no sistema.");
            return false;
       }

    }


    public void CadastrarProfessorDisciplina(int idProfessor, int idDisciplina) {
        try{
        Disciplina encontrado = ListaDisciplinas.stream()
                .filter(disc -> disc.getNomeProfessor().equalsIgnoreCase(ListaProfessores.get(idProfessor).getNomeProf().trim()))
                .findFirst()
                .orElse(null);
    
        if (encontrado != null) {
            System.out.println("Professor já cadastrado na disciplina: " + encontrado.getNomeDisciplina());
        } else {
            if(ListaProfessores.get(idProfessor).getDisciplina() == null){
                if(ListaDisciplinas.get(idDisciplina).getNomeProfessor().equals("Ainda nao possui um professor responsável.")){
                    ListaProfessores.get(idProfessor).setDisciplina(ListaDisciplinas.get(idDisciplina));
                    ListaDisciplinas.get(idDisciplina).inserirProfessor(ListaProfessores.get(idProfessor));
                    System.out.println("Cadastrado com sucesso!");
                }
                else{
                    System.out.println("Disciplina já possui um professor responsável.");
                }
        }else{
            System.out.println("O professor já possui uma matéria, para cadastrá-lo em uma nova disciplina remova a anterior.");
        } 
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indices inválidos.");
        }
    }
    
    public void RemoverProfessorDisciplina (int idDisciplina){
            Disciplina encontrado  = ListaDisciplinas.get(idDisciplina);

            if(encontrado.getProfessor() != null){
            
                int index = ListaProfessores.indexOf(
                    ListaProfessores.stream()
                        .filter(p -> p.getNomeProf().toUpperCase().trim().equals(encontrado.getNomeProfessor().toUpperCase().trim()))
                        .findFirst()
                        .orElse(null)
                );
                
                ListaDisciplinas.get(idDisciplina).removerProfessor();
                ListaProfessores.get(index).removerDisciplina();
                System.out.println("Professor removido com sucesso na disciplina: " + 
                encontrado.getNomeDisciplina());
            }else{
                System.out.println("Não há professor cadastrado na disciplina: " + encontrado.getNomeDisciplina()); 
                
            }
    }


    public void ListarProfessores(){
        for(int x = 0; x< this.ListaProfessores.size(); x++){
            Professor prof = ListaProfessores.get(x);
            System.out.println("Id: " +  prof.getIdProf());
            System.out.println("Nome: " +  prof.getNomeProf());
            System.out.println("Disciplina: " +  prof.getDisciplinaNome() +"\n ------------------");

        }

    }




     public int findDisciplina(String nomeDisc ){
        Disciplina encontrado = ListaDisciplinas.stream().filter(disc -> disc.getNomeDisciplina().toUpperCase().trim().equals(nomeDisc.toUpperCase().trim())).findFirst().orElse(null);        
        return ListaDisciplinas.indexOf(encontrado);
    }

     
    public void CadastrarDisciplina(Disciplina disciplina){

            
        
        int cadastrado = findDisciplina(disciplina.getNomeDisciplina());
       if(cadastrado == -1){
            ListaDisciplinas.add(disciplina);
            System.out.println("\nDisciplina cadastrada com sucesso!");
       }else{
            System.out.println("\nNão foi possível cadastrar disciplina, pois ela já se encontra no sistema.");
       }
    }

    public void ListarDisciplinas() {
        for (int x = 0; x < this.ListaDisciplinas.size(); x++) {
            Disciplina disc = ListaDisciplinas.get(x);
            System.out.println((x+1) + ". Disciplina: " + disc.getNomeDisciplina());
            
            System.out.println("- Professor: " + disc.getNomeProfessor());
            System.out.println("------------------- ALUNOS ------------------- ");
            ArrayList<Aluno> alunos = disc.getListaAlunos();
            for (int y = 0; y < alunos.size(); y++) {
                    System.out.println((y+1) + " - " + alunos.get(y).getNomeAluno());
            }
            System.out.println("\n");

        }

    }
    public void ListarDisciplinasAluno(int id_aluno) {
        Aluno aluno = this.ListaAlunos.get(id_aluno);
        for (int x = 0; x < aluno.getBoletim().size(); x++) {
            Notas notas = aluno.getBoletim().get(x);
            System.out.println(x + ". Disciplina: " + notas.getDisciplina());
            System.out.println("Nota 01: " +  notas.getNota1() );
            System.out.println("Nota 02: " + notas.getNota2());
            System.out.println("Nota Final: " + notas.getNotaFinal());

            if((notas.getNota1()*2 + notas.getNota2()*3)/5 >= 60){
                
                System.out.println("Media Simples: " + (notas.getNota1()*2 + notas.getNota2()*3)/5);
            
            }else{
            
                System.out.println("Media Simples: " + notas.getMediaSimples());
                System.out.println("Media Final: " +notas.getMediaFinal());

            }

        }

    }

} //a