package Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println(retangulo.Área());
        System.out.println(retangulo.Diagonal());
        System.out.println(retangulo.toString());
        retangulo.setAltura(20);
        retangulo.setBase(10);
        System.out.println(retangulo.Área());
        System.out.println(retangulo.Diagonal());
        System.out.println(retangulo.toString());
    }
}
