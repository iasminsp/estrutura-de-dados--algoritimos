class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(T dado){
        this.dado=dado;
        this.nextNo=null;
    }

    public No<T> getNextNo(){
        return this.nextNo;
    }

    public void setNextNo(No<T> nextNo){
        this.nextNo=nextNo;
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