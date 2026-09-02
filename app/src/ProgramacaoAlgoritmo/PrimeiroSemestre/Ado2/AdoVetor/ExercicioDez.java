package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LEITURA DO JOGADOR A
        System.out.println("Quantidade de figurinhas do Jogador A: ");
        int qtdA = input.nextInt();
        int[] jogadorA = new int[qtdA];
        for (int i = 0; i < qtdA; i++) {
            jogadorA[i] = input.nextInt();
        }

        System.out.println("Quantidade de figurinhas do Jogador B: ");
        int qtdB = input.nextInt();
        int[] jogadorB = new int[qtdB];
        for (int i = 0; i < qtdB; i++) {
            jogadorB[i] = input.nextInt();
        }

        System.out.print("\nFigurinhas em comum: ");
        for (int i = 0; i < qtdA; i++) {
            for (int j = 0; j < qtdB; j++) {
                if (jogadorA[i] == jogadorB[j]) {
                    System.out.print(jogadorA[i] + " ");
                }
            }
        }

        int apenasA = 0;
        System.out.print("\nApenas jogador A: ");
        for (int i = 0; i < qtdA; i++) {
            boolean encontrouNoB = false;
            for (int j = 0; j < qtdB; j++) {
                if (jogadorA[i] == jogadorB[j]) {
                    encontrouNoB = true;
                    break;
                }
            }
            if (!encontrouNoB) {
                System.out.print(jogadorA[i] + " ");
                apenasA++;
            }
        }

        int apenasB = 0;
        System.out.print("\nApenas jogador B: ");
        for (int i = 0; i < qtdB; i++) {
            boolean encontrouNoA = false;
            for (int j = 0; j < qtdA; j++) {
                if (jogadorB[i] == jogadorA[j]) {
                    encontrouNoA = true;
                    break;
                }
            }
            if (!encontrouNoA) {
                System.out.print(jogadorB[i] + " ");
                apenasB++;
            }
        }

        int trocasPossiveis = 0;
        if (apenasA < apenasB) {
            trocasPossiveis = apenasA;
        } else {
            trocasPossiveis = apenasB;
        }

        System.out.println("\nQuantidade de trocas possíveis: " + trocasPossiveis);
    }
}