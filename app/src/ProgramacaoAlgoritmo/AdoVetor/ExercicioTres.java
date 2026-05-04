package ProgramacaoAlgoritmo.AdoVetor;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LEITURA DOS DADOS INICIAIS
        System.out.println("Nome do projeto: ");
        String nomeProjeto = input.nextLine();

        System.out.println("Quantidade de doações: ");
        int qtdDoacoes = input.nextInt();

        System.out.println("Valor da meta: ");
        double meta = input.nextDouble();

        double[] doacoes = new double[qtdDoacoes];

        // LENDO AS DOAÇÕES E GUARDANDO NO VETOR
        for (int i = 0; i < doacoes.length; i++) {
            System.out.printf("Valor da %dª doação: ", i + 1);
            doacoes[i] = input.nextDouble();
        }

        // CALCULANDO TOTAL E MAIOR DOAÇÃO
        double totalArrecadado = 0;
        double maiorDoacao = 0;

        for (double valor : doacoes) {
            totalArrecadado += valor;

            if (valor > maiorDoacao) {
                maiorDoacao = valor;
            }
        }

        // EXIBINDO O RESUMO
        System.out.println("Projeto: " + nomeProjeto);

        System.out.print("Doações recebidas: ");
        for (int i = 0; i < doacoes.length; i++) {
            System.out.print(doacoes[i] + (i == doacoes.length - 1 ? "" : ", "));
        }

        System.out.printf("\nTotal arrecadado: %.2f\n", totalArrecadado);
        System.out.printf("Maior doação: %.2f\n", maiorDoacao);

        if (totalArrecadado >= meta) {
            System.out.println("Situação: Meta atingida!");
        } else {
            System.out.println("Situação: Meta não atingida");
        }
    }
}