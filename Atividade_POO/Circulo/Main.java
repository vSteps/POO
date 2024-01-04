package Circulo;
public class Main {
    public static void main(String[] args) {
        Círculo circulo = new Círculo(3);
        System.out.println(circulo.Circun());
        System.out.println(circulo.Area());
        System.out.println(circulo.getRaio());
        circulo.setRaio(5);
        System.out.println(circulo.Circun());
        System.out.println(circulo.Area());
        System.out.println(circulo.getRaio());
        
        

        
    }
    
}
