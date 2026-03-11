package ProgramacaoAlgoritmo.Ado2;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para calcular o total de uma venda de açaí a
         * partir da quantidade de açaís comprados, sabendo que o estabelecimento
         * oferece
         * um tamanho único para o açaí no valor de R$ 13,50
         */

        System.out.println("Quantos açai você deseja pedir:");
        double quantPedidos = input.nextDouble();

        double totalPagar = 13.50 * quantPedidos;

        System.out.printf("Total à pagar é R$ %.2f", totalPagar);

        input.close();
    }
}
