package Prova2_POO.Questao4;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro(1, "O Senhor dos Anéis", Arrays.asList());
        livro.autores.add("J.K Rowling");

        livro.exibirAutores();

        DVD dvd = new DVD(2, "O Poderoso Chefão", Arrays.asList());
        dvd.diretores.add("Francis Ford Coppola");
        dvd.exibirDiretores();

    System.out.println(livro.getEstado());
           try {
            livro.emprestar();
        } catch (ItemEmprestadoException e) {
            System.out.println(e.getMessage());
        }
            try {
            livro.emprestar();
        } catch (ItemEmprestadoException e) {
            System.out.println(e.getMessage());
        }
    System.out.println(livro.getEstado());
        try {
           livro.devolver();
        } catch (ItemEmprestadoException e) {
            System.out.println(e.getMessage());
        }
    System.out.println(livro.getEstado());
    System.out.println(dvd.getEstado());

        try {
            dvd.emprestar();
        } catch (ItemEmprestadoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(dvd.getEstado());

        try {
           dvd.devolver();
        } catch (ItemEmprestadoException e) {
            System.out.println(e.getMessage());
        }


    }
}
    

