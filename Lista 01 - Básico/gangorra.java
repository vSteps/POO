import java.util.Scanner;
public class gangorra {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int p1 = ler.nextInt();
            int c1 = ler.nextInt();
            int p2 = ler.nextInt();
            int c2 = ler.nextInt();
            int V1 = p1 * c1;
            int V2 = p2 * c2;
            if (V1 == V2)
            System.out.println("0");
            else if (V1 < V2)
            System.out.println("1");
            else
            System.out.println("-1");
        }


    }
    
}
