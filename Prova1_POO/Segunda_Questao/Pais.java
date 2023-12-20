package Segunda_Questao;
import java.lang.String;
public class Pais {
    private String nome;
    private double area;
    private int populacao;
    
    public Pais(String nome, double area, int populacao){
        this.nome = nome;
        this.area = area;
        this.populacao = populacao;
    }

    public double densidade(){
        return this.populacao/this.area;
    }

    public String toString(){
        return this.nome + " " + densidade();
    
    }
}
