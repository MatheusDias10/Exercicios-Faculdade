package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java
         * que a partir da altura e do peso de uma
         * pessoa, calcule o IMC e avalie a faixa
         * correspondente a tabela ao lado. Ao
         * final, apresente o IMC e a situação.
         */

        System.out.println("Digite sua altura:");
        double altura = input.nextDouble();

        System.out.println("Digite seu peso:");
        double peso = input.nextDouble();

        double imc = peso / (altura * altura);
        String situacao = "";

        if (imc >= 40){
            situacao = "Obesidade Grau 3";
        } else if (imc >= 35){
            situacao = "Obesidade Grau 2";
        } else if (imc >= 30){
            situacao = "Obesidade Grau 1";
        } else if (imc >= 25){
            situacao = "Sobrepeso";
        } else if (imc >= 18.5){
            situacao = "Peso Normal";
        } else if (imc < 0){
            System.out.println("Não é permitido valores negativos.");
            System.exit(0);
        } else {situacao = "Abaixo do peso";}

        System.out.printf("Seu IMC é %.2f\n", imc);
        System.out.printf("Sua classificação é %s", situacao);

        input.close();
    }
}
