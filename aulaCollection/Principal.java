import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal{
    public static void main(String[]args){
        System.out.println('\u000C');
        List<Pessoa> listaPessoas = new ArreyList<Pessoa>();

        listaPessoas.add(new Pessoa("Rafael",30));
        listaPessoas.add(new Pessoa("iasmin",19));
        listaPessoas.add(new Pessoa("mirian",39));
        listaPessoas.add(new Pessoa("lilo",30));

        Iterator i = listaPessoas.iterator();
        while (i.hasNext()) {
            String pessoa = i.next().toString();
            System.out.println(pessoa);
        }

        System.out.println("*** " +listaPessoas.get(2)+ " ***");
    }
}