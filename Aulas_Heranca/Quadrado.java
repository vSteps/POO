package Aulas_Heranca;

public class Quadrado extends Retangulo{
    public Quadrado(double lado){
        super(lado, lado);
    }

    @Override
    public String toString(){
        return "Lado: " + this.getBase();
    }

    @Override
    public void setAltura(double h){
        super.setAltura(h);
        super.setBase(h);
    }

    @Override
    public void setBase(double b){
        super.setAltura(b);
        super.setBase(b);
    }
}