package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que verifique se um pedestre pode atravessar
         * a rua a partir da cor do semáforo.
         */

        System.out.println("Digite a cor do semáforo: ");
        String cor = input.nextLine();

        boolean podeAtravessar = cor.equalsIgnoreCase("vermelho");

        System.out.printf("Pode atravessar? %b%n", podeAtravessar);

        input.close();
    }
}
