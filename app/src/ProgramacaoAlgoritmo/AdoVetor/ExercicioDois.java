package ProgramacaoAlgoritmo.AdoVetor;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LEITURA DA QUANTIDADE DE MESES
        System.out.println("Digite a quantidade de meses:");
        int meses = input.nextInt();

        double[] faturamento = new double[meses];

        // PREENCHENDO O VETOR
        for (int i = 0; i < faturamento.length; i++) {
            System.out.printf("Faturamento do mês %d: ", i + 1);
            faturamento[i] = input.nextDouble();
        }

        // VARIÁVEIS PARA CONTROLE DA SITUAÇÃO
        boolean cresceu = true;
        boolean caiu = true;

        // COMPARANDO CADA MÊS COM O ANTERIOR
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < faturamento[i - 1]) {
                cresceu = false;
            }
            if (faturamento[i] > faturamento[i - 1]) {
                caiu = false;
            }
        }

        // OUTPUT DOS RESULTADOS
        System.out.print("Faturamento informado: ");
        for (int i = 0; i < faturamento.length; i++) {
            System.out.print(faturamento[i] + (i == faturamento.length - 1 ? "" : ", "));
        }

        // VERIFICAÇÃO DA SITUAÇÃO FINAL
        System.out.print("\nSituação: ");
        if (cresceu && caiu) {
            System.out.println("Constante");
        } else if (cresceu) {
            System.out.println("Crescimento");
        } else if (caiu) {
            System.out.println("Queda");
        } else {
            System.out.println("Sem padrão");
        }
    }
}