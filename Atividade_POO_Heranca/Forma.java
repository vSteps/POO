package Atividade_POO_Heranca;

public abstract class Forma {
    protected double area;
    protected double perimetro;
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
    
    public double getArea(){
        return area;
    }

    public void setArea(){
        this.area = area;
    }

    public double getPerimetro(){
        return perimetro;
    }

    public void setPerimetro(){
        this.perimetro = perimetro;
    }
    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
}
