package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Altura do triângulo: ");
        int altura = input.nextInt();

        if (altura <= 0) {
            System.out.println("Triângulo inválido");

        } else {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        input.close();
    }
}