package Circulo;
public class Círculo {
    private double raio;
    
    
public Círculo(double raio){
    this.raio = raio;
}

public void setRaio(double raio){
    this.raio = raio;

}
public double getRaio(){
    return this.raio;
}

public double Circun(){
    return 2 * Math.PI * this.raio;
}

public double Area(){
    return Math.pow(this.raio, 2) * Math.PI;
}



}

