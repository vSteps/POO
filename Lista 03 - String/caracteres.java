import java.util.Scanner;

public class caracteres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        String palavraMaior = "";
        int tamanho = 0;

        while (true) {
            frase = ler.nextLine();
            
            if (frase.equals("0")) {
                break;
            }
            
            String[] array = frase.split(" ");
            int maior = 0;

            for (int i = 0; i < array.length; i++) {
                tamanho = array[i].length();
                System.out.print(tamanho);

                if (tamanho >= maior) {
                    maior = tamanho;
                }
                
                if (array[i].length() >= palavraMaior.length()) {
                    palavraMaior = array[i];
                }
                
                if (i != (array.length - 1)) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nThe biggest word: " + palavraMaior);
    }
}
