package Agenda_Compromissos;

import java.util.Arrays;
import java.time.LocalDate;

public class Agenda {
    private Compromisso[] comps;
    private int k;
    private int qtd;

public Agenda(int k){
    this.k = k;
    this.comps = new Compromisso[0];
    this.qtd = 0;

}


public Agenda(){
    this(100);

}


public int getQtd(){
    return k;
}
private void duplicarTamanho(){
    Compromisso [] compromissos = new Compromisso[this.k *2];
        for (int i = 0; i<this.k;i++){
            compromissos[i] = comps[i]; 
        }
        this.comps = compromissos;
        this.k*=2;
}

public void Inserir(Compromisso c){
    if (this.qtd>=this.k){
        duplicarTamanho();
    }
    this.comps[qtd] = c;
}

public void Inserir(String Assunto, String Local, LocalDate Data){
    Compromisso c = new Compromisso(Assunto, Local, Data);
    Inserir(c);
}

public void excluir(Compromisso c) {
    for (int i = 0; i < this.k; i++) {
        if (comps[i] == c) {
            this.k -=1;
            comps[i] = comps[this.k];
            comps[this.k] = null;
        }
    }
}

  public Compromisso[] Listar() {
        Compromisso[] compromissos = new Compromisso[k];
        System.arraycopy(comps, 0, compromissos, 0, k);
        return compromissos;
    }

    public Compromisso[] Pesquisar(int mes, int ano) {
        Compromisso[] compromissos = new Compromisso[0];
        for (Compromisso compromisso : comps) {
            if (compromisso !=null && compromisso.getData().getMonthValue() == mes && compromisso.getData().getYear() == ano) {
                compromissos = Arrays.copyOf(compromissos, compromissos.length + 1);
                compromissos[compromissos.length - 1] = compromisso;
            }
        }
        return compromissos;
    }
}

// Steps n sabe usar git