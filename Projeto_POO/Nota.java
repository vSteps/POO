package Projeto_POO;

public class Nota {
    private int provaUm;
    private int provaDois;
    private int provaFinal;
    

    public Nota(int provaUm, int provaDois){
        this.provaUm = provaUm;
        this.provaDois = provaDois;
        this.provaFinal = 0;
    }

    public void setProvaUm(int provaUm){
        this.provaUm = provaUm;
    }

    public int getProvaUm(){
        return this.provaUm;
    }

    public void setProvaDois(int provaDois){
        this.provaDois = provaDois;
    }

    public int getProvaDois(){
        return this.provaDois;
    }

    public void setProvaFinal(int provaFinal){
        this.provaFinal = provaFinal;
    }

    public int getProvaFinal(){
        return this.provaFinal;
    }

}
