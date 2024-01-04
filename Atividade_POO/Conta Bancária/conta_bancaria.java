
public class conta_bancaria{
    private double saldo = 0.0;
    public double a = 0.0;



    private boolean verificar(double a){
        return  saldo>=a;
    }
    
public double saldo(){
    return saldo;
}

public void depositar(double a){
    if (a>0){
       saldo+=a;  
    }
   
}

public void sacar(double a){
    if (verificar(a)){
        saldo-=a;
    }
}

public void pix(double a){
    if (verificar(a)){
        saldo-=a;
    }
}


public static void main(String[] args) {
    conta_bancaria cont = new conta_bancaria();
    cont.depositar(300);
    cont.sacar(200);
    cont.pix(100);
    System.out.println(cont.saldo);
    }
}