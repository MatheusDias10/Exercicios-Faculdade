package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que escreva uma mensagem de
         * confirmação de envio a partir do dia, dia da semana (em número),
         * mês (em número) e ano, informados pelo usuário.
         */

        System.out.println("Qual o dia atual em números");
        int diaAtual = input.nextInt();

        System.out.println("Qual o dia da semana (0 a 6):");
        int diaNum = input.nextInt();

        System.out.println("Qual o mês atual (0 a 12):");
        int mesNum = input.nextInt();

        System.out.println("Qual o ano atual:");
        int anoAtual = input.nextInt();

        // Dia semana
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

        // Mes
        String mesAno = "";

        if (mesNum == 1) {
            mesAno = "Janeiro";
        } else if (mesNum == 2) {
            mesAno = "Fevereiro";
        } else if (mesNum == 3) {
            mesAno = "Março";
        } else if (mesNum == 4) {
            mesAno = "Abril";
        } else if (mesNum == 5) {
            mesAno = "Maio";
        } else if (mesNum == 6) {
            mesAno = "Junho";
        } else if (mesNum == 7) {
            mesAno = "Julho";
        } else if (mesNum == 8) {
            mesAno = "Agosto";
        } else if (mesNum == 9) {
            mesAno = "Setembro";
        } else if (mesNum == 10) {
            mesAno = "Outubro";
        } else if (mesNum == 11) {
            mesAno = "Novembro";
        } else if (mesNum == 12) {
            mesAno = "Dezembro";
        } else {
            mesAno = "Mês inválido.";
        }

        System.out.printf("Enviado %s, %d de %s de %d",
                diaSemana, diaAtual, mesAno, anoAtual);
        input.close();

        // exercicios usando if e else, mas poderia ser feito com Switch Case ou Arrays.
    }
}
