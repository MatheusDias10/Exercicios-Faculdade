package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que
         * calcule o valor da mensalidade de
         * um aluno de faculdade de tecnologia, a
         * partir da sigla do curso, se é isento
         * (sim ou não) e do desconto em (%) que
         * ele possui. Ao lado está o valor da
         * mensalidade para cada curso:
         */

        System.out.println("Digite a sigla do curso:");
        String curso = input.next();

        System.out.println("O aluno é isento? (true/false):");
        boolean isento = input.nextBoolean();

        System.out.println("Digite o percentual de desconto:");
        double desconto = input.nextDouble();

        double mensalidade = 0;

        if (curso.equalsIgnoreCase("SI")) {
            mensalidade = 550;
        } else if (curso.equalsIgnoreCase("ADS")) {
            mensalidade = 750;
        } else if (curso.equalsIgnoreCase("CS")) {
            mensalidade = 1150;
        } else if (curso.equalsIgnoreCase("EC")) {
            mensalidade = 1300;
        } else if (curso.equalsIgnoreCase("ES")) {
            mensalidade = 950;
        }

        if (isento) {
            mensalidade = 0;
        } else {
            mensalidade = mensalidade - (mensalidade * desconto / 100);
        }

        System.out.printf("Valor da mensalidade: %.2f\n", mensalidade);

        input.close();
    }
}
