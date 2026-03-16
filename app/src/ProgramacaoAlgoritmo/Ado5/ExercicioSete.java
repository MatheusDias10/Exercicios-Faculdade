package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que calcule o total a se pagar na
         * compra de ingressos de cinema, a partir da quantidade de ingressos
         * Inteiras e Meias, do dia da semana que será passado o filme e se o filme é
         * nacional. O valor do ingresso é R$ 28,50. Considere que:
         * • Se o ingresso for para quarta-feira, o preço do ingresso é único R$ 14,25.
         * • Se for um filme nacional, o preço do ingresso é único R$ 5,00.
         * • O desconto para filmes nacionais tem prioridade sobre o desconto de
         * quarta-feira,
         * ou seja, os dois descontos não podem acontecer ao mesmo tempo.
         */

        System.out.println("Digite a quantidade de ingressos inteiros:");
        int inteiros = input.nextInt();

        System.out.println("Digite a quantidade de ingressos meia:");
        int meias = input.nextInt();

        input.nextLine(); // limpar buffer

        System.out.println("Digite o dia da semana:");
        String dia = input.nextLine();

        System.out.println("O filme é nacional? (true/false):");
        boolean nacional = input.nextBoolean();

        double preco = 28.50;

        if (nacional) {
            preco = 5.00;
        } 
        else if (dia.equalsIgnoreCase("quarta-feira")) {
            preco = 14.25;
        }

        double total = (inteiros * preco) + (meias * (preco / 2));

        System.out.printf("O total a se pagar pelos ingressos é R$ %.2f\n", total);

        input.close();
    }
}
