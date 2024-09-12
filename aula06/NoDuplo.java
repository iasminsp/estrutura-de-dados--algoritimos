public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> proximoNo;
    private NoDuplo<T> anteriorNo;
    private int indice;

    public NoDuplo (T dado, int indice){
        this.dado=dado;
        this.indice = indice;
        this.proximoNo=null;
        this.anteriorNo=null;
    } 

    public void setDado(T dado){
        this.dado=dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setProximoNo(NoDuplo<T> dado){
        this.proximoNo=proximoNo;
    }

    public NoDuplo<T> getProximoNo(){
        return this.proximoNo;
    }

    public void setAnteriorNo(NoDuplo<T> dado){
        this.anteriorNo=anteriorNo;
    }

    public NoDuplo<T> getAnteriorNo(){
        return this.anteriorNo;
    }
    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString(){
        return "{ Índice: " + getIndice() + ", Dado: " + getDado() + " }";
    }

}