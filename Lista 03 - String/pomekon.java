import java.util.Arrays;
import java.util.Scanner;
public class pomekon {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int qtd = 0;
        int pomekon = 151;
        String [] lista = new String[n];
        for (int i = 0; i < lista.length; i++){
            lista[i] = ler.next();
            pomekon --;
        }
        Arrays.sort(lista);

        for (int i = 1; i < lista.length ; i++){
            if (lista[i].equals(lista[i - 1])){
            pomekon++;
        }
        }
        //pomekon -= qtd;
       System.out.println("Falta(m) " + pomekon + " pomekon(s).");
        
    }
}
