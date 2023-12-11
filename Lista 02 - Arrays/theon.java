import java.util.Scanner;
public class theon {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int x = ler.nextInt();
    int [] nums = new int[x];
    for (int i = 0; i < nums.length; i++){
        int n = ler.nextInt();
        nums[i] = n;
        
    }
    
        int menor = nums[0];
        int posicao = 0;

        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                posicao = 1;
            }
            if (nums[i] < menor){
                menor = nums[i];
                posicao = i+1;
            }
            
        }
        System.out.println(posicao);

        
        
    }
    
}
