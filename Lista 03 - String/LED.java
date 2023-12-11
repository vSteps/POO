import java.util.Scanner;
public class LED {

    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        long t = ler.nextInt();
        int[] n = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        char[] digitos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < t; i++){
            String number = ler.next();
            int leds = 0;
            
            for (int j = 0; j < number.length(); j++){
                char digito = number.charAt(j);
                int resposta = 0;

                for( int k = 0; k < digitos.length; k++){
                    if (digito == digitos[k]){
                        resposta = k;
                        break;
                    }
                }

                leds += n[resposta];
            }

            System.out.println(leds + " leds");
        }
    }
    
}
