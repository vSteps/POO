import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
public class maior {
 
    public static void main(String[] args) throws IOException {
        try (Scanner ler = new Scanner(System.in)) {
            int a = ler.nextInt();
            int b = ler.nextInt();
            int c = ler.nextInt();
            int maiorAB = (a+b+Math.abs(a-b))/2;
            if (maiorAB>c){
                System.out.print(maiorAB);
                System.out.println(" eh o maior");
            }
            else{
                System.out.print(c);
                System.out.println(" eh o maior");
            }
        }
    }
}