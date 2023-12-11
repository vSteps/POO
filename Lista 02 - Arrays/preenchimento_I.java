import java.util.Scanner;
public class preenchimento_I {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int [] nums = new int[10];
      int x = ler.nextInt();

    nums[0] = x;

    for (int i = 1; i < nums.length; i++){
        nums[i] = 2 * nums[i-1];
    }


    for (int i = 0; i < nums.length; i++){
        System.out.println("N["+ i +"]"+" = " + nums[i] );
    }
    
}

}