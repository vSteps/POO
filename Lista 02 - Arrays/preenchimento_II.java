import java.util.Scanner;
public class preenchimento_II {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int [] nums = new int[10];
      int x = ler.nextInt();
      int n = 0;
    for (int i = 0; i < nums.length; i++){
        if (n == x){
            n = 0;
            
        }

        System.out.println("N["+ i +"]"+" = " + n );
        n++;
    }
    
}

}
