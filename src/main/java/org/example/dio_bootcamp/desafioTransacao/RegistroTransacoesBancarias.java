import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definição da classe Transacao
class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return (tipo == 'D' || tipo == 'd' ? "Depósito" : "Saque") + " de " + valor;
    }
}

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial da conta
        System.out.print("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Lê a quantidade total de transações
        System.out.print("Quantas transações deseja realizar? ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para cada transação
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê o tipo de transação (D para depósito ou S para saque)
            System.out.print("Digite 'D' para depósito ou 'S' para saque: ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Lê o valor da transação
            System.out.print("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Cria um objeto Transacao e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Atualiza o saldo conforme o tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final da conta
        System.out.println("\nSaldo final da conta: " + saldo);

        // Exibe as transações realizadas usando Stream API
        System.out.println("\nTransações realizadas:");
        transacoes.stream()
                .map(Transacao::toString) // Converte cada transação em uma string formatada
                .forEach(System.out::println); // Imprime cada transação no console

        scanner.close();
    }
}
