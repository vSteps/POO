package Excecoes;
import java.lang.String;
public class Retangulo {
    private double b;
    private double h; 


public Retangulo(double b, double h){
    this.b = b;
    this.h = h;
}


public void setBase(double b) throws ArgumentOutOfRangeException{
    if (b < 0) {
        throw new ArgumentOutOfRangeException();
    }
    this.b = b;
}

public void setAltura(double h) throws ArgumentOutOfRangeException{
    if (h < 0){
        throw new ArgumentOutOfRangeException();
    }
    this.h = h;
}

public double getBase(){
    return this.b;
}

public double getAltura(){
    return this.b;
}

public double Área(){
    return this.b*this.h;
}

public double Diagonal(){
    return Math.sqrt(Math.pow(b, 2)+Math.pow(h, 2));
}

public String toString(){
    return this.b + " " + this.h;

}
}