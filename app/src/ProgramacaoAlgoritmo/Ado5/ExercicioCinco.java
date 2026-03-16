package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que informe qual a situação de
         * um candidato de vestibular a partir da nota que ele tirou, da nota de
         * corte e da nota mínima para aprovação. Considere as regras abaixo:
         */

        System.out.println("Digite a nota do candidato:");
        double nota = input.nextDouble();

        System.out.println("Digite a nota de corte:");
        double notaCorte = input.nextDouble();

        System.out.println("Digite a nota mínima para aprovação:");
        double notaAprovacao = input.nextDouble();

        String resultado = "";

        if (nota < notaCorte) {
            resultado = "Candidato não passou";
        } else if (nota >= notaAprovacao) {
            resultado = "Candidato aprovado";
        } else {
            resultado = "Candidato está na lista de espera";
        }

        System.out.println(resultado);

        input.close();
    }
}
