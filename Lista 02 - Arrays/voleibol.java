import java.util.Arrays;
import java.util.Scanner;
public class voleibol {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
      int [] array = new int [6];
      for (int i = 0; i < n; i++){
        ler.next();
        for (int j = 0; j < array.length; j++){
          array[j] += ler.nextInt(); 
        }
      }
      double serve = (array[3]*100.0)/array[0];
      double block = (array[4]*100.0)/array[1];
      double attack = (array[5]*100.0)/array[2];
      System.out.println(String.format("Pontos de Saque: %.2f" ,  serve) + " %.");
      System.out.println(String.format("Pontos de Bloqueio: %.2f" , block) + " %.");
      System.out.println(String.format("Pontos de Ataque: %.2f" , attack) + " %.");

    }

        
    }
    