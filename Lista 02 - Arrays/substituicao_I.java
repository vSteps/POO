import java.util.Scanner;
public class substituicao_I {
    public static void main(String[] args) {
    int [] nums = new int[10];
      Scanner ler = new Scanner(System.in); 
        for (int i = 0 ; i < nums.length; i++ ){
            nums[i] = ler.nextInt();
        }

        for (int i = 0 ; i < nums.length; i++ ){
            if (nums[i] == 0 || nums[i] < 0) {
                nums[i] = 1;
              }
    }

    for (int i = 0; i < nums.length; i++){
        System.out.println("X["+ i +"]"+" = " + nums[i] );
    }
    
}

}