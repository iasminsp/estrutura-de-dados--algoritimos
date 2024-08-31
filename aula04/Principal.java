public class Principal{
    public static void main(String[]args){
        System.out.println("===testanto fila===");
        Fila<String> fila = new Fila<String>("letras");

        fila.enfileirar("a");
        fila.enfileirar("b");
        fila.enfileirar("c");
        
        fila.desenfileirar();
        fila.imprimeFila();
        

    }
}