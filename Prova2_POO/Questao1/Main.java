package Prova2_POO.Questao1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("2012", "Fiat", "Uno");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.exibirInformacoes());
        carro.setMarca("Chevrolet");
        carro.setModelo("Cruise");
        carro.setAno("2015");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.exibirInformacoes());
    }
    
}
