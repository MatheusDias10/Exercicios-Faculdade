package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que calcule o total a se pagar em
         * uma compra na sorveteria, a partir do total de gramas comprado. O
         * preço de 100g é R$ 3,50 mas se o total de gramas for a partir de 1kg, o
         * preço das 100g diminui 50 centavos. Se o total de gramas for menor ou
         * igual a zero, enviar a mensagem “Peso Inválido”.
         */

        System.out.println("Quantas gramas de sorvete você comprou:");
        double gramas = input.nextDouble();

        double precoGramas = gramas * 0.035;

        if (gramas >= 1000){
            precoGramas = precoGramas - 0.50;
        } else if (gramas <= 0){
            System.out.println("Peso inválido.");
            System.exit(0);
        }

        System.out.printf("O total a pagar é R$ %.2f", precoGramas);
        input.close();
    }
}
