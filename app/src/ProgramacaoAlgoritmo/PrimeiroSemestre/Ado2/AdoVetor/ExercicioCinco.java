package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LEITURA DA PALAVRA SECRETA
        System.out.println("Digite a palavra secreta:");
        String palavraLida = input.next().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        // TRANSFORMA A PALAVRA EM VETOR DE CHAR
        char[] secreta = palavraLida.toCharArray();
        char[] descoberta = new char[secreta.length];

        // PREENCHE O VETOR AUXILIAR COM UNDERLINES
        Arrays.fill(descoberta, '_');

        int erros = 0;
        int acertos = 0;
        boolean ganhou = false;

        while (erros < 7 && !ganhou) {
            System.out.print("Estado: ");
            for (char c : descoberta) {
                System.out.print(c + " ");
            }

            System.out.println("\nErros: " + erros);
            System.out.println("Digite uma letra:");
            char letraInformada = input.next().toUpperCase().charAt(0);

            boolean encontrou = false;
            for (int i = 0; i < secreta.length; i++) {
                if (secreta[i] == letraInformada) {
                    if (descoberta[i] == '_') {
                        descoberta[i] = letraInformada;
                        acertos++;
                    }
                    encontrou = true;
                }
            }

            if (!encontrou) {
                erros++;
            }

            if (acertos == secreta.length) {
                ganhou = true;
            }
        }

        // RESULTADO FINAL
        if (ganhou) {
            for (char c : descoberta) System.out.print(c + " ");
            System.out.println("\nParabéns! Você descobriu a palavra.");
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraLida);
        }
    }
}