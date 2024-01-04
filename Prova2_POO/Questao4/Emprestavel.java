package Prova2_POO.Questao4;

interface Emprestavel {
   boolean estaEmprestado();
   void emprestar() throws ItemEmprestadoException;
   void devolver() throws ItemEmprestadoException; 

    
}
