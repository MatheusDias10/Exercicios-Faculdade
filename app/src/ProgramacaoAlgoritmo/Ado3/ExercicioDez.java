package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que verifique se o volume de um cilindro
         * poderia
         * ser transferido para outro cilindro. O volume do cilindro pode ser calculado
         * pela
         * fórmula: V = π . r2
         * . h. O programa deve receber o diâmetro e a altura dos dois
         * cilindros.
         */

        System.out.println("Digite o diâmetro do primeiro cilindro: ");
        double diametro1 = input.nextDouble();

        System.out.println("Digite a altura do primeiro cilindro: ");
        double altura1 = input.nextDouble();

        System.out.println("Digite o diâmetro do segundo cilindro: ");
        double diametro2 = input.nextDouble();

        System.out.println("Digite a altura do segundo cilindro: ");
        double altura2 = input.nextDouble();

        double raio1 = diametro1 / 2;
        double raio2 = diametro2 / 2;

        double volume1 = Math.PI * Math.pow(raio1, 2) * altura1;
        double volume2 = Math.PI * Math.pow(raio2, 2) * altura2;

        boolean podeTransferir = volume1 <= volume2;

        System.out.printf("O primeiro cilindro tem volume de %.2f\n", volume1);
        System.out.printf("O segundo cilindro tem volume de %.2f\n", volume2);
        System.out.printf("É possível transferir o primeiro para o segundo? %b", podeTransferir);

        input.close();
    }
}
