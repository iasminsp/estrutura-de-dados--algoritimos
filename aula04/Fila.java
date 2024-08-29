class Fila<T>{
    private<T>No primeiroNo;
    private<T>No ultimoNo;
    private String nomeFila;

    public  fila(){
        this("fila");
    }

    public Fila(String nomeFila){
        this.nomeFila=nomeFila;
        this.primeiroNo=null;
        this.ultimoNo=null;
    }

   public void enfileirar(T dado){
    No<T> novoNo = new No<T>(dado);
    if(ultimoNo==null){
        primeiroNo=ultimoNo=novoNo;
    }else{
        ultimoNo=setNextNo(novoNo);
        ultimoNo=novoNo;
    }

   }

   public T desenfileirar(){
    if(primeiroNo==null){
        System.out.Println("lista vazia");
        return null;
    }
        T dado= primeiroNo.getDado();
        primeiroNo=primeiroNo.getNextNo();


        if(primeiroNo==null){
            ultimoNo=null;
        }
        return dado;
        
        public void imprimirFila(){
            if(primeiroNo==null){
                System.out.Println("lista vazia" );
                return null
            }else{
                System.out.Println("Dados da fila %s \n"+this.nomeFila);
                No<T> aux = primeiroNo;
                while(aux != null){
                    System.ou.println("-%\n",aux.getDado());
                    aux=aux.nextNo();
                }
            }
        }
    

   }
}