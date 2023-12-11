import java.util.Scanner;

public class fibonacci { 
    public static void main(String[] args){
        int primeiro = 0;
        int proximo = 1;
        int resultado;
        try (Scanner ler = new Scanner(System.in)){
            int N = ler.nextInt();
            for (int i = 1; i <= N; i++){
                if (i == N)
                System.out.println(primeiro);
                else
                System.out.print(primeiro + " ");
                resultado = primeiro + proximo;
                primeiro = proximo;
                proximo = resultado;
            

            }


        }
    }
    
}
