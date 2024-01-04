package Disciplina;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas matérias você deseja ver sua nota?");
        int resposta = ler.nextInt();
        for (int i = 0; i < resposta; i++){
            System.out.println("Digite sua matéria: ");
            String materia = ler.next();
            System.out.println("Digite suas notas: ");
            int nota1 = ler.nextInt();
            int nota2 = ler.nextInt();
            Disciplina disciplina = new Disciplina(materia,nota1,nota2);
            System.out.println("Sua média parcial na matéria "+materia+" é: " + disciplina.media());
            if (disciplina.aprovado() == true){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Você não foi aprovado, insira sua nota da prova final");
                int nota3 = ler.nextInt();
                disciplina.setNota_3(nota3);
                System.out.println("Sua média final na matéria "+materia+" é: " + disciplina.mediafinal());
                if (disciplina.aprovado() == true){
                    System.out.println("Aprovado!");
                }
                else{
                    System.out.println("Infelizmente, você foi reprovado");
                }
            }
        }
    }
}
