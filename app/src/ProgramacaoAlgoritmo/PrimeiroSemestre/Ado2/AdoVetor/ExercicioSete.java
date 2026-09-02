package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] transacoes = new double[1000];
        int indice = 0;

        System.out.println("Digite as transações (0 para cancelar, -1 para sair):");

        while (true) {
            double valor = input.nextDouble();

            if (valor == -1) {
                break;
            }
            if (valor == 0) {
                if (indice > 0) {
                    indice--;
                    System.out.println("Última transação cancelada.");
                } else {
                    System.out.println("Nenhuma transação para cancelar.");
                }
            } else {
                transacoes[indice] = valor;
                indice++;
            }
        }

        double saldoFinal = 0;
        for (int i = 0; i < indice; i++) {
            saldoFinal += transacoes[i];
        }

        System.out.printf("Saldo final: %.2f\n", saldoFinal);
    }
}