package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em
         * Java que a partir de três notas
         * informadas pelo usuário, calcule
         * a média e avalie a situação do
         * aluno. Ao final, apresente a média
         * e a situação.
         */

        System.out.println("Digite sua primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota:");
        double nota2 = input.nextDouble();

        System.out.println("Digite sua teceira nota:");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        String situacao = "";

        if (media == 0){
            situacao = "Desistente";
        } else if (media >= 8) {
            situacao = "Aprovado com sucesso.";
        } else if (media >= 6){
            situacao = "Aprovado";
        } else if (media >= 3){
            situacao = "Recuperação";
        } else if(media < 3){
            situacao = "Reprovado";
        }

        System.out.printf("A média do aluno é %.1f\n", media);
        System.out.printf("Situação: %s", situacao);

        input.close();
    }
}
