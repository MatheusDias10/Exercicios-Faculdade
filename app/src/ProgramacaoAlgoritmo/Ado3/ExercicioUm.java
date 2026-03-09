package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para verificar se uma pessoa está com febre,
         * sabendo que é considerado febre a partir de 37.3 graus.
         */

        System.out.println("Informe sua temperatura:");
        double temperatura = input.nextDouble();

        boolean febre = temperatura >= 37.5;

        System.out.printf("Você está com febre: %s", febre);

        input.close();
    }
}
