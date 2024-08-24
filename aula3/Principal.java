public class Principal{
    public static void main(String[]args){
        Lista<String> lista = new Lista<String>("alunos");

        lista.addInicio("iasmin");
        lista.imprimeDados();
        lista.addInicio("mirian");
        lista.imprimeDados();
        lista.addFinal("min");
        lista.imprimeDados();
        lista.removeInicio();
        lista.imprimeDados();
        lista.removeFinal();
        lista.imprimeDados();

    }
}