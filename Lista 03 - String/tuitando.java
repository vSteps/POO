import java.util.Scanner;

public class tuitando{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();

        if (texto.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }
    }
}