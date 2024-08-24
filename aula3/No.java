class No<T>{
    private T dado;
    private No<T> aux;

    public No(T dado){
        this.dado=dado;
        this.aux=null;
    }

    public No<T> getAux(){
        return this.aux;
    }

    public void setAux(No<T> aux){
        this.aux=aux;
    }

    public T getDado(){
        return this.dado;
    }

    public void setDado(T dado){
        this.dado=dado;
    }

    public String imprimeDados(){
        return"{Dado:" + getDado() + "}";
    }
}