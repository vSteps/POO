import java.util.Scanner;
public class troca {
    public static void main(String[] args) {
    int x;
    int [] nums = new int[20];
      Scanner ler = new Scanner(System.in); 
        for (int i = 0 ; i < nums.length; i++ ){
            nums[i] = ler.nextInt();
        }
        for (int i = 0; i < (nums.length / 2); i++){
        x = nums[i];
        nums[i] = nums[nums.length -1 - i];
        nums[nums.length -1 - i] = x;
    }

    for (int j = 0; j < nums.length; j++){
        System.out.println("N["+ j +"]"+" = " + nums[j] );
    }
    
}

}