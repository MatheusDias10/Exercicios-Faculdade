package ProgramacaoAlgoritmo.Ado2;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Implementar um programa em Java para converter reais em dólar (1$ -> R$ 5,16). */

        System.out.println("Digite o valor em reais:");
        double valorReais = input.nextDouble();

        double valorDolar = valorReais / 5.25;

        System.out.printf("%.2f", valorDolar);

        input.close();
    }
}
