package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que escreva o mês da semana por
         * extenso a partir do número do mês, sabendo que o mês de Janeiro é o
         * mês número 01. Se o número do mês não estiver entre 1 e 12, deve ser
         * enviada a mensagem: “Mês inválido".
         */

        System.out.println("Digite o mês do ano entre 0 a 12:");
        int mesNum = input.nextInt();
        String mesAno = "";

        if (mesNum == 1) {
            mesAno = "Janeiro";
        } else if (mesNum == 2) {
            mesAno = "Fevereiro";
        } else if (mesNum == 3) {
            mesAno = "Março";
        } else if (mesNum == 4) {
            mesAno = "Maio";
        } else if (mesNum == 5) {
            mesAno = "Abril";
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

        System.out.println(mesAno);
        input.close();
    }
}
