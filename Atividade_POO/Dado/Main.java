public class Main {
    public static void main(String[] args) {
        Dado dado1 = new Dado(); // Dado é um objeto com características definidas no arquivo Dado.java
        int a = dado1.valor();
        System.out.println(a);
        dado1.lancar();
        a = dado1.valor();
        System.out.println(a);
    }
     
}
