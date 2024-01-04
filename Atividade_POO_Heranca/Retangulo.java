package Atividade_POO_Heranca;
public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return this.base * this.altura;

    }
    @Override
    public double calcularPerimetro(){
        return (this.base * 2) + (this.altura *2);
    }
}
