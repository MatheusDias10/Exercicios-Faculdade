package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que verifique se uma pessoa está acima do
         * peso ideal a partir de seu peso e altura, bases para o cálculo do IMC
         * (pesquise a
         * fórmula do IMC).
         */

        double peso, altura, imc;

        System.out.println("Digite seu peso:");
        peso = input.nextDouble();

        System.out.println("Digite sua altura:");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        boolean acimaDoPeso = imc >= 25;

        System.out.printf("Seu IMC é %.2f\n", imc);
        System.out.printf("Está acima do peso ideal? %b%n", acimaDoPeso);

        input.close();

    }
}
