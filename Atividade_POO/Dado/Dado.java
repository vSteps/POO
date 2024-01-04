public class Dado {
    private int lados = 6; // o private serve para que nenhum outro arquivo de fora possa alterar o que está intruído aqui. Exemplo: "Main"
    private int _valor = 1;

    public void lancar() { // O void significa que essa função não retorna nada
        _valor = (int) (Math.random() * lados +1); // random gera um valor entre 0.0 e 1.0 depois multiplica pelo range(lados) e soma + para se adequar ao range
        
    }
    
    public int valor(){
        return _valor;
    }
}
