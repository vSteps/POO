package Prova2_POO.Questao1;
public class Carro extends Veiculo {
    private String ano;
    public Carro(String ano, String marca, String modelo){
        super(marca, modelo);
        this.ano = ano;
    }

    public void setAno(String ano){
        this.ano = ano;
    }

    public String getAno(){
        return this.ano;
    }
    

    public String exibirInformacoes(){
        return "A marca do carro é " + getMarca() + "\nO modelo do carro é " + getModelo() + "\nÉ um carro de " + this.ano + ".";
    }
}
