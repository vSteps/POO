package Atividade_POO_Heranca;
public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(10,25);

        circulo.calcularArea();
        circulo.calcularPerimetro();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());


    }
    
}
