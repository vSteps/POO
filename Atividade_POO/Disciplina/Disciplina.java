package Disciplina;

public class Disciplina {
    private String nome;
    private int nota_1;
    private int nota_2;
    private int nota_3;


public Disciplina(String nome, int nota_1, int nota_2){
    this.nome = nome;
    this.nota_1 = nota_1;
    this.nota_2 = nota_2;
}

// public void setNome(String nome){
//     this.nome = nome;
// }

// public void setNota_1(int nota_1){
//     this.nota_1 = nota_1;
// }

// public void setNota_2(int nota_2){
//     this.nota_2 = nota_2;
// }

public void setNota_3(int nota_3){
    if (aprovado() == false){
        this.nota_3 = nota_3;
    }
}

public String getNome(){
    return this.nome;
}

public int getNota_1(){
    return this.nota_1;
}

public int getNota_2(){
   return this.nota_2;
}

public int getNota_3(){
    return this.nota_3;
}


public int media(){
    return (this.nota_1*2+nota_2*3)/5;
}

public boolean aprovado(){
    if (media() >= 60){
    return true;
 }
    return false;
}


public int mediafinal(){
    return (media()+nota_3)/2;

}
}