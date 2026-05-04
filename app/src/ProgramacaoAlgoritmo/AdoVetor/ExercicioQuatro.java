package ProgramacaoAlgoritmo.AdoVetor;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de medicamentos: ");
        int qtd = input.nextInt();

        double[] farmaciaA = new double[qtd];
        double[] farmaciaB = new double[qtd];

        // ENTRADA DE DADOS - FARMÁCIA A
        System.out.println("Digite os preços da Farmácia A:");
        for (int i = 0; i < farmaciaA.length; i++) {
            farmaciaA[i] = input.nextDouble();
        }

        // ENTRADA DE DADOS - FARMÁCIA B
        System.out.println("Digite os preços da Farmácia B:");
        for (int i = 0; i < farmaciaB.length; i++) {
            farmaciaB[i] = input.nextDouble();
        }

        // CONTADORES E TOTAIS
        int maisBaratoA = 0;
        int maisBaratoB = 0;
        int mesmoPreco = 0;
        double totalA = 0;
        double totalB = 0;

        // COMPARANDO MEDICAMENTO POR MEDICAMENTO
        for (int i = 0; i < qtd; i++) {
            totalA += farmaciaA[i];
            totalB += farmaciaB[i];

            if (farmaciaA[i] < farmaciaB[i]) {
                maisBaratoA++;
            } else if (farmaciaB[i] < farmaciaA[i]) {
                maisBaratoB++;
            } else {
                mesmoPreco++;
            }
        }

        // OUTPUT DOS RESULTADOS
        System.out.println("\nFARMAZOOM");

        System.out.print("Farmácia A: ");
        for (int i = 0; i < farmaciaA.length; i++) {
            System.out.print(farmaciaA[i] + (i == farmaciaA.length - 1 ? "" : ", "));
        }

        System.out.print("\nFarmácia B: ");
        for (int i = 0; i < farmaciaB.length; i++) {
            System.out.print(farmaciaB[i] + (i == farmaciaB.length - 1 ? "" : ", "));
        }

        System.out.println("\nProdutos mais Baratos");
        System.out.println("Na Farmácia A: " + maisBaratoA);
        System.out.println("Na Farmácia B: " + maisBaratoB);
        System.out.println("Mesmo preço: " + mesmoPreco);

        System.out.println("\nTotal");
        System.out.printf("Farmácia A: R$ %.2f\n", totalA);
        System.out.printf("Farmácia B: R$ %.2f\n", totalB);

        System.out.println("\nMelhor opção");
        if (totalA < totalB) {
            System.out.println("Farmácia A");
        } else if (totalB < totalA) {
            System.out.println("Farmácia B");
        } else {
            System.out.println("Empate");
        }
    }
}