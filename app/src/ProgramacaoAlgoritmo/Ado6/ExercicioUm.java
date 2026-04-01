package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*  Implemente um programa que escreva no terminal a tabuada de um
        número informado pelo usuário.*/

        System.out.println("Digite um número para saber a taboada dele:");
        int n1 = input.nextInt();

        for (int i = 0; i < 11; i++) {
            int calculo = n1 * i;
            System.out.printf("%d x %d : %d\n", n1, i, calculo);
        }
    }
}