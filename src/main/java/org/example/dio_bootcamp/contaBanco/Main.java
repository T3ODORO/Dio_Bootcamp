import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número conta: ");
        int numero1 = scan.nextInt();
        conta.setNumero(numero1);

        System.out.println("Digite o número da sua agencia: ");
        int agencia1 = scan.nextInt();
        conta.setNumero(agencia1);

        System.out.println("Nome do cliente: ");
        String nome1 = scan.next();
        conta.setNome_cliente(nome1);

        System.out.println("Informe seu saldo: ");
        int saldo1 = scan.nextInt();
        conta.setSaldo(saldo1);

        System.out.println(conta.getNumero());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNome_cliente());
        System.out.println(conta.getSaldo());
    }
}