package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que informe a classificação de
         * um aluno a partir de 3 notas e da quantidade de faltas. O aluno já
         * será considerado reprovado se a quantidade de faltas for maior que
         * 30. A tabela abaixo apresenta as regras para os intervalos da média:
         */

        System.out.println("Digite sua primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = input.nextDouble();

        System.out.println("Digite sua terceira nota:");
        double nota3 = input.nextDouble();

        System.out.println("Digite a quantidade de faltas:");
        int quantFaltas = input.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;
        String situacao = "";

        if (quantFaltas > 30){
            situacao = "Reprovado";
        } else if (media >= 8){
            situacao = "Aprovado com sucesso";
        } else if (media >= 6){
            situacao = "Aprovado";
        } else if (media >= 3){
            situacao = "Recuperação";
        } else if (media == 0){
            situacao = "Desistente";
        } else if (media < 3){
            situacao = "Reprovado";
        }

        System.out.printf("Situação do Aluno: %s", situacao);
        input.close();
    }
}