public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        this("",0);
    }

    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getIdade(){
        return this.idade;
    }

    public void setIdade(String idade){
        this.idade=idade;
    }

    @Override
    public String toString(){
        //concatenaçao de String
        //return "Pessoa{Nome: + getNome()+, idade: + getIdae()}"

        return String.formt
    }
}
