package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para verificar se dois retângulos possuem a
         * mesma área
         */

        int base1, altura1, base2, altura2;

        System.out.println("Digite a base do primeiro retângulo: ");
        base1 = input.nextInt();

        System.out.println("Digite a altura do primeiro retângulo: ");
        altura1 = input.nextInt();

        System.out.println("Digite a base do segundo retângulo: ");
        base2 = input.nextInt();

        System.out.println("Digite a altura do segundo retângulo: ");
        altura2 = input.nextInt();

        int area1 = base1 * altura1;
        int area2 = base2 * altura2;

        boolean iguais = area1 == area2;

        System.out.printf("O primeiro retângulo possui área %d.%n", area1);
        System.out.printf("O segundo retângulo possui área %d.%n", area2);
        System.out.printf("Eles são iguais? %b%n", iguais);

        input.close();
    }
}
