import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1l,"João"));
        Pessoa a = pessoas.get(0);


        for(Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println(".");
        pessoas.add(a);

        for(Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }

}
