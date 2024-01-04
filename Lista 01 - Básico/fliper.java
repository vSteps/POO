import java.util.Scanner;
public class fliper {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int p = ler.nextInt();
            int r = ler.nextInt();
            if (p == 0)
            System.out.println("C");

            else if(p == 1 && r == 0)
            System.out.println("B");

            else if (p == 1 && r == 1)
            System.out.println("A");
        }

    }

    
}
