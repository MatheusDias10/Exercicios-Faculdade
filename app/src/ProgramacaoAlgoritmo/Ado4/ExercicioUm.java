package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que calcule o total a se pagar pela compra
         * de ingressos de cinema sabendo que cada ingresso custa R$ 28,50. O usuário
         * deve informar o tipo dos ingressos (Meia ou Inteira) e a quantidade de
         * ingressos.
         */

        System.out.println("A entrada vai ser meia ou inteira: ");
        String entrada = input.nextLine();

        System.out.println("Quantos ingressos: ");
        int ingressos = input.nextInt();

        double valorIngressos = 28.50 * ingressos;

        if (entrada.equalsIgnoreCase("meia")){
            valorIngressos = valorIngressos / 2;
        } else if (entrada.equalsIgnoreCase("inteira")) {
            // Nada a fazer, valorIngressos já está correto
        } else {
            System.out.println("Tipo de ingresso inválido.");
            System.exit(0);
        }

        System.out.printf("O total a pagar é R$ %.2f", valorIngressos);

        input.close();
    }
}