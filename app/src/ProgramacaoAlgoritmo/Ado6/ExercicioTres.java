package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorValor = Double.MIN_VALUE;
        double menorValor = Double.MAX_VALUE;
        boolean validacao = false;

        while (true) {
            double temperaturaDigitada = input.nextDouble();

            if (temperaturaDigitada == 0) {
                break;
            }

            if (temperaturaDigitada < -50 || temperaturaDigitada > 60) {
                System.out.println("temperatura inválida");
            } else {
                if (temperaturaDigitada > maiorValor) {
                    maiorValor = temperaturaDigitada;
                }
                if (temperaturaDigitada < menorValor) {
                    menorValor = temperaturaDigitada;
                }
                validacao = true;
            }
        }

        if (validacao) {
            System.out.printf("Maior temperatura: %d\n", (int) maiorValor);
            System.out.printf("Menor temperatura: %d", (int) menorValor);
        }

        input.close();
    }
}