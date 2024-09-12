public class ListaDupla<T>{
    private String nomeLista;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanho;

    public ListaDupla(){
        this("lista duplamente encadeada");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista=nomeLista;
        this.primeiroNo=null;
        this.ultimoNo=null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,0);
        if(primeiroNo==null){
            primeiroNo=ultimoNo=novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo=novoNo;
        }
        atualizaIndices();
        tamanho++;
    }

    public void addMeio(T dado, int posicao){
        if (posicao<= 0){
            addInicio(dado);
            return;
        }
        if(posicao >= tamanho){
            addFinal(dado);
            return;
        }
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,posicao);
        NoDuplo<T> atual= primeiroNo;
        int indice =0;
        while ( atual != null&& indice < posicao){
            atual = atual.getProximoNo();
            indice++;
        }

        NoDuplo<T> anterior = atual.getAnteriorNo();
        novoNo.setProximoNo(atual);
        novoNo.setAnteriorNo(anterior);
        if(anterior!= null){
            anterior.setProximoNo(novoNo);

        }else{
            primeiroNo=novoNo;
        }
        atual.setAnteriorNo(novoNo);
        atualizaIndices();
        tamanho++;
    }

    public void addFinal( T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado,tamanho);
        if(ultimoNo==null){
            primeiroNo=ultimoNo=novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo=novoNo;
        }
        tamanho++;
    }

    public void removeInicio() {
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Dado: " + primeiroNo.getDado() + " removido da lista.");
            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setAnteriorNo(null);
            } else {
                ultimoNo = null;
            }
            atualizaIndices();
            tamanho--;
        }
    }

    public void removeMeio(int posicao) {
        if (posicao <= 0) {
            removeInicio();
            return;
        }
        if (posicao >= tamanho - 1) {
            removeFinal();
            return;
        }
        NoDuplo<T> atual = primeiroNo;
        int indice=0;
        while(atual!= null && indice < posicao){
            atual = atual.getProximoNo();
            indice++;
        }

        NoDuplo<T> anterior = atual.getAnteriorNo();
        NoDuplo<T> proximo = atual.getProximoNo();
        if(anterior != null){
            anterior.setAnteriorNo(proximo);

        }
        if(proximo != null){
            proximo.setAnteriorNo(anterior;)
        }
        System.out.println("Dado: " + atual.getDado() + " removido da lista.");
        atualizaIndices();
        tamanho--;
    }

    public void removeFinal() {
        if (ultimoNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Dado: " + ultimoNo.getDado() + " removido da lista.");
            ultimoNo = ultimoNo.getAnteriorNo();
            if (ultimoNo != null) {
                ultimoNo.setProximoNo(null);
            } else {
                primeiroNo = null;
            }
            tamanho--;
        }
    }

    private void atualizaIndices() {
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

    public void imprimeLista(){
        if(primeiroNo==null){
            System.out.println("Lista vazia");

        }else{
            System.out.print("dados da lista %s:\n",nomeLista);
            NoDuplo<T> aux=primeiroNo;
            while(aux!=null){
                System.out.println("%s",aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }
}