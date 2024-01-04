package Excecoes;


public class Main{
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10, 20);
     try{
       r.setAltura(10);
    }     catch (ArgumentOutOfRangeException e){
        System.out.println("Parametro invalido");
    }
    }
}