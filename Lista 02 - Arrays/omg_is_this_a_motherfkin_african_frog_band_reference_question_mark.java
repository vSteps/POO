import java.util.Scanner;
public class omg_is_this_a_motherfkin_african_frog_band_reference_question_mark {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int p = ler.nextInt();
        int n = ler.nextInt();
        int [] canos = new int[n];
        for (int i = 0; i < canos.length; i++){
            int x = ler.nextInt();
            canos[i] = x;
        }
        int qtd = 0;
        for (int i = 1; i < n; i++){
            if (Math.abs(canos[i-1]-canos[i]) > p){
            qtd++;
            }
        }
        if (qtd > 0){
            System.out.println("GAME OVER");
        }
        else{
            System.out.println("YOU WIN");
        }   
    }
    
}
