public class Principal{
    public static void main(String[]args){
        ListaDupla<String> lista = new ListaDupla<String>("alunos");
        lista.imprimeLista();
        lista.addInicio("iasmin");
        lista.imprimeLista();
        lista.addInicio("min");
        lista.imprimeLista();
        lista.addFinal("eu");
        lista.imprimeLista();


    }
}