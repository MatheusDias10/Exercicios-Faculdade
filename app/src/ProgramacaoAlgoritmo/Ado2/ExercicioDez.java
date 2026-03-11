package ProgramacaoAlgoritmo.Ado2;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para calcular o salário líquido de um
         * funcionário, a partir de seu salário base, do bônus mensal em porcentagem e
         * do total de descontos em reais.
         */

        System.out.println("Seu salário em reais:");
        double salario = input.nextDouble();

        System.out.println("Seu bônus mensal:");
        double bonus = input.nextDouble();

        System.out.println("Qual o total de desconto em reais:");
        double desconto = input.nextDouble();

        bonus = (bonus / 100) * salario;
        salario = (salario + bonus) - desconto;

        System.out.printf("Seu salário líquido é de R$ %.2f", salario);

        input.close();
    }
}
