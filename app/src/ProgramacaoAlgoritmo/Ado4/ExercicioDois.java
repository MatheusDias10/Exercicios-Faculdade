package ProgramacaoAlgoritmo.Ado4;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que retorne uma mensagem com a
         * ação que um pedestre deve realizar ao ver a cor de seu semáforo. As
         * possíveis ações estão listadas abaixo. Se a cor for diferente das opções
         * possíveis, a função deve retornar uma mensagem com a informação:
         * "Farol inoperante"
         */

        System.out.println("Qual a cor do farol?");
        String corFarol = input.nextLine();

        String acao = "";

        if (corFarol.equalsIgnoreCase("vermelho")){
            acao = "Espere";
        } else if (corFarol.equalsIgnoreCase("verde")){
            acao = "Atravesse"; 
        } else {
            acao = "Farol inoperante";
        }

        System.out.println(acao);

        input.close();
    }
}
