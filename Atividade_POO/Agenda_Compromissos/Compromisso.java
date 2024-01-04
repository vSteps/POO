package Agenda_Compromissos;

import java.time.LocalDate;

public class Compromisso {
    private String Assunto;
    private String Local;
    private LocalDate Data;
    

public Compromisso(String Assunto, String Local, LocalDate Data){
    this.Assunto = Assunto;
    this.Local = Local;
    this.Data = Data;
}

public void setAssunto(String Assunto){
    this.Assunto = Assunto;
}

public void setLocal(String Local){
    this.Local = Local;
}

public void setData(LocalDate Data){
    this.Data = Data;
}

public String getAssunto(){
   return Assunto;
}

public String getLocal(){
    return Local;
}

public LocalDate getData(){
   return Data;
}

public String toString() {
    return "Compromisso{" +
            "Assunto='" + Assunto + '\'' +
            ", Local='" + Local + '\'' +
            ", Data=" + Data +
            '}';
}



}
