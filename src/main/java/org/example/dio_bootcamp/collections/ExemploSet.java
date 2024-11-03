import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa joao = new Pessoa(1l, "Joao");
        pessoas.add(joao);

        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome()+" " + pessoa.getId());
        }

        System.out.println(".");
        boolean addd = pessoas.add(new Pessoa(1l, "Joao"));
        if (addd){
            System.out.println("Adicionou");
        } else {
            System.out.println("Não adicionou");
        }

        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome()+" " + pessoa.getId());
        }
    }
}
