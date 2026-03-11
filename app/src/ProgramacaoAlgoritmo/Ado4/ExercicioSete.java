package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java
         * que a partir da temperatura, avalie a
         * situação da pessoa conforme a
         * tabela ao lado. Ao final, apresente a
         * classificação.
         */

        System.out.println("Digite a temperatura ambiente:");
        double temperatura = input.nextDouble();
        String situacao = "";

        if (temperatura >= 41){
            situacao = "Hipertermia";
        } else if (temperatura >= 39.6) {
            situacao = "Febre Alta";
        } else if (temperatura >= 37.6) {
            situacao = "Febre";
        } else if (temperatura >= 36) {
            situacao = "Normal";
        } else {situacao = "Hipotermia";}

        System.out.printf("A situação para sua temperatura é %s", situacao);
        input.close();
    }
}
