public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        this("",0);
    }

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void SetNome(String nome){
        this.nome=nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void SetIdade(int idade){
        this.idade=idade;
    }

    @Override
    public String toString(){
        return "Nome: "+ getNome() + ",Idade:" + getIdade();
    }
}