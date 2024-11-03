package desafio.controle.de.fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        validarParametros(parametroUm, parametroDois); // Valide antes de contar

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i <= contagem; i++) { // Imprima do primeiro ao segundo parâmetro
            int numeroAtual = parametroUm + i;
            System.out.println("Imprimindo o número " + numeroAtual);
        }
    }

    private static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}