import java.util.Scanner;
public class principal{
    public static void main(string[]args){
        Scanner input = new Scanner (System.in);
        Pessoa obj1 = new Pessoa();
        ArreyList<Pessoa> listPessoa = new ArreyList<>();

        System.out.println("Dados de Pessoa");
        System.out.println("Nome:");

        obj1.SetNome(input.nextLine());

        System.out.println("Idade:");
        obj1.SetIdade(input.nextLine());

        //System.out.println(obj1.toString());

        listaPessoa.add(obj1);
        listaPessoa.add(new Pessoa("Jose",35));
        listaPessoa.add(new Pessoa("maria",25));

        for(Pessoa auxPessoa : listaPessoa){
            System.out.println(auxPessoa.toString());
        }


    }
}