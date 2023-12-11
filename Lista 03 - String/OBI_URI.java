import java.util.Scanner;

public class OBI_URI {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        String palavra = "";

        for (int i = 0; i < n; i++) {
            palavra = ler.next();
            char pal1 = palavra.charAt(0);
            char pal2 = palavra.charAt(1);
            char pal3 = palavra.charAt(2);
            if (pal1 == 'O' && pal2 == 'B') {
                if (palavra.length() > 3) {
                    System.out.print(palavra);
                } else {
                    System.out.print("OBI");
                }
            } else if (pal1 == 'U' && pal2 == 'R') {
                if (palavra.length() > 3) {
                    System.out.print(palavra);
                } else {
                    System.out.print("URI");
                }
            } else {
                System.out.print(palavra);
            }
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}