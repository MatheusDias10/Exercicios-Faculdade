package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que escreva o dia da semana
         * por extenso a partir do número do dia, sabendo que a semana
         * começa no Domingo como dia zero. Se o número do dia não
         * estiver entre 0 e 6, deve ser enviada a mensagem: "Dia da
         * semana inválido".
         */

        System.out.println("Digite o dia da semana de 0 a 7:");
        int diaNum = input.nextInt();
        String diaSemana = "";

        if (diaNum == 0){
            diaSemana = "Domingo";
        } else if (diaNum == 1) {
            diaSemana = "Segunda-Feira";
        } else if (diaNum == 2) {
            diaSemana = "Terça-Feira";
        } else if (diaNum == 3){
            diaSemana = "Quarta-Feira";
        } else if (diaNum == 4) {
            diaSemana = "Quinta-Feira";
        } else if (diaNum == 5) {
            diaSemana = "Sexta-Feira";
        } else if (diaNum == 6) {
            diaSemana = "Sábado";
        } else {
            diaSemana = "Dia da semana inválido.";
        }

        System.out.println(diaSemana);

        input.close();

    }
}
