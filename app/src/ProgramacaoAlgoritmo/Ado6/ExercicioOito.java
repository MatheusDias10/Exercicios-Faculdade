package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        int base = input.nextInt();

        System.out.print("Altura: ");
        int altura = input.nextInt();

        if (base <= 0 || altura <= 0) {
            System.out.println("Retângulo inválido");
        }
        else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }

        input.close();

    }
}