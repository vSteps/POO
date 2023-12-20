package Prova2_POO.Questao4;
public abstract class itemBiblioteca {

    public String titulo;
    public int id;
    private String estado = "O item está disponível";

    public itemBiblioteca(String titulo, int id) {
        this.id = id;
        this.titulo = titulo;
       }

       public int getId(){
        return this.id;
       }

       public void setId(int id){
        this.id = id;
       }

       public String getTitulo(){
        return this.titulo;
       }

       public void setTitulo(String titulo){
        this.titulo = titulo;
       }

       public void setEstado(String estado) {
        this.estado = estado;
       }

       public String getEstado(){
        return this.estado;
       }

    }