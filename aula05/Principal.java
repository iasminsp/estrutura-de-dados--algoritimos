public class Principal{
    public static void main(String[]args){
        System.out.println("===Testando oilha===");
        Pilha<String> pilha = new Pilha<String>("letras");

        pilha.push("a");
        pilha.push("b");
        pilha.push("c");

        pilha.imprimePilha();

        System.out.println("topo da pilha"+ pilha.peek());
        System.out.println("elemento removido"+ pilha.pop());

        pilha.imprimePilha();
    }
}