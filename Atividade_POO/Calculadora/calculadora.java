public class calculadora {
    private double valor = 0.0;
    
    public double valor(){
        return valor;
    }

    public void somar (double a){
        valor+=a;
    }
    public void subtrair (double a){
        valor-=a;
    }
    public void multiplicar (double a){
        valor*=a;
    }
    public void dividir (double a){
        valor/=a;
    }

    
}