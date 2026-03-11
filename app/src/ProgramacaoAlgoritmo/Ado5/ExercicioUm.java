package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que informe o tipo do triângulo a
         * partir do tamanho de seus três lados. O triângulo pode ser Isósceles,
         * Escaleno ou Equilátero.
         */

        System.out.println("Digite o tamanho de um do lados do triangulo:");
        double lado1 = input.nextDouble();

        System.out.println("Digite o tamanho de um do lados do triangulo:");
        double lado2 = input.nextDouble();

        System.out.println("Digite o tamanho de um do lados do triangulo:");
        double lado3 = input.nextDouble();

        String situacao = "";

        if (lado1 == lado2 && lado2 == lado3){
            situacao = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            situacao = "Isósceles";
        } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
            situacao = "Escaleno";
        } else {
            System.out.println("Dados inseridos de maneira incorreta.");
            System.exit(0);
        }

        System.out.printf("Esse é um triângulo %s", situacao);
        input.close();
    }
}