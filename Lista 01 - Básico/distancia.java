import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
 
public class distancia {

    public static void main(String[] args) throws IOException {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double d = Math.sqrt(Math.pow(x2-x1 , 2)+(Math.pow(y2-y1 , 2)));
            System.out.printf("%.4f" , d);
        }
    }
}