package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que informe a situação de um
         * orçamento familiar baseado no total de ganhos e gastos. Se o total
         * de ganhos for maior ou igual ao total de gastos, deve ser exibida a
         * mensagem: "Você está dentro do orçamento!", senão "Você
         * está fora do orçamento! Não gaste mais!"
         */

        System.out.println("Qual o valor total de ganhos:");
        double ganhos = input.nextDouble();

        System.out.println("Qual foi o total de gastos:");
        double gastos = input.nextDouble();

        String situacao = "";

        if (ganhos >= gastos){
            situacao = "Você está dentro do orçamento";
        } else if (ganhos < gastos) {
            situacao = "Você está fora do orçamento! Não gaste mais!";
        } else {
            situacao = "Erro! Dados inseridos de maneira incorreta.";
        }

        System.out.println(situacao);

        input.close();
    }
}
